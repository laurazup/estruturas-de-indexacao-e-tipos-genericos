public class Caixa <G> {
    private G conteudo;
    public void guardar(G item) {
        this.conteudo = item;
    }
    public G abrir() {
        return conteudo;
    }
}

//Convenções mais comuns:
//Letra	Significado	Quando usar
//T	Type (Tipo)	Usado para representar um tipo genérico em geral.
//E	Element (Elemento)	Usado em coleções, como listas ou conjuntos, para representar os elementos armazenados.
//K	Key (Chave)	Usado em mapas para representar a chave.
//V	Value (Valor)	Usado em mapas para representar o valor.
//R	Return (Retorno)	Usado para representar o tipo de retorno de um método genérico.
