package com.project.security.service.author;

import com.project.security.entity.author.AuthorsWhoShareThePost;
import com.project.security.repository.author.AuthorsWhoShareThePostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorsWhoShareThePostService {
    private final AuthorsWhoShareThePostRepository authorsWhoShareThePostRepository;

    @Autowired
    public AuthorsWhoShareThePostService(AuthorsWhoShareThePostRepository authorsWhoShareThePostRepository) {
        this.authorsWhoShareThePostRepository = authorsWhoShareThePostRepository;
    }

    public AuthorsWhoShareThePost save(AuthorsWhoShareThePost authorsWhoShareThePost) {
        return authorsWhoShareThePostRepository.save(authorsWhoShareThePost);
    }

    public List<AuthorsWhoShareThePost> getAllAuthorsWhoShareThePost() {
        return authorsWhoShareThePostRepository.findAll();
    }

    public List<AuthorsWhoShareThePost> getAuthorsWhoShareThePostByPostid(long postid) {
        return authorsWhoShareThePostRepository.findAuthorsWhoShareThePostByPostid(postid);
    }

    public List<AuthorsWhoShareThePost> getAuthorsWhoShareThePostByAuthor(String author) {
        return authorsWhoShareThePostRepository.findAuthorsWhoShareThePostByAuthor(author);
    }

    public List<AuthorsWhoShareThePost> getAuthorsWhoShareThePostByAuthorsWhoShareThePost(String authorsWhoShareThePost) {
        return authorsWhoShareThePostRepository.findAuthorsWhoShareThePostByAuthorsWhoShareThePost(authorsWhoShareThePost);
    }

    // Add other methods as needed
}

