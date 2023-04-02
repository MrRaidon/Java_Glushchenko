package com.example.restservice.repositories;

import com.example.restservice.models.Comment;
import com.example.restservice.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
