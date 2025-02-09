package com.example.mongodb.repository;

import com.example.mongodb.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
