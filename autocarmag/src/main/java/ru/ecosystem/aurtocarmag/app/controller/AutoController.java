package ru.ecosystem.aurtocarmag.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import ru.ecosystem.aurtocarmag.app.model.Auto;
import ru.ecosystem.aurtocarmag.app.repository.interfaces.AutoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/autos")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))

public class AutoController {

    private final AutoRepository<Long, Auto> autoRepository;


    @GetMapping
    public ModelAndView getAllAutos() {
        return new ModelAndView("autos", Map.of("autos", autoRepository.findAll()));
    }
}
