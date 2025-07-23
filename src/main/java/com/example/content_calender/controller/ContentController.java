package com.example.content_calender.controller;

import com.example.content_calender.model.Content;
import com.example.content_calender.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/content")
@CrossOrigin
public class ContentController {

    private final ContentRepository repository;

    public ContentController(ContentRepository repository) {
        this.repository = repository;
    }


//     Define endpoints here, e.g., for getting all content, creating new content, etc.
//    @GetMapping("")
//    public List<Content> getAll() {
//        return repository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Content getById(@PathVariable Integer id) {
//        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found with id: " + id));
//    }
//
//    @PostMapping("")
//    public void create(@RequestBody Content c) {
//        System.out.println("Request came to controller");
//        repository.save(c);
//    }
//    @PutMapping("/{id}")
//    public void update(@RequestBody Content c, @PathVariable Integer id){
//        repository.save(c);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Integer id) {
//        repository.deleteById(id);
//    }

}
