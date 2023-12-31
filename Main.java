import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcion, opcion2, opcion3;

        do {
            System.out.println("\n--------FIGURAS---------");
            System.out.println(" * 1 --> Figura 2D");
            System.out.println(" * 2 --> Figura 3D");
            System.out.println(" * 3 --> Salir del sistema");
            System.out.printf(" Elije una opción: ");

            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("\n----Figuras 2D-----");
                    System.out.println(" * 1 --> Regulares");
                    System.out.println(" * 2 --> Irregulares");
                    System.out.printf("Elije una opcion: ");

                    opcion2 = scanner.nextInt();

                    switch (opcion2){
                        case 1:
                            System.out.println("\n----Figuras Regulares-----");
                            System.out.println(" * 1 --> Cuadrado");
                            System.out.println(" * 2 --> Pentagono");
                            System.out.printf("Elije una opcion: ");

                            opcion3 = scanner.nextInt();

                            switch (opcion3){
                                case 1:
                                    Cuadrado nuevo_cuadrado = new Cuadrado("Cuadrado");
                                    System.out.print("\nIngresa la longitud del lado del cuadrado: ");
                                    nuevo_cuadrado.setLongutid_lado(scanner.nextDouble());
                                    nuevo_cuadrado.setNum_lados(4);
                                    System.out.println("");

                                    nuevo_cuadrado.imprimirNombre();
                                    nuevo_cuadrado.imprimirLongitud_lado();
                                    nuevo_cuadrado.imprimirDiagonal();
                                    nuevo_cuadrado.calcularPerimetro();
                                    nuevo_cuadrado.imprimirArea();
                                    break;
                                case 2:
                                    Pentagono nuevo_pentagono = new Pentagono("Pentagono");
                                    System.out.print("\nIngresa la longitud del lado del Pentagono: ");
                                    nuevo_pentagono.setLongutid_lado(scanner.nextDouble());
                                    nuevo_pentagono.setNum_lados(5);
                                    System.out.println("");

                                    nuevo_pentagono.imprimirNombre();
                                    nuevo_pentagono.imprimirLongitud_lado();
                                    nuevo_pentagono.imprimirAngulo_central();
                                    nuevo_pentagono.imprimirApotema();
                                    nuevo_pentagono.calcularPerimetro();
                                    nuevo_pentagono.imprimirArea();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("\n----Figuras Irregulares-----");
                            System.out.println(" * 1 --> Rectangulo");
                            System.out.println(" * 2 --> Triangulo Escaleno");
                            System.out.printf("Elije una opcion: ");
                            opcion3 = scanner.nextInt();
                            switch (opcion3){
                                case 1:
                                    Rectangulo nuevo_rectangulo = new Rectangulo("Rectangulo");
                                    System.out.print("\nIngresa la longitud del lado 1 del rectangulo: ");
                                    nuevo_rectangulo.setLongutid_lado1(scanner.nextDouble());
                                    System.out.print("Ingresa la longitud del lado 2 del rectangulo: ");
                                    nuevo_rectangulo.setLongutid_lado2(scanner.nextDouble());
                                    nuevo_rectangulo.setNum_lados(4);
                                    System.out.println("");

                                    nuevo_rectangulo.imprimirNombre();
                                    nuevo_rectangulo.imprimirNum_lados();
                                    nuevo_rectangulo.imprimirPerimetro();
                                    nuevo_rectangulo.imprimirArea();
                                    break;
                                case 2:
                                Triangulo_escaleno nuevo_triangulo = new Triangulo_escaleno("Triangulo Escaleno");
                                    System.out.print("\nIngresa la longitud del lado 1 del triangulo escaleno: ");
                                    nuevo_triangulo.setLongutid_lado1(scanner.nextDouble());
                                    System.out.print("Ingresa la longitud del lado 2 del triangulo escaleno: ");
                                    nuevo_triangulo.setLongutid_lado2(scanner.nextDouble());
                                    System.out.print("Ingresa la longitud del lado 3 del triangulo escaleno: ");
                                    nuevo_triangulo.setLongitud_lado3(scanner.nextDouble());
                                    nuevo_triangulo.setNum_lados(3);
                                    System.out.println("");

                                    nuevo_triangulo.imprimirNombre();
                                    nuevo_triangulo.imprimirNum_lados();
                                    nuevo_triangulo.imprimirPerimetro();
                                    nuevo_triangulo.imprimirArea();
                                    break;
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n------Figuras 3D------");
                    System.out.println("Figura: Cubo");
                    System.out.print(" * Ingrese la longitud de la arista del cubo: ");
                    Cubo nuevo_cubo = new Cubo("Cubo");
                    nuevo_cubo.setLongitud_ladocubo(scanner.nextDouble());
                    nuevo_cubo.setNum_caras(6);
                    System.out.println("");

                    nuevo_cubo.imprimirNombre();
                    nuevo_cubo.imprimirlongitud_ladocubo();
                    nuevo_cubo.imprimirNum_caras();
                    nuevo_cubo.imprimirArea();
                    nuevo_cubo.volumenCubo();
                    break;
            }
        }while(opcion!=3);
    }
}