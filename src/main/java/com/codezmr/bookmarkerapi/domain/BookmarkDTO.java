package com.codezmr.bookmarkerapi.domain;

import lombok.*;

import java.time.Instant;

@Setter
@Getter
@AllArgsConstructor
public class BookmarkDTO {
    private Long id;
    private String title;
    private String url;
    private Instant createdAt;
}
