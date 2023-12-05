public class Figura_3D extends Figuras{
    int num_caras;

    public Figura_3D(String nombre){
        super(nombre);
    }

    public void setNum_caras(int num_caras) {
        this.num_caras = num_caras;
    }

    public int getNum_caras() {
        return num_caras;
    }

    public void imprimirNum_caras(){
        System.out.println("El número de caras de la figura es: " + this.getNum_caras());
    }
}