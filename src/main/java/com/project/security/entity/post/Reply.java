package com.project.security.entity.post;

import lombok.*;

import jakarta.persistence.*;

@Data
@ToString
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "replies")
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "replyid")
    private Long replyid;

    @Column(name = "postid", nullable = false)
    private Long postid;

    @Column(name = "content", nullable = false, length = 1000)
    private String content;

    @Column(name = "stars", nullable = false)
    private Integer stars;

    @Column(name = "author", nullable = false)
    private String author;
}
