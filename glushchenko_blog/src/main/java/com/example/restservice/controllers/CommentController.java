package com.example.restservice.controllers;

import com.example.restservice.models.Comment;
import com.example.restservice.CommentFieldsComposition;
import com.example.restservice.services.CommentService;
import com.example.restservice.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    CommentService commentService;

    @Autowired
    PostService postService;

    @GetMapping("")
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody CommentFieldsComposition commentFieldsComposition) {
        Comment comment = new Comment();
        comment.setBody(commentFieldsComposition.body);
        comment.setPost_id(postService.getPostById(commentFieldsComposition.post_id));
        commentService.save(comment);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
