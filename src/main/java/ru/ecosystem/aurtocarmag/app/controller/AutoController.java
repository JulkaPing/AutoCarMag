package ru.ecosystem.aurtocarmag.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.ecosystem.aurtocarmag.app.model.Post;
import ru.ecosystem.aurtocarmag.app.repository.interfaces.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.ecosystem.aurtocarmag.app.service.PostService;

import java.util.Map;

@RestController
@RequestMapping("/autos")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))

public class AutoController {

    private final PostService postService;


    @GetMapping
    public ModelAndView getAllAutos() {
        return new ModelAndView("autos", Map.of("autos", postService.getAllPosts()));
    }
}
