package com.moneda.cambio.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipo_cambio")
@Data
public class TipoCambio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String monedaOrigen;
    private String monedaDestino;
    private Double tipoCambio;

}
