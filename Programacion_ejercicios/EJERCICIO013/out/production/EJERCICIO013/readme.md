# Ejercicio 13
Crear una lista de al menos 5 botes de pintura, definidos por su marca y cantidad en litros y nombre del color.
Se simulara que un usuario quiere comprar los botes de la lista y le indicara a un vendedor el tamaño y color que quiere. El vendedor le indicara que:

* Si es de más de 1L o igual, se imprimirá que es de tamaño grande, o si no de tamaño pequeño.
* Para imprimir el color se hará con el color hexadecimal que se disponga en la tienda. Se usará una función de ColorUtils
* Al menos uno de los colores no se encuentra controlado por que se ha de decir que no se dispone de ese bote de pintura.



* OBLIGATORIO: Empezar por el Análisis
* OBLIGAORIO: `clase` en _camelcase_ con primera __letra mayúscula.__
* OBLIGAORIO: __Cada clase tiene un fichero__ y con el __nombre de la clase.__
* OBLIGAORIO: `Propiedades`, `variables`, y `métodos` y `funciones` en _camelcase_ con __primera letra minúscula__
* Muy recomendado: Programar y realizar búsquedas en inglés
* OBLIGATORIO: Los modelos tienen que tener _propiedades privadas_
* Muy recomendado:Uso de git
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