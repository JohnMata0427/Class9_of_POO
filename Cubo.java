public class Cubo extends Regulares_3D{

    public Cubo(String nombre) {
        super(nombre);
    }
    public void volumenCubo(){
        System.out.println("El volumen del cubo es: " +(this.getlongitud_ladocubo()*this.getlongitud_ladocubo()*this.getlongitud_ladocubo()));
    }

}