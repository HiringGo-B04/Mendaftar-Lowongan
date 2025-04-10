package id.ac.ui.cs.advprog.mendaftarlowongan.model;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class User {
    private UUID id;

    private String email;
    private String password;

    public User() {
        this.id = UUID.randomUUID();
    }
}

