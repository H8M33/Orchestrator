package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Table(name = "bloggers")
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BloggerEntity extends AbstractEntity {

    @Column(name = "channel_name", nullable = false)
    private String channelName;

    @Column(name = "channel_link", nullable = false)
    private String channelLink;

    @Column(name = "followers", nullable = false)
    private Long followers;
}
