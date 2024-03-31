package com.project.security.entity.author;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @Column(name = "author", unique = true, nullable = false, length = 30)
    private String author;

    @Column(name = "authorid", nullable = true, length = 20)
    private String authorid;

    @Column(name = "author_phone", nullable = true, length = 15)
    private String authorPhone;

    @Column(name = "author_registration_time", nullable = true, length = 50)
    private String authorRegistrationTime;

    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "author", referencedColumnName = "author")
    private List<Post> posts = new ArrayList<>();*/
}