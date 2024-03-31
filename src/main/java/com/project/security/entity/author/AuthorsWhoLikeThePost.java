package com.project.security.entity.author;

import jakarta.persistence.*;
import lombok.*;

@Data
@ToString
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "authors_who_like_the_post")
public class AuthorsWhoLikeThePost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "postid", nullable = false)
    private Long postid;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "authors_who_like_the_post", nullable = false)
    private String authorsWhoLikeThePost;
}

