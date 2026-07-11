public class TextoParaNumero {
    public static void main(String[] args) {
        String entrada = "vinte";

        try {
            Integer.parseInt("vinte");
        }catch(NumberFormatException e){
            System.out.println("Apenas números são aceitos.");
        }
    }

    
}
