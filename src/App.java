public class App {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(31);
        int edadfinal = persona.getEdad();
        System.out.println("la Edad es de: " + edadfinal);

        Persona tel = new Persona();
        tel.setTelefono(7627474);
        int telefonofinal = tel.getTelefono();
        System.out.println("el numero de telefono es: " + telefonofinal);

        Persona name = new Persona();
        name.setNombre("Gerley");
        String nombrefinal = name.getNombre();
        System.out.println("el nombre es: " + nombrefinal);
    }
}

class Persona{

    private int edad;
    private int telefono;
    private String nombre;
    
// Getters and setters edad
    public void setEdad(int valedad){
        this.edad = valedad;
    }
    public int getEdad(){
        return this.edad;
    }

// Getters and setters telefono
    public void setTelefono(int valtelefono){
        this.telefono = valtelefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

 // Getters and setters Nombre
    public void setNombre(String elnombre){
        this.nombre = elnombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }

}
