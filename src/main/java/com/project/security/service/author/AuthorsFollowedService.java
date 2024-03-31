package com.project.security.service.author;

import com.project.security.entity.author.AuthorsFollowed;
import com.project.security.repository.author.AuthorsFollowedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorsFollowedService {
    private final AuthorsFollowedRepository authorsFollowedRepository;

    @Autowired
    public AuthorsFollowedService(AuthorsFollowedRepository authorsFollowedByRepository) {
        this.authorsFollowedRepository = authorsFollowedByRepository;
    }

    public List<AuthorsFollowed> getAuthorsFollowedByAuthor(String author) {
        return authorsFollowedRepository.findAuthorsFollowedByAuthor(author);
    }

    public List<AuthorsFollowed> getAuthorsFollowedByAuthorsFollowed(String authorsFollowed) {
        return authorsFollowedRepository.findAuthorsFollowedByAuthorsFollowed(authorsFollowed);
    }

    public AuthorsFollowed save(AuthorsFollowed authorsFollowed) {
        return authorsFollowedRepository.save(authorsFollowed);
    }

    public void delete(AuthorsFollowed authorsFollowed) {
        authorsFollowedRepository.delete(authorsFollowed);
    }
}
