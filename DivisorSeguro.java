import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisorSeguro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{

            System.out.print("Digite o primeiro número inteiro: ");
            int num1 = scanner.nextInt();
    
            System.out.print("Digite o segundo número inteiro: ");
            int num2 = scanner.nextInt();
    
            if (num2 != 0) {
                double resultado = (double) num1 / num2;
                System.out.println("Resultado da divisão: " + resultado);
            } else {
                System.out.println("Erro: Não é possível dividir um número por zero.");
            }
    
            scanner.close();
        }
        catch(InputMismatchException e1){
            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");

        }catch(ArithmeticException e2){
        System.err.println("O número do divisor deve ser diferente de 0!");
      }finally{
        System.out.println("Execução do Finally!");
      }
    }
    
}
