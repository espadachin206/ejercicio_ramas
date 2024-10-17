public class Formato {
    public static void main(String[] args) {

        int NumeroEntero = 31;
        double NumeroReal = 2.76;
        char caracter = 'A';
        String cadena = "Hola mundo";

        System.out.printf("El numero %d no tiene decimales pero %f si los tiene\n", NumeroEntero, NumeroReal);

        System.out.printf("Numero entero %d\n", NumeroEntero);
        System.out.printf("Numero real %.2f\n", NumeroReal);
        System.out.printf("Un caracter %c\n", caracter);
        System.out.printf("Cadena de caracteres %s\n", cadena);

        System.out.printf("%d, %f, %c, %s\n", NumeroEntero, NumeroReal, caracter, cadena);

        System.out.printf("La probabilidad de lluvia es del %d%%\n", NumeroEntero);


    }
}
