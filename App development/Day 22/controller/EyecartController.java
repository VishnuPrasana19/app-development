package com.example.demo.controller;

import com.example.demo.entity.Eyecart;
import com.example.demo.service.EyecartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eyecart")
public class EyecartController {
    private final EyecartService eyecartService;

    @Autowired
    public EyecartController(EyecartService eyecartService) {
        this.eyecartService = eyecartService;
    }

    @GetMapping
    public List<Eyecart> getAllEyecartItems() {
        return eyecartService.getAllEyecartItems();
    }

    @GetMapping("/{id}")
    public Eyecart getEyecartItemById(@PathVariable String id) {
        return eyecartService.getEyecartItemById(id);
    }

    @PostMapping
    public Eyecart createEyecartItem(@RequestBody Eyecart eyecart) {
        return eyecartService.saveEyecartItem(eyecart);
    }

    @PutMapping("/{id}")
    public Eyecart updateEyecartItem(@PathVariable String id, @RequestBody Eyecart eyecart) {
        eyecart.setId(id);
        return eyecartService.saveEyecartItem(eyecart);
    }

    @DeleteMapping("/{id}")
    public void deleteEyecartItem(@PathVariable String id) {
        eyecartService.deleteEyecartItem(id);
    }
}
