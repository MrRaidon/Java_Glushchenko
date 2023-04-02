package com.example.restservice.models.repositories;

import com.example.blogapi.models.models.Comment;
import com.example.blogapi.models.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
    List<Comment> findAllByPost (Post post);
}
