package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Table(name = "vk_reactions")
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class VKReactionEntity extends AbstractEntity{

    @Column(name = "content_type", nullable = false)
    private String contentType;

    @Column(name = "content_id", nullable = false)
    private Long contentId;

    @Column(name = "reaction_id", nullable = false)
    private Integer reactionId;
}