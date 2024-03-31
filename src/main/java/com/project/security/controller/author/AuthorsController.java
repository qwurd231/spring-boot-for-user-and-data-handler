package com.project.security.controller.author;

import com.project.security.entity.author.Author;
import com.project.security.service.author.AuthorsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorsController {
    private final AuthorsService authorsService;

    public AuthorsController(AuthorsService authorsService) {
        this.authorsService = authorsService;
    }

    @GetMapping("/author/{author}")
    public ResponseEntity<?> getAuthorsByAuthor(@PathVariable String author) {
        if (author == null || author.isEmpty()) {
            return ResponseEntity.badRequest().body("Invalid Parameters");
        }

        Author authors = authorsService.getAuthorsByAuthor(author);
        if (authors != null) {
            return ResponseEntity.ok(authors);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}


