package com.project.security.repository.post;

import com.project.security.entity.post.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Long> {
    List<Reply> findReplyByAuthor(String author);

    List<Reply> findReplyByAuthorAndPostid(String author, long postid);
}
