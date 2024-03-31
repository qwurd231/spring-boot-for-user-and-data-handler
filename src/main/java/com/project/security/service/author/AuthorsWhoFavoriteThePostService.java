package com.project.security.service.author;

import com.project.security.entity.author.AuthorsWhoFavoriteThePost;
import com.project.security.repository.author.AuthorsWhoFavoriteThePostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorsWhoFavoriteThePostService {
    private final AuthorsWhoFavoriteThePostRepository repository;

    @Autowired
    public AuthorsWhoFavoriteThePostService(AuthorsWhoFavoriteThePostRepository repository) {
        this.repository = repository;
    }

    public AuthorsWhoFavoriteThePost save(AuthorsWhoFavoriteThePost authorsWhoFavoriteThePost) {
        return repository.save(authorsWhoFavoriteThePost);
    }

    public List<AuthorsWhoFavoriteThePost> getAllAuthorsWhoFavoriteThePost() {
        return repository.findAll();
    }

    public List<AuthorsWhoFavoriteThePost> getAuthorsWhoFavoriteThePostByPostid(long postid) {
        return repository.findAuthorsWhoFavoriteThePostByPostid(postid);
    }

    public List<AuthorsWhoFavoriteThePost> getAuthorsWhoFavoriteThePostByAuthor(String author) {
        return repository.findAuthorsWhoFavoriteThePostByAuthor(author);
    }

    public List<AuthorsWhoFavoriteThePost> getAuthorsWhoFavoriteThePostByAuthorsWhoFavoriteThePost(String authorsWhoFavoriteThePost) {
        return repository.findAuthorsWhoFavoriteThePostByAuthorsWhoFavoriteThePost(authorsWhoFavoriteThePost);
    }


    // Add other methods as needed
}
