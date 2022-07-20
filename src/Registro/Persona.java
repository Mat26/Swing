package Registro;



public class Persona {
    
    private String name;
    private String apellido;
    private int edad;

    public Persona(String name, String apellido, int edad) {
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
