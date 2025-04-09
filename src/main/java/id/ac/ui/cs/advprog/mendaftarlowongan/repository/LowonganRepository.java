package id.ac.ui.cs.advprog.mendaftarlowongan.repository;

import id.ac.ui.cs.advprog.mendaftarlowongan.model.Lowongan;

import java.util.ArrayList;
import java.util.List;

public class LowonganRepository {
    private static LowonganRepository instace;

    public static LowonganRepository getInstance() {
        if (instace == null) {
            instace = new LowonganRepository();
        }
        return instace;
    }
}
