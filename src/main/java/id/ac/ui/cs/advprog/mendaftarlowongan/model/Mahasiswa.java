package id.ac.ui.cs.advprog.mendaftarlowongan.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Mahasiswa extends User {
    private String fullName;
    private String nim;

    private List<Lamaran> daftarLamaran;

    public Mahasiswa() {
    }

    public Mahasiswa(String fullName, String nim) {
    }
}
