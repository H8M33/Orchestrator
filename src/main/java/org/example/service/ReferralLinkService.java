package org.example.service;

import org.example.model.ReferralLinkEntity;

public interface ReferralLinkService {

    ReferralLinkEntity saveReferralLink(ReferralLinkEntity entity);

    ReferralLinkEntity findReferralLink(String id);

}
