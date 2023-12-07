public class Figura_2D extends Figuras{
    int num_lados;

    public Figura_2D(String nombre){
        super(nombre);
    }

    public void setNum_lados(int num_lados) {
        this.num_lados = num_lados;
    }

    public int getNum_lados() {
        return num_lados;
    }

    public void imprimirNum_lados(){
        System.out.println("El número de lados de la figura es: " + this.getNum_lados());
    }
}