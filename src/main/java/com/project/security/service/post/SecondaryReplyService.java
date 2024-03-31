package com.project.security.service.post;

import com.project.security.entity.post.SecondaryReply;
import com.project.security.repository.post.SecondaryReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecondaryReplyService {
    private final SecondaryReplyRepository repository;

    @Autowired
    public SecondaryReplyService(SecondaryReplyRepository repository) {
        this.repository = repository;
    }

    public SecondaryReply save(SecondaryReply secondaryReply) {
        return repository.save(secondaryReply);
    }

    public List<SecondaryReply> getAllSecondaryReplies() {
        return repository.findAll();
    }

    public List<SecondaryReply> getSecondaryReplyByAuthor(String author) {
        return repository.findSecondaryReplyByAuthor(author);
    }

}

