package org.example.service;

import org.example.model.PostEntity;

import java.util.List;
import java.util.UUID;

public interface PostService {

    PostEntity savePost(PostEntity entity);

}
