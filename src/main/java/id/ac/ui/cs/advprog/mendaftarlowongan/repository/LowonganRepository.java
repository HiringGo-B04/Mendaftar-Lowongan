package id.ac.ui.cs.advprog.mendaftarlowongan.repository;

import id.ac.ui.cs.advprog.mendaftarlowongan.model.Lowongan;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


public class LowonganRepository {
    private static LowonganRepository instance;
    private List<Lowongan> daftarLowongan;

    private LowonganRepository() {
        this.daftarLowongan = new ArrayList<>();
    }

    public static LowonganRepository getInstance() {
        if (instance == null) {
            instance = new LowonganRepository();
        }
        return instance;
    }

    // Method untuk mengambil semua lowongan
    public List<Lowongan> findAll() {
        return daftarLowongan;
    }

    // Method untuk mengambil lowongan berdasarkan ID
    public Optional<Lowongan> findById(UUID id) {
        return daftarLowongan.stream()
                .filter(lowongan -> lowongan.getId().equals(id))
                .findFirst();
    }

    // Method untuk menyimpan lowongan
    public Lowongan save(Lowongan lowongan) {
        // Cek apakah lowongan sudah ada
        Optional<Lowongan> existingLowongan = findById(lowongan.getId());

        if (existingLowongan.isPresent()) {
            // Update lowongan yang sudah ada
            daftarLowongan.remove(existingLowongan.get());
        }

        daftarLowongan.add(lowongan);
        return lowongan;
    }

    // Method untuk menghapus lowongan
    public void delete(UUID id) {
        daftarLowongan.removeIf(lowongan -> lowongan.getId().equals(id));
    }
}
