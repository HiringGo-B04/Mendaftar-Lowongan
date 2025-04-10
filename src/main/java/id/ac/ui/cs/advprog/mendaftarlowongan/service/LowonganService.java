package id.ac.ui.cs.advprog.mendaftarlowongan.service;

import id.ac.ui.cs.advprog.mendaftarlowongan.model.Lowongan;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LowonganService {
    List<Lowongan> getAllLowongan();
    Optional<Lowongan> getLowonganById(UUID id);
    Lowongan createLowongan(Lowongan lowongan);
    Lowongan updateLowongan(Lowongan lowongan);
    void deleteLowongan(UUID id);
}