package org.example.rabbitlistener;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.CommentDTO;
import org.example.dto.event.WebcrawlerMessage;
import org.example.model.CommentsEntity;
import org.example.model.PostEntity;
import org.example.model.ReactionEntity;
import org.example.service.*;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class TelegramListener {

    PostService postService;
    BloggerService bloggerService;
    CommentService commentService;
    ReactionService reactionService;
    ReferralLinkService referralLinkService;

    @RabbitListener(queues = {"${service-rabbit.telegram-routing-key}"}, ackMode = "AUTO")
    public void getMessage(WebcrawlerMessage[] messageArray){
        log.info("TG: {}", messageArray);
        for (WebcrawlerMessage message : messageArray
        ) {
            PostEntity post = postService.savePost(PostEntity.builder()
                    .id(message.getOwner_id() + "=" + message.getId())
                    .postDate(message.getDate())
                    .views(message.getView_count())
                    .text(message.getText())
                    .commentsCount(message.getComment_count())
                    .blogger(bloggerService.findBlogger(message.getOwner_id()))
                    .source("vk")
                    .build());
            for (long reaction : message.getReaction_count()
            ) {
                reactionService.saveReaction(
                        ReactionEntity.builder()
                                .contentId(post.getId())
                                .contentType("post")
                                .count(reaction)
                                .build());
            }

            for (CommentDTO comment:message.getComments()
            ) {
                commentService.commentSave(CommentsEntity.builder()
                        .post(post)
                        .text(comment.getText())
                        .build());
            }
        }
    }

}
