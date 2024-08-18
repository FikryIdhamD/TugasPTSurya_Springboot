package com.example.demo.controller;

import com.example.demo.model.Proyek;
import com.example.demo.model.Lokasi;
import com.example.demo.repository.ProyekRepository;
import com.example.demo.repository.LokasiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyek")
public class ProyekController {

    @Autowired
    private ProyekRepository proyekRepository;

    @Autowired
    private LokasiRepository lokasiRepository;

    @PostMapping
    public Proyek createProyek(@RequestBody Proyek proyek) {
        List<Lokasi> lokasiList = proyek.getLokasiList();
        for (Lokasi lokasi : lokasiList) {
            Lokasi lokasiFound = lokasiRepository.findById(lokasi.getId())
                    .orElseThrow(() -> new RuntimeException("Lokasi not found"));
        }
        return proyekRepository.save(proyek);
    }

    @GetMapping
    public List<Proyek> getAllProyek() {
        return proyekRepository.findAll();
    }

    @PutMapping("/{id}")
    public Proyek updateProyek(@PathVariable Long id, @RequestBody Proyek proyekDetails) {
        Proyek proyek = proyekRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Proyek not found"));

        proyek.setNamaProyek(proyekDetails.getNamaProyek());
        proyek.setClient(proyekDetails.getClient());
        proyek.setTglMulai(proyekDetails.getTglMulai());
        proyek.setTglSelesai(proyekDetails.getTglSelesai());
        proyek.setPimpinanProyek(proyekDetails.getPimpinanProyek());
        proyek.setKeterangan(proyekDetails.getKeterangan());

        List<Lokasi> lokasiList = proyekDetails.getLokasiList();
        for (Lokasi lokasi : lokasiList) {
            Lokasi lokasiFound = lokasiRepository.findById(lokasi.getId())
                    .orElseThrow(() -> new RuntimeException("Lokasi not found"));
        }
        proyek.setLokasiList(lokasiList);

        return proyekRepository.save(proyek);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProyek(@PathVariable Long id) {
        Proyek proyek = proyekRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Proyek not found"));

        proyekRepository.delete(proyek);

        return ResponseEntity.ok().build();
    }
}
