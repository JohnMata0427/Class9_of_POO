public class Poligono_Regular extends Regulares_2D{
    public Poligono_Regular(String nombre) {
        super(nombre);
    }

    public void imprimirNum_lados(){
        System.out.println("El número de lados del poligono es: " + this.getNum_lados());
    }
}