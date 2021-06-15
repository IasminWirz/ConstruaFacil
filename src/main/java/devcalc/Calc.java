//1 - Pacote (onde o João mora)
package devcalc;
//2 - Bibliotecas (coisas que o João recebe)

import java.util.Scanner;

//3 - Classe
public class Calc {
    //3.1 - Atributos (catacterísticas que o Jõao tem)
    static Scanner entrada = new Scanner(System.in); // entrada = input

    //3.2 - Métodos e Funções (coisas que o João faz e não comenta - coisas que ele faz e mostra)
    public static void main(String[] args){

        // Exibe o menu da Calculadora
        System.out.println(">>> CALCULADORA <<<");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.print("Escolha o cálculo desejado ");

        // Recebe a opção desejada

        int opcao = entrada.nextInt();
        int num1 = 0;
        int num2 = 0;
        // Pergunta os valores a serem usados no calculo
        if (opcao >= 1 && opcao <= 4) {
            System.out.print("Entre o 1º numero: ");
            num1 = entrada.nextInt();
            System.out.print("Entre o 2º numero: ");
            num2 = entrada.nextInt();
            System.out.print("O resultado é: ");
        }
        // Chama a função do calculo desejado
        switch (opcao){
            case 1:
                System.out.println(somarDoisNumeros(num1, num2));
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

        switch (opcao){
            case 2:
                System.out.println(subtrairDoisNumeros(num1, num2));
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

        switch (opcao){
            case 3:
                System.out.println(multiplicarDoisNumeros(num1, num2));
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

        switch (opcao){
            case 4:
                System.out.println(dividirDoisNumeros(num1, num2));
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }

    public static int somarDoisNumeros(int num1, int num2){
        return num1 + num2;
    }

    private static int subtrairDoisNumeros(int num1, int num2) {
        return num1 - num2;
    }

    private static int multiplicarDoisNumeros(int num1, int num2) {
        return num1 * num2;
    }

    private static int dividirDoisNumeros(int num1, int num2) {
        return num1 / num2;
    }

    public static void somarDoisNumeros() {
    }
}