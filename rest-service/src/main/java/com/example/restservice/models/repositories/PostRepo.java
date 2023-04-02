package com.example.restservice.models.repositories;

import com.example.blogapi.models.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Integer> {
}
