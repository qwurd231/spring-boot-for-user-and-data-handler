package com.project.security.controller.post;

import com.project.security.entity.post.SecondaryReply;
import com.project.security.service.post.SecondaryReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/secondary_replies")
public class SecondaryReplyController {
    private final SecondaryReplyService service;

    @Autowired
    public SecondaryReplyController(SecondaryReplyService service) {
        this.service = service;
    }

    @PostMapping
    public SecondaryReply createSecondaryReply(@RequestBody SecondaryReply secondaryReply) {
        return service.save(secondaryReply);
    }

    @GetMapping
    public List<SecondaryReply> getAllSecondaryReplies() {
        return service.getAllSecondaryReplies();
    }

    @GetMapping("/author/{author}")
    public List<SecondaryReply> getSecondaryReplyByAuthor(@PathVariable String author) {return service.getSecondaryReplyByAuthor(author);}

    // Add other CRUD operations as needed
}

