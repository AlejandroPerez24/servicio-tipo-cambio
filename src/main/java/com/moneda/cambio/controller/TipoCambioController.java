package com.moneda.cambio.controller;

import com.moneda.cambio.dto.RespuestaConversion;
import com.moneda.cambio.model.TipoCambio;
import com.moneda.cambio.service.TipoCambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tipocambio")
public class TipoCambioController {

    @Autowired
    private TipoCambioService servicio;

        @GetMapping("/convertir")
    public RespuestaConversion convertir(
            @RequestParam Double monto,
            @RequestParam String monedaOrigen,
            @RequestParam String monedaDestino) {
        Double montoConvertido = servicio.aplicarTipoCambio(monto, monedaOrigen, monedaDestino);
        TipoCambio tipoCambio = servicio.obtenerTipoCambio(monedaOrigen, monedaDestino);

        return new RespuestaConversion(monto, montoConvertido, monedaOrigen, monedaDestino, tipoCambio.getTipoCambio());
    }


    @PostMapping("/actualizar")
    public TipoCambio actualizarTipoCambio(
            @RequestParam String monedaOrigen,
            @RequestParam String monedaDestino,
            @RequestParam Double tipoCambio) {
        return servicio.actualizarTipoCambio(monedaOrigen, monedaDestino, tipoCambio);
    }
}
