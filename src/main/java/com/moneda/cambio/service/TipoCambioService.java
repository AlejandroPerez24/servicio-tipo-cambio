package com.moneda.cambio.service;

import com.moneda.cambio.model.TipoCambio;
import com.moneda.cambio.repository.TipoCambioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoCambioService {

    @Autowired
    private TipoCambioRepository repositorio;

    public Double aplicarTipoCambio(Double monto, String monedaOrigen, String monedaDestino) {
        TipoCambio tipoCambio = repositorio.findByMonedaOrigenAndMonedaDestino(monedaOrigen, monedaDestino);
        if (tipoCambio == null) {
            throw new IllegalArgumentException("Tipo de cambio no encontrado.");
        }
        return monto * tipoCambio.getTipoCambio();
    }

    public TipoCambio obtenerTipoCambio(String monedaOrigen, String monedaDestino) {
        TipoCambio tipoCambio = repositorio.findByMonedaOrigenAndMonedaDestino(monedaOrigen, monedaDestino);
        if (tipoCambio == null) {
            throw new IllegalArgumentException("Tipo de cambio no encontrado");
        }
        return tipoCambio;
    }

    public TipoCambio actualizarTipoCambio(String monedaOrigen, String monedaDestino, Double nuevoTipoCambio) {
        TipoCambio tipoCambio = repositorio.findByMonedaOrigenAndMonedaDestino(monedaOrigen, monedaDestino);
        if (tipoCambio == null) {
            tipoCambio = new TipoCambio();
            tipoCambio.setMonedaOrigen(monedaOrigen);
            tipoCambio.setMonedaDestino(monedaDestino);
        }
        tipoCambio.setTipoCambio(nuevoTipoCambio);
        return repositorio.save(tipoCambio);
    }
}
