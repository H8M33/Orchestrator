package org.example.dto.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.dto.CommentDTO;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WebcrawlerMessage {
    private Instant date;
    private String url;
    private String text;
    private long comment_count;
    private long view_count;
    private long[] reaction_count;
    private CommentDTO[] comments;
}
