package com.example.restservice.schemas;

import com.example.restservice.models.Comment;
import com.example.restservice.models.Post;

import java.util.List;

public class PostSchema {
    public Post post;
    public List<Comment> comments;
}
