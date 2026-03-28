/*Crie um programa que:
✔ Peça um número
✔ Faça divisão por outro número
✔ Trate erro de: divisão por zero e entrada inválida */
import java.util.Scanner;
public class Divisao {

    public static void main(String[] args) {

        try{
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite um número para divisão: ");
        num2 = scanner.nextInt();

        int resultado = num1/num2;

        System.out.println("Resultado: " + resultado);

        }catch (ArithmeticException e) {
        System.out.println("Não pode dividir por zero!");//unchecked: não é obrigado a tratar.
        } catch (Exception e) {
        System.out.println("Entrada inválida!");
        }
    }

}
