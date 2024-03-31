package com.project.security.controller.post;


import com.project.security.entity.post.Post;
import com.project.security.service.post.PostsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/posts")
public class PostsController {
    private final PostsService postsService;

    public PostsController(PostsService postsService) {
        this.postsService = postsService;
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postsService.save(post);
    }

    @GetMapping("/author/{author}")
    public ResponseEntity<?> getPostByAuthor(@PathVariable String author) {
        Post post = postsService.getPostByAuthor(author);
        if (post != null) {
            return ResponseEntity.ok(post);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Parameters");
        }
    }

    @GetMapping("/postid/{postid}")
    public ResponseEntity<?> getPostByPostid(@PathVariable long postid) {
        Post post = postsService.getPostsByPostid(postid);
        if (post != null) {
            return ResponseEntity.ok(post);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Parameters");
        }
    }
}
