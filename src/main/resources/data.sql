CREATE TABLE IF NOT EXISTS tipo_cambio (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    moneda_origen VARCHAR(50) NOT NULL,
    moneda_destino VARCHAR(50) NOT NULL,
    tipo_cambio DOUBLE NOT NULL
);

INSERT INTO tipo_cambio (moneda_origen, moneda_destino, tipo_cambio) VALUES ('USD', 'PEN', 3.6);
INSERT INTO tipo_cambio (moneda_origen, moneda_destino,  tipo_cambio) VALUES ('PEN', 'USD', 0.21);
