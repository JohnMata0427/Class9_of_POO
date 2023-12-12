public class Cubo extends Regulares_3D{

    public Cubo(String nombre) {
        super(nombre);
    }

    public void volumenCubo(){
        System.out.println("El volumen del cubo es: " +(this.getlongitud_ladocubo()*this.getlongitud_ladocubo()*this.getlongitud_ladocubo()));
    }

    @Override
    public void imprimirArea() {
        System.out.println("El area del cubo es: "+(6*(this.getlongitud_ladocubo()*this.getlongitud_ladocubo())));
    }
}