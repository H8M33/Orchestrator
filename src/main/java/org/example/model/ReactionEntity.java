package org.example.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Table(name = "reactions")
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReactionEntity extends AbstractEntity{

    @Column(name = "content_type", nullable = false)
    private String contentType;

    @Column(name = "content_id", nullable = false)
    private String contentId;

    @Column(name = "reaction_type", nullable = false)
    private Integer reactionId;

    @Column(name = "count", nullable = false)
    private Long count;
}