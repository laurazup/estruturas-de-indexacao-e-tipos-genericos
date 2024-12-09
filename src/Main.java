public class Main {
    public static void main(String[] args) {
        // Criando um objeto Strig (tipo referencial)
        String nome = "João";

        // Criando um array (tipo referencial)
        int[] numeros = {1, 2, 3, 4, 5};

        // Criando outr objeto String que aponta para o mesmo valor
        String outroNome = nome;

        // Modificando a referancia
        nome = "Maria";

        System.out.println(nome); // Maria
        System.out.println(outroNome); // Joao

        // Exibindo os valores do Array
        for(int numero : numeros) {
            System.out.println(numero);
        }
    }
}