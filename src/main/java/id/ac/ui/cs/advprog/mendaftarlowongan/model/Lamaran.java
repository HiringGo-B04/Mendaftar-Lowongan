package id.ac.ui.cs.advprog.mendaftarlowongan.model;

import id.ac.ui.cs.advprog.mendaftarlowongan.enums.StatusLamaran;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class Lamaran {
    private UUID id;
    private int sks;
    private float gpa;
    private StatusLamaran status;
    private Mahasiswa mahasiswa;
    private Lowongan lowongan;

    private Lamaran(Builder builder) {
        this.id = UUID.randomUUID();
        this.sks = builder.sks;
        this.gpa = builder.gpa;
        this.status = builder.status;
        this.mahasiswa = builder.mahasiswa;
        this.lowongan = builder.lowongan;
    }

    public static class Builder {
        private int sks;
        private float gpa;
        private StatusLamaran status;
        private Mahasiswa mahasiswa;
        private Lowongan lowongan;

        public Builder sks(int sks) {
            this.sks = sks;
            return this;
        }

        public Builder gpa(float gpa) {
            this.gpa = gpa;
            return this;
        }

        public Builder status(StatusLamaran status) {
            this.status = status;
            return this;
        }

        public Builder mahasiswa(Mahasiswa mahasiswa) {
            this.mahasiswa = mahasiswa;
            return this;
        }

        public Builder lowongan(Lowongan lowongan) {
            this.lowongan = lowongan;
            return this;
        }

        public Lamaran build() {
            return new Lamaran(this);
        }
    }
}
