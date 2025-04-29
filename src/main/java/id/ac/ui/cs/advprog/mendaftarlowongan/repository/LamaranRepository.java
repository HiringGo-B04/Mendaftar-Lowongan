package id.ac.ui.cs.advprog.mendaftarlowongan.repository;

import id.ac.ui.cs.advprog.mendaftarlowongan.model.Lamaran;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LamaranRepository {
    private static LamaranRepository instance;
    private List<Lamaran> daftarLamaran;

    private LamaranRepository() {
        this.daftarLamaran = new ArrayList<>();
    }

    public static LamaranRepository getInstance() {
        if (instance == null) {
            instance = new LamaranRepository();
        }
        return instance;
    }

    public List<Lamaran> getLamaran() {
        return null;
    }

    public Lamaran getLamaranById(UUID id) {
        return null;
    }

    public Lamaran createLamaran(Lamaran lamaran) {
        return null;
    }

    public Lamaran updateLamaran(UUID id, Lamaran updatedLamaran) {
        return null;
    }

    public void deleteLamaran(UUID id) {
    }
}