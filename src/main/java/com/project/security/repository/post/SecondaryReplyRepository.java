package com.project.security.repository.post;

import com.project.security.entity.post.SecondaryReply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SecondaryReplyRepository extends JpaRepository<SecondaryReply, Long> {
    List<SecondaryReply> findSecondaryReplyByAuthor(String author);
}

