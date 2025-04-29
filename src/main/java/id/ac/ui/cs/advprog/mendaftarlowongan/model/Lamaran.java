

package id.ac.ui.cs.advprog.mendaftarlowongan.model;

import id.ac.ui.cs.advprog.mendaftarlowongan.enums.StatusLamaran;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class Lamaran {
    private UUID id;
    private int sks;
    private float ipk;
    private String status = "MENUNGGU";
    private UUID idMahasiswa;
    private UUID idLowongan;

    private Lamaran(Builder builder) {
    }

    public static class Builder {
        private int sks;
        private float ipk;
        private String status = "MENUNGGU";
        private UUID idMahasiswa;
        private UUID idLowongan;

        public Builder sks(int sks) {
            return null;
        }

        public Builder ipk(float ipk) {
            return null;
        }

        public Builder status(String status) {
            return null;
        }

        public Builder mahasiswa(UUID mahasiswa) {
            return null;
        }

        public Builder lowongan(UUID lowongan) {
            return null;
        }

        public Lamaran build() {
            return null;
        }
    }
}
