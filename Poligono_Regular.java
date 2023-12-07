public class Poligono_Regular extends Regulares_2D{

    double apotema;

    public Poligono_Regular(String nombre) {
        super(nombre);
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getApotema() {
        return apotema;
    }

    public void imprimirApotema(){
        apotema = getLongutid_lado() / (2 * Math.tan(Math.PI / (getNum_lados() * 2)));
        setApotema(apotema);
        System.out.println("El apotema es: " + getApotema());
    }
}