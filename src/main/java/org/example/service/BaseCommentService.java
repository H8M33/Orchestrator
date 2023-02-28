package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.model.CommentsEntity;
import org.example.repository.CommentRepository;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BaseCommentService implements CommentService{

    private final CommentRepository repository;

    @Override
    public CommentsEntity commentSave(CommentsEntity entity) {
        return repository.save(entity);
    }

    @Override
    public CommentsEntity findComment(String id) {
        return repository.findById(id).get();
    }
}
