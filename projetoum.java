import java.util.Scanner;

public class projetoum {
    double numero1;
    double numero2;

    public static void main(String[] args) { 


Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

     System.out.println("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0); 

    System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double Resultado = 0;

        switch (operador) {
            case '+':
             Resultado = numero1 + numero2;
            break;

            case '-':
            Resultado = numero1 - numero2;
            break;

            case '*':
            Resultado = numero1 * numero2;
            break;

            case '/':
            if (numero2 != 0) { 
            Resultado = numero1 / numero2; }
            else {
                    System.out.println("Erro: Divisão por zero não é válido!");
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                return; // para caso o operador seja inválido
        }

        // Resultados:
        System.out.println(numero1 + " " + operador + " " + numero2 + " = " + Resultado);

        scanner.close(); // Fecha o scanner modo calculadora.

        }

    }