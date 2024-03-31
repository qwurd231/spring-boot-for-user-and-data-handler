package com.project.security.repository.author;

import com.project.security.entity.author.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorsRepository extends JpaRepository<Author, String> {
    Author findAuthorByAuthor(String author);
}
