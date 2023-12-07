public class Regulares_2D extends Figura_2D{
    double longutid_lado, perimetro;

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

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void calcularPerimetro(){
        perimetro = this.getNum_lados() * this.getLongutid_lado();
        setPerimetro(perimetro);
        System.out.println("El perimetro es: "+ this.getPerimetro());
    }
}