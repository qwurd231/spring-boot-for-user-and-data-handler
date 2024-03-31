package com.project.security.service.post;

import com.project.security.entity.post.Post;
import com.project.security.repository.post.PostsRepository;
import org.springframework.stereotype.Service;

@Service
public class PostsService {
    private final PostsRepository postsRepository;

    public PostsService(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    public Post save(Post post) {
        return postsRepository.save(post);
    }

    public Post getPostsByPostid(long postid) {
        return postsRepository.findPostByPostid(postid);
    }

    public Post getPostByAuthor(String author) {return postsRepository.findPostByAuthor(author);}
}
