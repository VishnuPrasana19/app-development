package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class imageDetails {

   
   

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Id
	private String imageUrl;

    public imageDetails() {
        // Default constructor
    }

    public imageDetails(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    // Getters and setters
    // ...
}