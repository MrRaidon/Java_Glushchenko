package com.example.restservice.services;

import com.example.restservice.models.Post;
import com.example.restservice.repositories.CommentRepo;
import com.example.restservice.repositories.PostRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PostService {
    @Autowired
    PostRepo postRepo;

    @Autowired
    CommentRepo commentRepo;

    public List<Post> getAllPosts() {
        return postRepo.findAll();
    }

    public Post getPostById(Integer id) {
        return postRepo.findById(id).get();
    }

    public void save(Post post) {
        postRepo.save(post);
    }
}
