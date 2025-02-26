package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.model.Fruita;
import cat.itacademy.s04.t02.n01.repository.FruitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitaService {
    @Autowired
    private FruitaRepository repository;

    public Fruita addFruita(Fruita fruita) {
        return repository.save(fruita);
    }

    public Fruita updateFruita(Fruita fruita) {
        return repository.save(fruita);
    }

    public void deleteFruita(Long id) {
        repository.deleteById(id);
    }

    public Fruita getOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Fruita> getAll() {
        return repository.findAll();
    }
}
