package id.ac.ui.cs.advprog.mendaftarlowongan.service;

import id.ac.ui.cs.advprog.mendaftarlowongan.enums.StatusLamaran;
import id.ac.ui.cs.advprog.mendaftarlowongan.model.Lamaran;
import id.ac.ui.cs.advprog.mendaftarlowongan.repository.LamaranRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class LamaranServiceImpl implements LamaranService {

    private final LamaranRepository lamaranRepository;

    public LamaranServiceImpl(LamaranRepository lamaranRepository) {
        this.lamaranRepository = lamaranRepository;
    }

    @Override
    public List<Lamaran> getLamaran() {
        return null;
    }

    @Override
    public Lamaran getLamaranById(UUID id) {
        return null;
    }

    @Override
    public Lamaran createLamaran(Lamaran lamaran) {
        return null;
    }

    @Override
    public Lamaran updateLamaran(UUID id, Lamaran lamaran) {
        return null;
    }

    @Override
    public void deleteLamaran(UUID id) {
    }

    @Override
    public boolean isLamaranExists(Lamaran lamaran) {
        return false;
    }

    @Override
    public boolean validateLamaran(Lamaran lamaran) {
        return false;
    }

    @Override
    public List<Lamaran> getLamaranByLowonganId(UUID idLowongan) {
        return null;
    }

    @Override
    public void acceptLamaran(UUID id) {
    }

    @Override
    public void rejectLamaran(UUID id) {
    }
}
