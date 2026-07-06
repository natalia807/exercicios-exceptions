//Erros específicos vem antes de erros genéricos
public class TesteHierarquia {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) { 
            System.out.println("Erro: Divisão por zero!");
        }
         catch (Exception e) { 
            System.out.println("Ocorreu um erro genérico.");
    }

    }
}
