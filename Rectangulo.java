public class Rectangulo extends Irregulares{
    public Rectangulo(String nombre) {
        super(nombre);
    }

    @Override
    public void imprimirArea() {
        System.out.println("El area del rectangulo es: "+this.getLongutid_lado1()*this.getLongutid_lado2());
    }

    @Override
    public void imprimirPerimetro() {
        System.out.println("El perimetro del rectangulo es: "+2*(this.getLongutid_lado1()+this.getLongutid_lado2()));
    }
}