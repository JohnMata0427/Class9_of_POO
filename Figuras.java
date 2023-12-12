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

    public void imprimirArea() {
        System.out.println("El area de la figura es: ");
    }
    
    public void imprimirPerimetro() {
        System.out.println("El perimetro de la figura es: ");
    }
}
