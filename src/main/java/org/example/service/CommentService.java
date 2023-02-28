package org.example.service;

import org.example.model.CommentsEntity;

public interface CommentService {

    CommentsEntity commentSave(CommentsEntity entity);

    CommentsEntity findComment(String id);

}
