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
}
