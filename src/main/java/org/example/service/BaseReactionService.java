package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.model.ReactionEntity;
import org.example.repository.ReactionRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BaseReactionService implements ReactionService {

    private final ReactionRepository repository;

    @Override
    public ReactionEntity saveReaction(ReactionEntity entity) {
        return repository.save(entity);
    }

    @Override
    public ReactionEntity findReaction(String id) {
        return repository.findById(id).get();
    }
}
