public class Regulares_2D extends Figura_2D{
    double longutid_lado;

    public Regulares_2D(String nombre) {
        super(nombre);
    }

    public void setLongutid_lado(double longutid_lado) {
        this.longutid_lado = longutid_lado;
    }

    public double getLongutid_lado() {
        return longutid_lado;
    }

    public void imprimirLongitud_lado(){
        System.out.println("La longitud del lado de la figura es: " + this.getLongutid_lado());
    }

    public void calcularPerimetro(){
        System.out.println("El perimetro es: "+ this.getNum_lados() * this.getLongutid_lado());
    }
}