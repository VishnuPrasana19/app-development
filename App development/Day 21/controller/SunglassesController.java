package com.example.demo.controller;

import com.example.demo.entity.Sunglasses;
import com.example.demo.service.SunglassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sunglasses")
public class SunglassesController {
    private final SunglassesService sunglassesService;

    @Autowired
    public SunglassesController(SunglassesService sunglassesService) {
        this.sunglassesService = sunglassesService;
    }

    @GetMapping
    public List<Sunglasses> getAllSunglasses() {
        return sunglassesService.getAllSunglasses();
    }

    @GetMapping("/{id}")
    public Sunglasses getSunglassesById(@PathVariable String id) {
        return sunglassesService.getSunglassesById(id);
    }

    @PostMapping
    public Sunglasses createSunglasses(@RequestBody Sunglasses sunglasses) {
        return sunglassesService.saveSunglasses(sunglasses);
    }

    @PutMapping("/{id}")
    public Sunglasses updateSunglasses(@PathVariable String id, @RequestBody Sunglasses sunglasses) {
        sunglasses.setId(id);
        return sunglassesService.saveSunglasses(sunglasses);
    }

    @DeleteMapping("/{id}")
    public void deleteSunglasses(@PathVariable String id) {
        sunglassesService.deleteSunglasses(id);
    }
}
