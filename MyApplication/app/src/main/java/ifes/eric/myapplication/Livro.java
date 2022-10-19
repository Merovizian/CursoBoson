package ifes.eric.myapplication;


// CLASE LIVROS
public class Livro {

    // ATRIBUTOS
    String nome, descricao, autor, isbn, dataPub;
    double preco;

    // METODO
    String dadosLivro(){

        String detalhado;
        detalhado = "O livro " + nome + " foi escrito por " + autor + " na data de " +
        dataPub + " tem a seguinte descrição \"" + descricao + "\" e custa R$" + preco;
        return detalhado;
    }









}
