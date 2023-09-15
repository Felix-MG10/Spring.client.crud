package com.felix.felix.entities;

import com.felix.felix.enums.StatusReservation;
import com.felix.felix.enums.TypeChambre;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nume_reservation;
    private LocalDate date_reservation;
    private LocalDate arrive_client;
    private LocalDate depart_client;
    private TypeChambre typeChambre;
    private StatusReservation statusReservation;
}
