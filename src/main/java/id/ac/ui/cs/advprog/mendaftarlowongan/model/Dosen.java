package id.ac.ui.cs.advprog.mendaftarlowongan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "dosen")
public class Dosen extends User {
    private String fullName;
    private String nip;
}
