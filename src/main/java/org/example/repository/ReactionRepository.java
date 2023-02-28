package org.example.repository;

import org.example.model.ReactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReactionRepository extends JpaRepository<ReactionEntity, Long> {

    Optional<ReactionEntity> findById(long id);
}
