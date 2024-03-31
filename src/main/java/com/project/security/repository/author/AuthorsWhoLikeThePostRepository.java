package com.project.security.repository.author;

import com.project.security.entity.author.AuthorsWhoLikeThePost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorsWhoLikeThePostRepository extends JpaRepository<AuthorsWhoLikeThePost, Long> {
    List<AuthorsWhoLikeThePost> findAuthorsWhoLikeThePostByPostid(long postid);

    List<AuthorsWhoLikeThePost> findAuthorsWhoLikeThePostByAuthor(String author);

    List<AuthorsWhoLikeThePost> findAuthorsWhoLikeThePostByAuthorsWhoLikeThePost(String authorsWhoLikeThePost);
}

