package id.ac.ui.cs.advprog.mendaftarlowongan.model;
import id.ac.ui.cs.advprog.mendaftarlowongan.enums.StatusLamaran;
import lombok.Setter;
import lombok.Getter;
import java.util.UUID;

import jakarta.persistence.*;

@Getter @Setter
@Entity
@Table(name = "lamaran")
public class Lamaran {
    @Id
    @GeneratedValue
    private UUID id;

    private int sks;
    private float gpa;

    @Enumerated(EnumType.STRING)
    private StatusLamaran status;

    @ManyToOne
    @JoinColumn(name = "mahasiswa_id", nullable = false)
    private Mahasiswa mahasiswa;

    @ManyToOne
    @JoinColumn(name = "lowongan_id", nullable = false)
    private Lowongan lowongan;
}

