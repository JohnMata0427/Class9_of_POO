public class Figuras {
    String nombre;

    public Figuras(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void imprimirNombre(){
        System.out.println("El nombre de la figura es: " + this.getNombre());
    }
}
