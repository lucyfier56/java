package com.example.service;

import com.example.model.Musician;
import com.example.repository.MusicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicianService {

    @Autowired
    private MusicianRepository musicianRepository;


    public Musician addMusician(Musician musician) {
        return musicianRepository.save(musician);
    }


    public List<Musician> getAllMusicians() {
        return musicianRepository.findAll();
    }

    // Get musician by ID
    public Optional<Musician> getMusicianById(Long id) {
        return musicianRepository.findById(id);
    }

    // Delete musician by ID
    public void deleteMusician(Long id) {
        musicianRepository.deleteById(id);
    }
}
