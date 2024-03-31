package com.project.security.entity.author;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "authors_followed_by")
public class AuthorsFollowed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "author", nullable = false, length = 30)
    private String author;

    @Column(name = "authors_followed_by", nullable = false, length = 30)
    private String authorsFollowed;

    // Assuming you have a ManyToOne relationship with the Authors entity
    /*@ManyToOne
    @JoinColumn(name = "author", referencedColumnName = "author", insertable = false, updatable = false)
    private Author authorEntity;*/

    // Assuming you have a ManyToOne relationship with the Authors entity
    /*@ManyToOne
    @JoinColumn(name = "authors_followed_by", referencedColumnName = "author", insertable = false, updatable = false)
    private Author followedByAuthor;*/
}
