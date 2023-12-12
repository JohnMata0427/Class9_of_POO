public class Triangulo_escaleno extends Irregulares{

    double longitud_lado3, semiperimetro;

    public Triangulo_escaleno(String nombre) {
        super(nombre);
    }

    public void setLongitud_lado3(double longitud_lado3) {
        this.longitud_lado3 = longitud_lado3;
    }   

    public double getLongitud_lado3() {
        return longitud_lado3;
    }

    public void setSemiperimetro(double semiperimetro) {
        this.semiperimetro = semiperimetro;
    }

    public double getSemiperimetro() {
        return semiperimetro;
    }

    @Override
    public void imprimirArea() {
        setSemiperimetro((this.getLongutid_lado1()+this.getLongutid_lado2()+this.getLongitud_lado3())/2);
        double area = Math.sqrt(this.getSemiperimetro()*(this.getSemiperimetro()-this.getLongutid_lado1())*(this.getSemiperimetro()-this.getLongutid_lado2())*(this.getSemiperimetro()-this.getLongitud_lado3()));
        System.out.println("El area del triangulo escaleno es: "+ area);
    }

    @Override
    public void imprimirPerimetro() {
        System.out.println("El perimetro del triangulo escaleno es: "+(this.getLongutid_lado1()+this.getLongutid_lado2()+this.getLongitud_lado3()));
    }
}