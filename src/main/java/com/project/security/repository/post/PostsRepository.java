package com.project.security.repository.post;

import com.project.security.entity.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends JpaRepository<Post, Integer> {
    Post findPostByPostid(long postid);
    Post findPostByAuthor(String author);
}