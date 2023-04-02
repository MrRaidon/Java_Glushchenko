package com.example.restservice.repositories;

import com.example.blogapi.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Integer> {
}
