package org.example.service;

import org.example.model.BloggerEntity;

public interface BloggerService {

    BloggerEntity saveBlogger(BloggerEntity entity);

    BloggerEntity findBlogger(String id);
}
