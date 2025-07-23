package com.example.content_calender.repository;

import com.example.content_calender.model.Content;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;


public interface ContentRepository extends ListCrudRepository<Content, Integer> {
    // This interface extends ListCrudRepository to provide basic CRUD operations
    // for the Content entity. No additional methods are needed here as the
    // ListCrudRepository provides all necessary methods.
}
