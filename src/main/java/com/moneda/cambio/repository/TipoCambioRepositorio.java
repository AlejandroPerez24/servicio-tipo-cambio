package com.moneda.cambio.repository;

import com.moneda.cambio.model.TipoCambio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoCambioRepositorio extends JpaRepository<TipoCambio, Long> {
    TipoCambio findByMonedaOrigenAndMonedaDestino(String monedaOrigen, String monedaDestino);
}
