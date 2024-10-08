package com.example.nagoyameshi.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "restaurants")
@Data
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@Column(name = "name")
    private String name;
 
    @Column(name = "image_name")
    private String imageName;
 
    @Column(name = "description")
    private String description;
 
    @Column(name = "opening_hours")
    private String openingHours;
    
    @Column(name = "price")
    private Integer price;
 
    @Column(name = "postal_code")
    private String postalCode;
 
    @Column(name = "address")
    private String address;
 
    @Column(name = "phone_number")
    private String phoneNumber;
    
    @Column(name = "regular_holiday")
    private String regularHoliday;
    
    @Column(name = "number_of_seat")
    private Integer numberOfSeat;
 
    @Column(name = "created_at", insertable = false, updatable = false)
    private Timestamp createdAt;
 
    @Column(name = "updated_at", insertable = false, updatable = false)
    private Timestamp updatedAt;
    
    public String getCategoryName() {
    	return category != null ? category.getName() : null;
    }
}
