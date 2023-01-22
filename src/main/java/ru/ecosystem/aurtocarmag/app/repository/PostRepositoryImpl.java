package ru.ecosystem.aurtocarmag.app.repository;

import lombok.RequiredArgsConstructor;
import net.jcip.annotations.ThreadSafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.ecosystem.aurtocarmag.app.model.Post;
import ru.ecosystem.aurtocarmag.app.repository.interfaces.PostRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
@RequiredArgsConstructor(onConstructor = @__(@Autowired))

public class PostRepositoryImpl implements PostRepository {

    private final Map<Long, Post> autos = new ConcurrentHashMap<>();

    @Override
    public List<Post> findAll() {
        return List.of();
    }

}
