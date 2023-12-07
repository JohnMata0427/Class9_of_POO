public class Regulares_3D extends Figura_3D{
    double longutid_arista;
    double longitud_ladocubo;

    public Regulares_3D(String nombre) {
        super(nombre);
    }

    public void setLongutid_arista(double longutid_arista) {
        this.longutid_arista = longutid_arista;
    }
    public void setLongitud_ladocubo(double longitud_ladocubo){
        this.longitud_ladocubo = longitud_ladocubo;
    }

    public double getLongutid_arista() {
        return longutid_arista;
    }
    public double getlongitud_ladocubo(){
        return longitud_ladocubo;
    }

    public void imprimirLongitud_arista(){
        System.out.println("La longitud del arista de la figura es: " + this.getLongutid_arista());
    }
    public void imprimirlongitud_ladocubo(){
        System.out.println("Ls longitudd del lado del cubo es: "+ this.getlongitud_ladocubo());
    }
}