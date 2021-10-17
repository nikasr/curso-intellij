package br.com.dio;

import br.com.dio.model.Gato;
import br.com.dio.model.Livro;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        Livro livro1 = new Livro("O SENHOR DOS ANÉIS", 500);

        System.out.println(livro1.getNome());

        /*
        int a = 5;
        int b = 3;
        System.out.println("Hello world!" + (a + b));*/
    }
}


