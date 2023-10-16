package com.example.demo.service;

import com.example.demo.entity.Sunglasses;
import com.example.demo.repository.SunglassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SunglassesService {

    private final SunglassesRepository sunglassesRepository;

    @Autowired
    public SunglassesService(SunglassesRepository sunglassesRepository) {
        this.sunglassesRepository = sunglassesRepository;
    }

    public List<Sunglasses> getAllSunglasses() {
        return sunglassesRepository.findAll();
    }

    public Sunglasses getSunglassesById(String id) {
        Optional<Sunglasses> sunglasses = sunglassesRepository.findById(id);
        return sunglasses.orElse(null);
    }

    public Sunglasses saveSunglasses(Sunglasses sunglasses) {
        return sunglassesRepository.save(sunglasses);
    }

    public void deleteSunglasses(String id) {
        sunglassesRepository.deleteById(id);
    }
}
