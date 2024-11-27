package com.moneda.cambio.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RespuestaConversion {
    private Double montoOriginal;
    private Double montoConvertido;
    private String monedaOrigen;
    private String monedaDestino;
    private Double tipoCambio;

    public RespuestaConversion(Double montoOriginal, Double montoConvertido, String monedaOrigen, String monedaDestino, Double tipoCambio) {
        this.montoOriginal = montoOriginal;
        this.montoConvertido = montoConvertido;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.tipoCambio = tipoCambio;
    }

}
