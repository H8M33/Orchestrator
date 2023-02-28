package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.model.ReferralLinkEntity;
import org.example.repository.ReferralLinkRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BaseReferralLinkService implements ReferralLinkService{

    ReferralLinkRepository repository;

    @Override
    public ReferralLinkEntity saveReferralLink(ReferralLinkEntity entity) {
        return repository.save(entity);
    }

    @Override
    public ReferralLinkEntity findReferralLink(String id) {
        return repository.findById(id).get();
    }
}
