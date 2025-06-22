public class Livro {
    String titulo;
    boolean emprestado;

    public void emprestar() {
        emprestado = true;
    }

    public String status() {
        if (emprestado) {
            return "Indisponível";
        }
        return "Disponível";
    }
}

public class Main { // Pode ser necessário criar uma classe Main para executar o código
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.titulo = "Java para Iniciantes";
        System.out.println(l1.status());
        l1.emprestar();
        System.out.println(l1.status()); // Disponível / Indisponível
    }
}