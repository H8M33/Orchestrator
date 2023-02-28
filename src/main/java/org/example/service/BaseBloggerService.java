package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.model.BloggerEntity;
import org.example.repository.BloggerRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BaseBloggerService implements BloggerService{

    BloggerRepository repository;

    @Override
    public BloggerEntity saveBlogger(BloggerEntity entity) {
        return repository.save(entity);
    }

    @Override
    public BloggerEntity findBlogger(String id) {
        return repository.findById(id).get();
    }
}
