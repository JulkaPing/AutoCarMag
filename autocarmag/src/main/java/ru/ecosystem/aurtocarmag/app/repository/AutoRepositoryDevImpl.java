package ru.ecosystem.aurtocarmag.app.repository;

import lombok.RequiredArgsConstructor;
import net.jcip.annotations.ThreadSafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import ru.ecosystem.aurtocarmag.app.repository.interfaces.AutoRepository;
import ru.ecosystem.aurtocarmag.app.model.Auto;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
@ThreadSafe
@RequiredArgsConstructor(onConstructor = @__(@Autowired))

public class AutoRepositoryDevImpl implements AutoRepository<Long, Auto> {

    private final Map<Long, Auto> autos = new ConcurrentHashMap<>();

    @Override
    @PostConstruct
    public void init() {
        AutoRepository.super.init();
    }
    @Override
    public Auto add(Auto auto) {
        return null;
    }

    @Override
    public List<Auto> findAll() {
        return (List<Auto>) List.of(
                Auto.builder()
                        .id(1L)
                        .created(LocalDateTime.now())
                        .marka("Ford")
                        .marka("3")
                        .price("300")
                        .description("description")
                        .photo(new byte[]{})
                        .build(),
                Auto.builder()
                        .id(1L)
                        .created(LocalDateTime.now())
                        .marka("Kia")
                        .marka("Rio")
                        .price("600")
                        .description("description")
                        .photo(new byte[]{})
                        .build()
        );
    }

    @Override
    public Auto getById(Long aLong) {
        return null;
    }

    @Override
    public void update(Long aLong, Auto auto) {

    }

    @Override
    public void delete(Long aLong) {

    }
}
