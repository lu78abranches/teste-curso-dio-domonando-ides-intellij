package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);


        Livros livro1 = new Livros("Os três Porquinhos", 450 );
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a + b));*/

    }
}

    class  Livros {

    private String name;
    private Integer numPaginas;

        public Livros(String name, Integer numPaginas) {
            this.name = name;
            this.numPaginas = numPaginas;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(Integer numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "Livros{" +
                    "name='" + name + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }
    }
