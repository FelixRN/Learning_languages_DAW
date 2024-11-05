# Ejercicio 12
Crear una lista de al menos 5 moviles, definidos por su marca y cantidad de RAM.
Se compraran los moviles de más de 8GB de RAM y los otros se descartaran.

* OBLIGAORIO: `clase` en _camelcase_ con primera __letra mayúscula.__
* OBLIGAORIO: __Cada clase tiene un fichero__ y con el __nombre de la clase.__
* OBLIGAORIO: `Propiedades`, `variables`, y `métodos` y `funciones` en _camelcase_ con __primera letra minúscula__
* Muy recomendado: Programar y realizar búsquedas en inglés
* OBLIGATORIO: Los modelos tienen que tener _propiedades privadas_
* Muy recomendado: Uso del this con las propiedades
* Muy recomendado: Programar y realizar búsquedas en inglés
* Muy recomendado: Mantener formateo del código (cuidado con: tabulaciones, lineas vacías)

## Análisis

### Modelo
* Brand: String
* ramGB: int

### Lógica de negocio
* Crear lista de moviles
* Instanciar y añadir a la lista 5 móviles
* Recorremos la lista
  * Comprobamos si tiene más de 8 GB de ram.
    * Si SI lo "compramos"
