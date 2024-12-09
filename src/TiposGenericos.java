public class TiposGenericos {
    public static void main(String[] args) {
        // Caixa para Strings
        Caixa<String> caixaDeLivros = new Caixa<>();
        caixaDeLivros.guardar("Biblia");
        System.out.println(caixaDeLivros.abrir());

        // Caixa de numeros
        Caixa<Integer> caixaDeNumeros = new Caixa<>();
        caixaDeNumeros.guardar(30);
        System.out.println(caixaDeNumeros.abrir());
    }
}
