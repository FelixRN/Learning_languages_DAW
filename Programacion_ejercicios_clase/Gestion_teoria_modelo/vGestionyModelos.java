public class vGestionyModelos {
    public static void main(String[] args) {
    
    // Instancia de la clase Modelo
    Modelo modelo = new Modelo();
    modelo.setName("El modelo 7-S de McKinsey");
    modelo.setDescripcion("Desarrollado por consultores de McKinsey & Company, el Modelo 7-S de McKinsey consiste en dividir un programa de cambio en siete componentes en los que centrarse:\n"
    + "1. Estrategia de cambio\n"
    + "2. Estructura de tu empresa\n"
    + "3. Sistemas y procesos empresariales\n"
    + "4. Valores y cultura de empresa compartidos\n"
    + "5. Estilo o forma de trabajar\n"
    + "6. Personal implicado\n"
    + "7. Competencias de tu personal");
    
    System.out.println("Info del Modelo 7-S de McKinsey:");
    System.out.println(modelo.toString());
    
    // Instancia de la clase Teoria
    Teoria teoria = new Teoria();
    teoria.setName("Teoría de la U");
    teoria.setDescripcion("Es un método de desarrollo personal que se enfoca en fomentar la innovación y cambiar las empresas a través de una serie de herramientas que permiten conocerse a uno mismo.\n"
    + "Explica que según como hagamos frente a una determinada situación va a ser clave en el éxito en el que se vaya a desarrollar.\n"
    + "Muchas veces pensamos de forma negativa, interiorizando que no seremos capaces de hacer lo que nos proponemos.\n"
    + "Esto influye directamente en nuestra forma de actuar, enfocando la acción con la mentalidad de que no va a suceder.");
    
    System.out.println("Info de la Teoría de la U:");
    System.out.println(teoria.toString());
    }
    }
    
    // Definición de la clase Teoria
    class Teoria {
    private String Name;
    private String descripcion;
    
    public String getName() {
    return Name;
    }
    
    public void setName(String Name) {
    this.Name = Name;
    }
    
    public String getDescripcion() {
    return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
    }
    
    // Método toString para imprimir la información de la teoría
    @Override
    public String toString() {
    return "Nombre: " + this.Name + "\nDescripción: " + this.descripcion;
    }
    }
    
    // Definición de la clase Modelo
    class Modelo {
    private String Name;
    private String descripcion;
    
    public String getName() {
    return Name;
    }
    
    public void setName(String Name) {
    this.Name = Name;
    }
    
    public String getDescripcion() {
    return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
    }
    
    // Método toString para imprimir la información del modelo
    @Override
    public String toString() {
    return "Nombre: " + this.Name + "\nDescripción: " + this.descripcion;
    }
    }