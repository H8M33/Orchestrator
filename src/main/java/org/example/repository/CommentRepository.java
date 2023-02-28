package org.example.repository;

import org.example.model.CommentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentRepository extends JpaRepository<CommentsEntity, String> {
    Optional<CommentsEntity> findById(String id);
}
