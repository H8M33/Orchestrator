package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.model.PostEntity;
import org.example.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BasePostService implements PostService{

    private final PostRepository repository;

    @Override
    public PostEntity savePost(PostEntity entity) {
        return repository.save(entity);
    }

    @Override
    public PostEntity findPost(String id) {
        return repository.findById(id).get();
    }
}
