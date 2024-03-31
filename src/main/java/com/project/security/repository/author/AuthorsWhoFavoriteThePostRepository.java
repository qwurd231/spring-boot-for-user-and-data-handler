package com.project.security.repository.author;

import com.project.security.entity.author.AuthorsWhoFavoriteThePost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorsWhoFavoriteThePostRepository extends JpaRepository<AuthorsWhoFavoriteThePost, Long> {
    List<AuthorsWhoFavoriteThePost> findAuthorsWhoFavoriteThePostByPostid(long postid);

    List<AuthorsWhoFavoriteThePost> findAuthorsWhoFavoriteThePostByAuthor(String author);

    List<AuthorsWhoFavoriteThePost> findAuthorsWhoFavoriteThePostByAuthorsWhoFavoriteThePost(String authorsWhoFavoriteThePost);
}

