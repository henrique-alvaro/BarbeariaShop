package View;

import Model.*;

public class Main {
    public static void main(String[] args) {
        String nome = "tiago";
        
        Servico barba = new Servico(1, "barba", 30);
        
        Cliente cliente = new Cliente(1, "Henrique", 'm', "61998825651", "qnp conj f casa 16");
        
        Usuario usuario = new Usuario(1, "Alvaro", "jubirildo");
        
    }
}
