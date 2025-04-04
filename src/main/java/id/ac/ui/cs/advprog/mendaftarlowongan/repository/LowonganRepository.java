package id.ac.ui.cs.advprog.mendaftarlowongan.repository;

import id.ac.ui.cs.advprog.mendaftarlowongan.model.Lamaran;
import id.ac.ui.cs.advprog.mendaftarlowongan.model.Lowongan;
import id.ac.ui.cs.advprog.mendaftarlowongan.model.Mahasiswa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import id.ac.ui.cs.advprog.mendaftarlowongan.enums.StatusLamaran;


import java.util.List;
import java.util.UUID;

@Repository
@Transactional
public class LowonganRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Lowongan> fetchLowongan() {
        String jpql = "SELECT l FROM Lowongan l";
        return entityManager.createQuery(jpql, Lowongan.class).getResultList();
    }

    public Lowongan fetchLowonganById(UUID id) {
        return entityManager.find(Lowongan.class, id);
    }

    public Lowongan addLowongan(Lowongan lowongan) {
        entityManager.persist(lowongan);
        return lowongan;
    }

    public void saveRegistration(String nim, UUID idLowongan, float ipk, int sks) {
        // Ambil Mahasiswa
        TypedQuery<Mahasiswa> mahasiswaQuery = entityManager.createQuery(
                "SELECT m FROM Mahasiswa m WHERE m.nim = :nim", Mahasiswa.class);
        mahasiswaQuery.setParameter("nim", nim);
        Mahasiswa mahasiswa = mahasiswaQuery.getSingleResult();

        // Ambil Lowongan
        Lowongan lowongan = entityManager.find(Lowongan.class, idLowongan);

        // Buat Lamaran
        Lamaran lamaran = new Lamaran();
        lamaran.setMahasiswa(mahasiswa);
        lamaran.setLowongan(lowongan);
        lamaran.setGpa(ipk);
        lamaran.setSks(sks);
        lamaran.setStatus(StatusLamaran.MENUNGGU); // Misal default

        entityManager.persist(lamaran);
    }

    public boolean checkExistingRegistration(String nim, UUID lowonganId) {
        String jpql = "SELECT COUNT(l) FROM Lamaran l WHERE l.mahasiswa.nim = :nim AND l.lowongan.id = :lowonganId";
        Long count = entityManager.createQuery(jpql, Long.class)
                .setParameter("nim", nim)
                .setParameter("lowonganId", lowonganId)
                .getSingleResult();

        return count > 0;
    }

    public void addLamaran(Lamaran lamaran) {
        entityManager.persist(lamaran);
    }
}
