package com.felix.felix.entities;

import com.felix.felix.enums.Payement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "client")
public class Client {
    @Id
    private int id;
    @NotNull
    private String  name;
    private String  adresse;
    private String  telephone;
    private Payement mode_payement;

}
