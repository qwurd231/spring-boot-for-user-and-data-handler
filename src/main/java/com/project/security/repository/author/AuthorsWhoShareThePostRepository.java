package com.project.security.repository.author;


import com.project.security.entity.author.AuthorsWhoShareThePost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorsWhoShareThePostRepository extends JpaRepository<AuthorsWhoShareThePost, Long> {
    List<AuthorsWhoShareThePost> findAuthorsWhoShareThePostByPostid(long postid);

    List<AuthorsWhoShareThePost> findAuthorsWhoShareThePostByAuthor(String author);

    List<AuthorsWhoShareThePost> findAuthorsWhoShareThePostByAuthorsWhoShareThePost(String authorsWhoShareThePost);
}

