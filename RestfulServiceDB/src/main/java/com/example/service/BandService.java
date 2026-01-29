package com.example.service;

import com.example.model.Band;
import com.example.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BandService {

    @Autowired
    private BandRepository bandRepository;

    public Band addBand(Band band) {
        return bandRepository.save(band);
    }

    public List<Band> getAllBands() {
        return bandRepository.findAll();
    }

    public Optional<Band> getBandById(Long id) {
        return bandRepository.findById(id);
    }

    public void deleteBand(Long id) {
        bandRepository.deleteById(id);
    }
}
