package org.example.service;

import org.example.model.PostEntity;

public interface PostService {

    PostEntity savePost(PostEntity entity);

    PostEntity findPost(String id);

}
