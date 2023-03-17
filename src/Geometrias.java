import java.util.Arrays;

public class Geometrias {

    public static void main(String args[]) {

        Rectangulo[] rects = new Rectangulo[4];

        rects[0] = new Rectangulo(2.5, 3.0);
        rects[1] = new Rectangulo(1.7, 2.2);
        rects[2] = new Rectangulo(2.8, 3.1);
        rects[3] = new Rectangulo(3.5, 1.2);
        Arrays.sort(rects);

        Circulo[] circs = new Circulo[4];

        circs[0] = new Circulo(1);
        circs[1] = new Circulo(2);
        circs[2] = new Circulo(3);
        circs[3] = new Circulo(4);
        Arrays.sort(circs);

        Triangulo[] tris = new Triangulo[4];

        tris[0] = new Triangulo(2.5, 3.0);
        tris[1] = new Triangulo(1.7, 2.2);
        tris[2] = new Triangulo(2.8, 3.1);
        tris[3] = new Triangulo(3.5, 1.2);
        Arrays.sort(tris);

        //pruebo si los compareTo sirven de manera correcta
        System.out.println("Area del primero: " + rects[0].calcularArea());
        System.out.println("Area del segundo: " + tris[3].calcularArea());
        System.out.println("Comparacion: " + rects[0].compareTo(tris[3]));

        System.out.println("Area del primero: " + circs[1].calcularArea());
        System.out.println("Area del segundo: " + rects[1].calcularArea());
        System.out.println("Comparacion: " + circs[1].compareTo(rects[1]));

        System.out.println("Area del primero: " + tris[3].calcularArea());
        System.out.println("Area del segundo: " + circs[2].calcularArea());
        System.out.println("Comparacion: " + tris[3].compareTo(circs[2]));

    }
}