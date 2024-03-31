package com.project.security.repository.author;

import com.project.security.entity.author.Author;
import com.project.security.entity.author.AuthorsFollowed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorsFollowedRepository extends JpaRepository<AuthorsFollowed, Integer> {
    List<AuthorsFollowed> findAuthorsFollowedByAuthor(String author);

    List<AuthorsFollowed> findAuthorsFollowedByAuthorsFollowed(String authorsFollowed);
}
