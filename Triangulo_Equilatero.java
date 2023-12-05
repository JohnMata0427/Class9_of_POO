public class Triangulo_Equilatero extends Regulares_2D{

    public Triangulo_Equilatero(String nombre) {
        super(nombre);
    }

    public void areaTriangulo_Equilatero(){
        System.out.println("El área del triángulo equilatero es: " + (this.getLongutid_lado() * this.getLongutid_lado()) / 2);
    }
}