package org.example.repository;

import org.example.model.ReferralLinkEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReferralLinkRepository extends JpaRepository<ReferralLinkEntity, String> {

    Optional<ReferralLinkEntity> findById(String id);
}
