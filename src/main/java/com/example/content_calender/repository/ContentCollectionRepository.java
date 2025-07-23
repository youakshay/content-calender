package com.example.content_calender.repository;

import com.example.content_calender.model.Content;
import com.example.content_calender.model.Status;
import com.example.content_calender.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private List<Content> content = new ArrayList<>();

    public ContentCollectionRepository() {

    }

    public List<Content> findAll() {
        System.out.println("Fetching all content");
        return content;
    }

    public Optional<Content> findById(Integer id) {
        System.out.println("Fetching content with id: " + id);
        return content.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init() {
        Content c = new Content(
                1,
                "Sample Content",
                "This is a sample content description.",
                Status.ARTICLE,
                Type.PUBLISHED,
                java.time.LocalDateTime.now(),
                java.time.LocalDateTime.now(),
                ""
        );

        content.add(c);
    }

    public void save(Content c) {
        content.add(c);
        System.out.println("Content saved: " + c.title());
    }

    public void update(Content c, Integer id) {
        System.out.println("Updating content with id: " + id);
        Optional<Content> existingContent = findById(id);
        if (existingContent.isPresent()) {
            content.remove(existingContent.get());
            content.add(c);
            System.out.println("Content updated: " + c.title());
        } else {
            System.out.println("Content with id " + id + " not found for update.");
        }
    }

    public void delete(Integer id) {
        Optional<Content> existingContent = findById(id);
        if (existingContent.isPresent()) {
            content.remove(existingContent.get());
            System.out.println("Content Deleted: ");
        } else {
            System.out.println("Content with id " + id + " not found for update.");
        }
    }
}
