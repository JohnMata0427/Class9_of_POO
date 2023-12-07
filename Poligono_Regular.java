public class Poligono_Regular extends Regulares_2D{

    double apotema;

    public Poligono_Regular(String nombre) {
        super(nombre);
    }

    private void setApotema(double apotema) {
        apotema = getLongutid_lado() / (2 * Math.tan(Math.PI / (getNum_lados() * 2)));
        this.apotema = apotema;
    }

    public double getApotema() {
        return apotema;
    }

    public void imprimirApotema(){
        System.out.println("La apotema de la figura es: " + this.getApotema());
    }

    public void imprimirArea(){
        System.out.println("El area es: "+ this.getPerimetro() * this.getApotema() / 2);
    }
}