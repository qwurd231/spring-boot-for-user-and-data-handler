package com.project.security.controller.author;

import com.project.security.entity.author.AuthorsFollowed;
import com.project.security.service.author.AuthorsFollowedService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/followers")
public class AuthorsFollowedController {
    public final AuthorsFollowedService authorsFollowedByService;

    public AuthorsFollowedController(AuthorsFollowedService authorsFollowedByService) {
        this.authorsFollowedByService = authorsFollowedByService;
    }

    @DeleteMapping
    public void deleteAuthorsFollowed(@RequestBody AuthorsFollowed authorsFollowed) {
        authorsFollowedByService.delete(authorsFollowed);
    }

    @PostMapping
    public AuthorsFollowed createAuthorsFollowed(@RequestBody AuthorsFollowed authorsFollowed) {
        return authorsFollowedByService.save(authorsFollowed);
    }

    @GetMapping("/author/{author}")
    public ResponseEntity<?> getAuthorsFollowedByByAuthor(@PathVariable String author) {
        if (author == null || author.isEmpty()) {
            return ResponseEntity.badRequest().body("Invalid Parameters");
        }

        List<AuthorsFollowed> authors = authorsFollowedByService.getAuthorsFollowedByAuthor(author);
        if (!authors.isEmpty()) {
            return ResponseEntity.ok(authors);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/authors_followed/{authors_followed}")
    public ResponseEntity<?> getAuthorsFollowedByAuthorsFollowed(@PathVariable String authors_followed) {
        if (authors_followed == null || authors_followed.isEmpty()) {
            return ResponseEntity.badRequest().body("Invalid Parameters");
        }

        List<AuthorsFollowed> authors = authorsFollowedByService.getAuthorsFollowedByAuthorsFollowed(authors_followed);
        if (!authors.isEmpty()) {
            return ResponseEntity.ok(authors);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

