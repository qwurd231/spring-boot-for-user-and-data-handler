package com.project.security.entity.post;


import jakarta.persistence.*;
import lombok.*;

@Data
@ToString
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "POSTS")
public class Post {
    @Id
    @Column(name = "postid", nullable = false)
    private Long postid;

    @Column(name = "author", nullable = true, length = 30, insertable = true, updatable = false)
    private String author;

    @Column(name = "title", nullable = false, length = 200)
    private String title;

    @Column(name = "post_time", nullable = false, length = 30)
    private String postTime;

    @Column(name = "post_city", nullable = false, length = 50)
    private String postCity;

    @Column(name = "content", nullable = false, length = 1000)
    private String content;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author", nullable = false, referencedColumnName = "author",
            foreignKey = @ForeignKey(name = "author_book_fk"))
    private Author authorEntity;*/

    // Other mappings and relationships
}

