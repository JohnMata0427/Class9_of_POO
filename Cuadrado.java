public class Cuadrado extends Poligono_Regular{
    public Cuadrado(String nombre) {
        super(nombre);
    }

    public void areaCuadrado(){
        System.out.println("El área del cuadrado es: " + (this.getLongutid_lado() * this.getLongutid_lado()));
    }
}
