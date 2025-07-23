package com.example.content_calender.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
@Table("content")
public record Content(
        @Id Long id,
        String title,
        String dest,
        Status status,
        Type content_type,
        LocalDateTime date_created,
        LocalDateTime date_updated,
        String url
) {
}
