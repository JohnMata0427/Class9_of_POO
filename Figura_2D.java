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
}