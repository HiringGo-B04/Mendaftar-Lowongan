package id.ac.ui.cs.advprog.mendaftarlowongan.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter @Setter
@Entity
@Table(name = "lowongan")
public class Lowongan {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @OneToMany(mappedBy = "lowongan")
    private List<Lamaran> daftarLamaran;
}
