# Sentencias de control

## If-else 
- Estructura que ejecuta un bloque de código si se cumple una condicioón
- __Puede__ tener varios bloques con su condición que se van ejecutando en cascada,sí no se cumple ninguna condición __puede__ ejecutarse un bloque llamdo `else` .
 

### Estructura (If-else)
```
if (condition){
    //Si SÍ cumple la condición
}
// No es obligatoria
else if (condicion2) {
    //Si NO cumple ninguna condición2
}
// No es obligatoria
else {
    //Si NO cumple ninguna condición
}
```

## Switch
- Estructura de control que ejecuta un bloque de código si se cumple un valor.
- __Puede__ tener varios bloques con sus bloques. Si no se cumple ninguna condicion __puede__ ejecutarse un bloque llamdo `default`. Después de cada bloque se usa `break` para indicar que termina el bloque (se puede no poner y ejecutaría el bloque siguiente).

### Estructura (Switch)
```
switch(valor) {  
    case 'valor1':  
    // Si SI valor == valor1
    break;

  case 'valor2':  
  // Si SI valor == valor2
    ...
    [break]

  default:
    ...
    [break]
}
...................

String tipoDia = "";
String diaSemana = "Lunes";

switch (diaSemana.toLowerCase()) {
case "lunes":
tipoDia = "Inicio de semana";
break;
case "martes":
case "míercoles":
case "jueves":
tipoDia = "Mediados de semana";
break;
case "viernes":
tipoDia = "Inicio de fin se semana";
break;
case "sábado":
case "domingo":
tipoDia = "Fin de seman";
break;
}

System.out.println(diaSemana + " es " + tipoDia);
```

## Ternary
-Estructura de control que asigna a una variable, dependiendo de una condición, un valor par ael caso verdadero u otro valor para el falso

### Estructura (Ternary)
```
variable variableName = (condición) ? valorSiVerdadero : valorSiFalso;
```