import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EstruturaIndexaveis {
    public static void main(String[] args) {
        // Criando um HashMap
        Map<String, String> clientes = new HashMap<>();

        // Adicionando cpf de clientes (CPF -> Nome)
        clientes.put("12345678900", "Reginaldo da Silva");
        clientes.put("12312312300", "Adriana da Silva");
        clientes.put("45645645600", "Gabriel Costa Samersla");

        // Buscando um cliente pelo CPF
        System.out.println(clientes.get("12345678900"));

        // Removendo um cliente
        clientes.remove("12312312300");

        // Verificando se um cpf existe
        System.out.println(clientes.containsKey("12312312300"));

        for (String cpf : clientes.keySet()) {
            System.out.println(cpf);
            System.out.println(clientes.get(cpf));
        }

        // Criando um TreeMap
//        TreeMap<String, String> livros = new TreeMap<>();
        Map<String, String> livros = new TreeMap<>();

        // Adicionando livros
        livros.put("Biblia", "A55");
        livros.put("Araras voadoras", "B10");
        livros.put("Jardim botanico", "V22");

        // Iterando sobre os livros em ordem alfabética
        for(String livro : livros.keySet()) {
            System.out.println(livro);
            System.out.println(livros.get(livro));
        }
    }
}
