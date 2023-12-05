public class Regulares_3D extends Figura_3D{
    double longutid_arista;

    public Regulares_3D(String nombre) {
        super(nombre);
    }

    public void setLongutid_arista(double longutid_arista) {
        this.longutid_arista = longutid_arista;
    }

    public double getLongutid_arista() {
        return longutid_arista;
    }

    public void imprimirLongitud_arista(){
        System.out.println("La longitud del arista de la figura es: " + this.getLongutid_arista());
    }
}