public class MultiCach {
    public static void main(String[] args) {
        String[] valores = {"10", "vinte", "30", null};

        
        for (String valor : valores) {// Para cada valor em valores
            try {
                // Tenta converter e multiplicar por 2
                int numero = Integer.parseInt(valor);
                System.out.println("O dobro de " + valor + " é: " + (numero * 2));
                
            }catch(NumberFormatException | NullPointerException e){
            System.out.println("Erro: O valor atual é inválido ou nulo.");

        }
       
    }
    
    }
}
