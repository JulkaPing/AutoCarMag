package ru.ecosystem.aurtocarmag.app.service;

import lombok.RequiredArgsConstructor;
import net.jcip.annotations.ThreadSafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ecosystem.aurtocarmag.app.model.Auto;
import ru.ecosystem.aurtocarmag.app.repository.AutoRepositoryDevImpl;
import ru.ecosystem.aurtocarmag.app.repository.interfaces.AutoRepository;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@ThreadSafe
public class AutoService {
    private final AutoRepository<Long, Auto> autoRepository;

    public List<Auto> getAllAutos() {
        return autoRepository.findAll();
    }

    public void addAuto(Auto auto) {
        autoRepository.add(auto);
    }

    public Auto getAutoById(Long id) {
        return autoRepository.getById(id);
    }

    public void updateAuto(Long id, Auto auto) {
        autoRepository.update(id, auto);
    }

    public void deleteAuto(Long id) {
        autoRepository.delete(id);
    }
}
