package com.project.security.entity.post;

import lombok.*;

import jakarta.persistence.*;

@Data
@ToString
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "secondary_replies")
public class SecondaryReply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "secondary_replyid")
    private Long secondaryReplyid;

    @Column(name = "replyid", nullable = false)
    private Integer replyid;

    @Column(name = "content", nullable = false, length = 1000)
    private String content;

    @Column(name = "stars", nullable = false)
    private Integer stars;

    @Column(name = "author", nullable = false)
    private String author;
}

