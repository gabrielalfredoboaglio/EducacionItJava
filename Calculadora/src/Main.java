public class Main {
    public static void main(String[] args) {

        int valorA = Integer.parseInt(args[0]);
        int valorB = Integer.parseInt(args[1]);
        String tipoOperacion = args[2].toUpperCase();
        int resultado;

        switch (tipoOperacion) {
            case "SUM":
                resultado = Calculadora.sumar(valorA, valorB);
                break;
            case "RES":
                resultado = Calculadora.restar(valorA, valorB);
                break;
            case "MUL":
                resultado = Calculadora.multiplicar(valorA, valorB);
                break;
            case "DIV":
                resultado = Calculadora.dividir(valorA, valorB);
                break;
            default:
                System.out.println("Error: Tipo de operación no válido. Las opciones son: SUM, RES, MUL, DIV.");
                return;
        }

        System.out.println("El resultado de la operación es: " + resultado);
    }
}