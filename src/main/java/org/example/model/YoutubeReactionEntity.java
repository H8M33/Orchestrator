package org.example.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Table(name = "youtube_reactions")
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class YoutubeReactionEntity extends AbstractEntity{

    @Column(name = "content_type", nullable = false)
    private String contentType;

    @Column(name = "content_id", nullable = false)
    private Long contentId;

    @Column(name = "reaction_id", nullable = false)
    private Integer reactionId;
}