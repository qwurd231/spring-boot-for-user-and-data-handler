package com.project.security.controller.author;

import com.project.security.entity.author.AuthorsWhoFavoriteThePost;
import com.project.security.service.author.AuthorsWhoFavoriteThePostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors_who_favorite_the_post")
public class AuthorsWhoFavoriteThePostController {
    private final AuthorsWhoFavoriteThePostService service;

    @Autowired
    public AuthorsWhoFavoriteThePostController(AuthorsWhoFavoriteThePostService service) {
        this.service = service;
    }

    @PostMapping
    public AuthorsWhoFavoriteThePost createAuthorsWhoFavoriteThePost(@RequestBody AuthorsWhoFavoriteThePost authorsWhoFavoriteThePost) {
        return service.save(authorsWhoFavoriteThePost);
    }

    @GetMapping
    public List<AuthorsWhoFavoriteThePost> getAllAuthorsWhoFavoriteThePost() {
        return service.getAllAuthorsWhoFavoriteThePost();
    }

    @GetMapping("/postid/{postid}")
    public ResponseEntity<?> getAuthorsWhoFavoriteThePostByPostid(@PathVariable Long postid) {
        if (postid == null) {
            return ResponseEntity.badRequest().body("Invalid Parameters");
        }

        List<AuthorsWhoFavoriteThePost> authorsWhoFavoriteThePost = service.getAuthorsWhoFavoriteThePostByPostid(postid);
        if (!authorsWhoFavoriteThePost.isEmpty()) {
            return ResponseEntity.ok(authorsWhoFavoriteThePost);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/author/{author}")
    public ResponseEntity<?> getAuthorsWhoFavoriteThePostByAuthor(@PathVariable String author) {
        if (author == null) {
            return ResponseEntity.badRequest().body("Invalid Parameters");
        }

        List<AuthorsWhoFavoriteThePost> authorsWhoFavoriteThePost = service.getAuthorsWhoFavoriteThePostByAuthor(author);
        if (!authorsWhoFavoriteThePost.isEmpty()) {
            return ResponseEntity.ok(authorsWhoFavoriteThePost);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/authors_who_favorite_the_post/{authors_who_favorite_the_post}")
    public ResponseEntity<?> getAuthorsWhoFavoriteThePostByAuthorsWhoFavoriteThePost(@PathVariable String authors_who_favorite_the_post) {
        if (authors_who_favorite_the_post == null) {
            return ResponseEntity.badRequest().body("Invalid Parameters");
        }

        List<AuthorsWhoFavoriteThePost> authorsWhoFavoriteThePost = service.getAuthorsWhoFavoriteThePostByAuthorsWhoFavoriteThePost(authors_who_favorite_the_post);
        if (!authorsWhoFavoriteThePost.isEmpty()) {
            return ResponseEntity.ok(authorsWhoFavoriteThePost);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Add other CRUD operations as needed
}

