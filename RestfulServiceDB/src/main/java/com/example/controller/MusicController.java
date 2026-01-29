package com.example.controller;

import com.example.model.Band;
import com.example.model.Musician;
import com.example.service.BandService;
import com.example.service.MusicianService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MusicController {

    @Autowired
    private BandService bandService;

    @Autowired
    private MusicianService musicianService;

    // ----------- Band Endpoints ------------

    @PostMapping("/bands")
    public Band addBand(@RequestBody Band band) {
        return bandService.addBand(band);
    }

    @GetMapping("/bands")
    public List<Band> getAllBands() {
        return bandService.getAllBands();
    }

    @DeleteMapping("/bands/{id}")
    public void deleteBand(@PathVariable Long id) {
        bandService.deleteBand(id);
    }

    // ----------- Musician Endpoints ------------

    @PostMapping("/musicians")
    public Musician addMusician(@RequestBody Musician musician) {
        return musicianService.addMusician(musician);
    }

    @GetMapping("/musicians")
    public List<Musician> getAllMusicians() {
        return musicianService.getAllMusicians();
    }

    @DeleteMapping("/musicians/{id}")
    public void deleteMusician(@PathVariable Long id) {
        musicianService.deleteMusician(id);
    }
}
