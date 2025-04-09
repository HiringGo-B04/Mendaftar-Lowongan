package id.ac.ui.cs.advprog.mendaftarlowongan.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter @Setter
public class Lowongan {
    private UUID id;

    private String name;
    private List<Lamaran> daftarLamaran;

    public Lowongan() {
        this.id = UUID.randomUUID();
        this.daftarLamaran = new ArrayList<>();
    }

    public Lowongan(String name, List<Lamaran> daftarLamaran) {
        this.id = UUID.randomUUID();
        this.daftarLamaran = daftarLamaran;
        this.name = name;
    }
}