package com.example.content_calender.model;


import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
public record Content(
        @Id
        Integer id,
        String title,
        String desc,
        Status status,
        Type type,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
