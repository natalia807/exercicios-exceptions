public class AcessoArray {
    public static void main(String[] args) {
        int[] idades = {15, 20, 30};

        try {
            System.out.println(idades[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Essa posição não existe no sistema.");
        }
    }
    
}
