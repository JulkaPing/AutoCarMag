package ru.ecosystem.aurtocarmag.app.repository.interfaces;

import ru.ecosystem.aurtocarmag.app.model.Post;

import java.util.List;

public interface PostRepository {
    public List<Post> findAll();
}
