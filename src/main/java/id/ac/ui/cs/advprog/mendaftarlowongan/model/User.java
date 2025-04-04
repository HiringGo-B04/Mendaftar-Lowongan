package id.ac.ui.cs.advprog.mendaftarlowongan.model;
import lombok.Setter;
import lombok.Getter;

@Getter @Setter
public class User {
    private String email;
    private String password;
}

@Getter @Setter
class Mahasiswa extends User {
    private String fullName;
    private String nim;
}

@Getter @Setter
class Dosen extends User {
    private String fullName;
    private String nip;
}