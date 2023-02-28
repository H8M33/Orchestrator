package org.example.repository;

import org.example.model.ReactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReactionRepository extends JpaRepository<ReactionEntity, String> {

    Optional<ReactionEntity> findById(String id);
}
