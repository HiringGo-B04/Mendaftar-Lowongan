package id.ac.ui.cs.advprog.mendaftarlowongan.model;
import id.ac.ui.cs.advprog.mendaftarlowongan.enums.StatusLamaran;
import lombok.Setter;
import lombok.Getter;
import java.util.UUID;

@Getter @Setter
public class Lamaran {
    private UUID id;

    private int sks;
    private float gpa;

    private StatusLamaran status;
    private Mahasiswa mahasiswa;
    private Lowongan lowongan;
}
