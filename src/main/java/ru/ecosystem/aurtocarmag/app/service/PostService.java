package ru.ecosystem.aurtocarmag.app.service;

import lombok.RequiredArgsConstructor;
import net.jcip.annotations.ThreadSafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ecosystem.aurtocarmag.app.model.Post;
import ru.ecosystem.aurtocarmag.app.repository.interfaces.PostRepository;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@ThreadSafe
public class PostService {
    private final PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    //public void addAuto(Post post) {
     //   postRepository.add(post);
   // }

   // public Post getAutoById(Long id) {
     //   return postRepository.getById(id);
    //}

   // public void updateAuto(Long id, Post post) {
   //     postRepository.update(id, post);
   // }

   // public void deleteAuto(Long id) {
    //    postRepository.delete(id);
   // }
}
