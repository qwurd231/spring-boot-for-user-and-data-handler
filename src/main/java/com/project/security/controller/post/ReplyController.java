package com.project.security.controller.post;

import com.project.security.entity.post.Reply;
import com.project.security.service.post.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/replies")
public class ReplyController {
    private final ReplyService service;

    @Autowired
    public ReplyController(ReplyService service) {
        this.service = service;
    }

    @PostMapping
    public Reply createReply(@RequestBody Reply reply) {
        return service.save(reply);
    }

    @GetMapping
    public List<Reply> getAllReplies() {
        return service.getAllReplies();
    }

    @GetMapping("/author/{author}")
    public List<Reply> getReplyByAuthor(@PathVariable String author) {return service.getReplyByAuthor(author);}

    @GetMapping("/{author}/{postid}")
    public List<Reply> getReplyByAuthorAndPostid(@PathVariable String author, @PathVariable long postid) {
        return service.getReplyByAuthorAndPostid(author, postid);
    }
}

