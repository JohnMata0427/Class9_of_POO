public class Triangulo_escaleno extends Irregulares{

    double longitud_lado3;

    public Triangulo_escaleno(String nombre) {
        super(nombre);
    }

    public void setLongitud_lado3(double longitud_lado3) {
        this.longitud_lado3 = longitud_lado3;
    }   

    public double getLongitud_lado3() {
        return longitud_lado3;
    }
    
    public void perimetro_te() {
        System.out.println("El perimetro del triangulo escaleno es: "+(this.getLongutid_lado1()+this.getLongutid_lado2()+this.getLongitud_lado3()));
    }
}
