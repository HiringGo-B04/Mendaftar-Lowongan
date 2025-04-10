package id.ac.ui.cs.advprog.mendaftarlowongan.service.impl;

import id.ac.ui.cs.advprog.mendaftarlowongan.model.Lowongan;
import id.ac.ui.cs.advprog.mendaftarlowongan.repository.LowonganRepository;
import id.ac.ui.cs.advprog.mendaftarlowongan.service.LowonganService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LowonganServiceImpl implements LowonganService {

    private final LowonganRepository lowonganRepository;

    public LowonganServiceImpl() {
        this.lowonganRepository = LowonganRepository.getInstance();
    }

    @Override
    public List<Lowongan> getAllLowongan() {
        return lowonganRepository.findAll();
    }

    @Override
    public Optional<Lowongan> getLowonganById(UUID id) {
        return lowonganRepository.findById(id);
    }

    @Override
    public Lowongan createLowongan(Lowongan lowongan) {
        return lowonganRepository.save(lowongan);
    }

    @Override
    public Lowongan updateLowongan(Lowongan lowongan) {
        return lowonganRepository.save(lowongan);
    }

    @Override
    public void deleteLowongan(UUID id) {
        lowonganRepository.delete(id);
    }
}
