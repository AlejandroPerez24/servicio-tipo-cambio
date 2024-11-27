# servicio-tipo-cambio
# Convertidor de Moneda  

Este proyecto es una API REST desarrollada en **Java** utilizando **Spring Boot**, que permite calcular el tipo de cambio entre dos monedas. La aplicación utiliza una base de datos en memoria **H2** para gestionar los valores de tipo de cambio y está diseñada para ser probada con **Postman**.

---

## 🚀 Tecnologías Utilizadas  
- **Lenguaje de programación**: Java  
- **Framework**: Spring Boot  
- **Base de datos**: H2 Database (en memoria)  
- **Herramientas adicionales**: Lombok, Maven, Postman  

---

## ✨ Funcionalidades Requeridas  
1. **API de conversión de moneda**  
   - Recibe los parámetros:  
     - `monto`: el valor numérico a convertir.  
     - `monedaOrigen`: código de la moneda de origen (por ejemplo, "USD").  
     - `monedaDestino`: código de la moneda de destino (por ejemplo, "PEN").  
   - Devuelve:  
     - `montoOriginal`, `montoConvertido`, `monedaOrigen`, `monedaDestino` y el `tipoDeCambio` utilizado.  

2. **Base de datos en memoria**  
   - Se utiliza H2 Database para almacenar y gestionar los valores de los tipos de cambio.

3. **Pruebas desde Postman**  
   - La colección de Postman incluye pruebas para cada endpoint implementado.  

---

## 🌟 Funcionalidades Opcionales  
- **Actualización del tipo de cambio**  
   - Un endpoint POST que permite actualizar los valores del tipo de cambio entre monedas.  

---

## 📄 Endpoints Disponibles  

### 1. **GET /api/tipocambio/convertir**  
Convierte un monto de una moneda origen a una moneda destino utilizando un tipo de cambio predefinido.  
#### Parámetros:  
- **monto**: `Double` (obligatorio)  
- **monedaOrigen**: `String` (obligatorio)  
- **monedaDestino**: `String` (obligatorio)  

#### Ejemplo de solicitud:  

GET /api/tipocambio/convertir?monto=100&monedaOrigen=USD&monedaDestino=PEN


Ejemplo de respuesta:


{
    "montoOriginal": 100,
    "montoConvertido": 92.5,
    "monedaOrigen": "USD",
    "monedaDestino": "PEN",
    "tipoCambio": 0.925
}

2. POST /api/tipocambio/actualizar
Actualiza el tipo de cambio entre dos monedas.

Parámetros:
monedaOrigen: String (obligatorio)
monedaDestino: String (obligatorio)
tipoCambio: Double (obligatorio)

Ejemplo de solicitud:

POST /api/tipocambio/actualizar
Body (x-www-form-urlencoded):
monedaOrigen=USD
monedaDestino=EUR
tipoCambio=0.93

Ejemplo de respuesta:


{
    "id": 1,
    "monedaOrigen": "USD",
    "monedaDestino": "EUR",
    "tipoCambio": 0.93
}

🛠️ Cómo Ejecutar el Proyecto
Clonar el repositorio


git clone https://github.com/usuario/convertidor-de-moneda.git
cd convertidor-de-moneda
Configurar el entorno
Asegúrate de tener Java 17 y Maven instalados en tu sistema.

Ejecutar la aplicación


mvn spring-boot:run
Acceso a la base de datos H2
La consola de H2 estará disponible en:
http://localhost:8080/h2-console
Credenciales por defecto:

URL JDBC: jdbc:h2:mem:testdb
Usuario: sa
Contraseña: (sin contraseña)
Probar la API con Postman
Importa la colección de Postman incluida en el repositorio y prueba los endpoints.
