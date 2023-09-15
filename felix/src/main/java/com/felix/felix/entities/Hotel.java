package com.felix.felix.entities;

import com.felix.felix.enums.Tarifs;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String  hotel_name;
    private String  hotel_adresse;
    private String  hotel_telephone;
    private int nbChambres;
    private Tarifs tarifs;
}