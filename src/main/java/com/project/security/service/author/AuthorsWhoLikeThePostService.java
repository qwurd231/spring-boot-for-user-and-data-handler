package com.project.security.service.author;

import com.project.security.entity.author.AuthorsWhoLikeThePost;
import com.project.security.repository.author.AuthorsWhoLikeThePostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorsWhoLikeThePostService {
    private final AuthorsWhoLikeThePostRepository authorsWhoLikeThePostRepository;

    public AuthorsWhoLikeThePostService(AuthorsWhoLikeThePostRepository authorsWhoLikeThePostRepository) {
        this.authorsWhoLikeThePostRepository = authorsWhoLikeThePostRepository;
    }

    public AuthorsWhoLikeThePost save(AuthorsWhoLikeThePost authorsWhoLikeThePost) {
        return authorsWhoLikeThePostRepository.save(authorsWhoLikeThePost);
    }

    public List<AuthorsWhoLikeThePost> getAllAuthorsWhoLikeThePost() {
        return authorsWhoLikeThePostRepository.findAll();
    }

    public List<AuthorsWhoLikeThePost> getAuthorsWhoLikeThePostByPostid(long postid) {
        return authorsWhoLikeThePostRepository.findAuthorsWhoLikeThePostByPostid(postid);
    }

    public List<AuthorsWhoLikeThePost> getAuthorsWhoLikeThePostByAuthor(String author) {
        return authorsWhoLikeThePostRepository.findAuthorsWhoLikeThePostByAuthor(author);
    }

    public List<AuthorsWhoLikeThePost> getAuthorsWhoLikeThePostByAuthorsWhoLikeThePost(String authorsWhoLikeThePost) {
        return authorsWhoLikeThePostRepository.findAuthorsWhoLikeThePostByAuthorsWhoLikeThePost(authorsWhoLikeThePost);
    }

    // Add other methods as needed
}