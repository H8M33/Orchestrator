package org.example.service;

import org.example.model.ReactionEntity;

public interface ReactionService {

    ReactionEntity saveReaction(ReactionEntity entity);

    ReactionEntity findReaction(String id);

}
