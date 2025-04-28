package id.ac.ui.cs.advprog.mendaftarlowongan.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dosen extends User {
    private String fullName;
    private String nip;

    public Dosen() {
    }

    public Dosen(String fullName, String nip) {
    }
}