package id.ac.ui.cs.advprog.mendaftarlowongan.model;
import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter @Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private UUID id;

    private String email;
    private String password;
}

@Getter @Setter
@Entity
@Table(name = "mahasiswa")
class Mahasiswa extends User {
    private String fullName;
    private String nim;

    @OneToMany(mappedBy = "mahasiswa", cascade = CascadeType.ALL)
    private List<Lamaran> daftarLamaran;
}


@Getter @Setter
@Entity
@Table(name = "dosen")
class Dosen extends User {
    private String fullName;
    private String nip;
}