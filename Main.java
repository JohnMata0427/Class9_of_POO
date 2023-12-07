import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int opcion;
        do {
            System.out.println("--------FIGURAS---------");
            System.out.println(" * 1 --> Figura 2D");
            System.out.println(" * 2 --> Figura 3d");
            System.out.println(" * 3 --> Salir del sistema");
            System.out.printf(" Elije una opción: ");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("----Figuras 2d-----");
                    System.out.println(" * 1 --> Regulares");
                    System.out.println(" * 2 --> Irregulares");
                    System.out.printf("Elije una opcion: ");
                    opcion=scanner.nextInt();
                    switch (opcion){
                        case 1:
                            System.out.println(" * 1 --> Cuadrado");
                            System.out.println(" * 2 --> Pentagono");
                            System.out.printf("Elije una opcion: ");
                            opcion=scanner.nextInt();
                            switch (opcion){
                                case 1:
                                    System.out.println("Ingresa la longitud del lado del cuadrado: ");
                                    double lado=scanner.nextDouble();
                                    System.out.println(lado);
                                    break;
                                case 2:
                                    System.out.println("Ingresa la longitud del lado del pentagono: ");
                                    lado=scanner.nextDouble();
                                    System.out.println(lado);
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Figura: Triangulo");
                            System.out.println("Ingresa el lado 1 del triangulo: ");
                            double lado1=scanner.nextDouble();
                            System.out.println("Ingresa el lado 2 del triangulo: ");
                            double lado2=scanner.nextDouble();
                            System.out.println("Ingresa el lado 3 del triangulo: ");
                            double lado3=scanner.nextDouble();
                            System.out.println(lado1+lado3+lado2);
                            break;
                    }
                case 2:
                    System.out.println("------Figuras 3D------");
                    System.out.println(" * 1 --> Ingrese la longitud de la arista del cubo: ");
                    double longitud_arista=scanner.nextDouble();
                    System.out.println(longitud_arista);
            }
        }while(opcion!=3);
    }
}