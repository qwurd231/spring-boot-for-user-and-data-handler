package com.project.security.service.post;

import com.project.security.entity.post.Reply;
import com.project.security.repository.post.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyService {
    private final ReplyRepository repository;

    @Autowired
    public ReplyService(ReplyRepository repository) {
        this.repository = repository;
    }

    public Reply save(Reply reply) {
        return repository.save(reply);
    }

    public List<Reply> getAllReplies() {
        return repository.findAll();
    }

    public List<Reply> getReplyByAuthor(String author) {return repository.findReplyByAuthor(author);}

    public List<Reply> getReplyByAuthorAndPostid(String author, long postid) {return repository.findReplyByAuthorAndPostid(author, postid);}

}