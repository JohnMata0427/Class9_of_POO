public class Prisma extends Regulares_2D{
    public Prisma(String nombre) {
        super(nombre);
    }

    public void areaPrisma(){
        System.out.println("El área del prisma es: " + (this.getLongutid_lado() * this.getLongutid_lado()));
    }
}