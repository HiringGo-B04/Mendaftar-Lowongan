package id.ac.ui.cs.advprog.mendaftarlowongan.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "mahasiswa")
public class Mahasiswa extends User {
    private String fullName;
    private String nim;

    @OneToMany(mappedBy = "mahasiswa", cascade = CascadeType.ALL)
    private List<Lamaran> daftarLamaran;
}
