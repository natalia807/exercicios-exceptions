import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeitorConfig {
    public static void main(String[] args) {
        System.out.println("Iniciando leitura do arquivo...");
        
        try {
            // Tentando abrir um arquivo que provavelmente não existe no seu diretório
            FileReader arquivo = new FileReader("config.txt");
            System.out.println("Arquivo aberto com sucesso!");
            
        } catch (FileNotFoundException e) {
            System.out.println("Aviso: O arquivo 'config.txt' não foi encontrado. Carregando padrões.");
            
        } finally {
            // O bloco finally SEMPRE executa, dando erro ou não
            System.out.println("Encerrando conexões com o sistema de arquivos...");
        }
    }
    
}
