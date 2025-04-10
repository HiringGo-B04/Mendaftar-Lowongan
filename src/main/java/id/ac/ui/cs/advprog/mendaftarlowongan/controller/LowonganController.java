package id.ac.ui.cs.advprog.mendaftarlowongan.controller;

import id.ac.ui.cs.advprog.mendaftarlowongan.model.Lowongan;
import id.ac.ui.cs.advprog.mendaftarlowongan.service.LowonganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/lowongan")
public class LowonganController {

    @Autowired
    private LowonganService lowonganService;

    @GetMapping
    public ResponseEntity<List<Lowongan>> getAllLowongan() {
        List<Lowongan> lowonganList = lowonganService.getAllLowongan();
        return new ResponseEntity<>(lowonganList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lowongan> getLowonganById(@PathVariable UUID id) {
        Optional<Lowongan> lowongan = lowonganService.getLowonganById(id);
        return lowongan.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Lowongan> createLowongan(@RequestBody Lowongan lowongan) {
        Lowongan createdLowongan = lowonganService.createLowongan(lowongan);
        return new ResponseEntity<>(createdLowongan, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Lowongan> updateLowongan(@PathVariable UUID id, @RequestBody Lowongan lowongan) {
        Optional<Lowongan> existingLowongan = lowonganService.getLowonganById(id);

        if (existingLowongan.isPresent()) {
            lowongan.setId(id);
            Lowongan updatedLowongan = lowonganService.updateLowongan(lowongan);
            return new ResponseEntity<>(updatedLowongan, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLowongan(@PathVariable UUID id) {
        Optional<Lowongan> existingLowongan = lowonganService.getLowonganById(id);

        if (existingLowongan.isPresent()) {
            lowonganService.deleteLowongan(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}