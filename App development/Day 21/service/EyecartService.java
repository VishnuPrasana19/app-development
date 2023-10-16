package com.example.demo.service;

import com.example.demo.entity.Eyecart;
import com.example.demo.repository.EyecartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EyecartService {

    private final EyecartRepository eyecartRepository;

    @Autowired
    public EyecartService(EyecartRepository eyecartRepository) {
        this.eyecartRepository = eyecartRepository;
    }

    public List<Eyecart> getAllEyecartItems() {
        return eyecartRepository.findAll();
    }

    public Eyecart getEyecartItemById(String id) {
        Optional<Eyecart> eyecartItem = eyecartRepository.findById(id);
        return eyecartItem.orElse(null);
    }

    public Eyecart saveEyecartItem(Eyecart eyecart) {
        return eyecartRepository.save(eyecart);
    }

    public void deleteEyecartItem(String id) {
        eyecartRepository.deleteById(id);
    }
}
