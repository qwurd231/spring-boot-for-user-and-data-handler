package com.project.security.service.author;

import com.project.security.entity.author.Author;
import com.project.security.repository.author.AuthorsRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorsService {
    private final AuthorsRepository authorsRepository;

    public AuthorsService(AuthorsRepository authorsRepository) {
        this.authorsRepository = authorsRepository;
    }

    public Author getAuthorsByAuthor(String author) {
        return authorsRepository.findAuthorByAuthor(author);
    }

    public Author save(Author author) {
        return authorsRepository.save(author);
    }
}
