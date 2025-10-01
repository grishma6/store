package com.example.store.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "profiles" )
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "bio")
    private String bio;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @Column(name = "date_of_birth")
    private Long dateOfBirth;

    @Column(name = "loyalty_points")
    private Long loyaltyPoints;



}
