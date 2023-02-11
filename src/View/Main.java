package View;

import Model.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Henrique", "ponte al norte", "72427010");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "Alvaro", "jubirildo");
        System.out.println(usuario.getNome());
        
        Servico s = new Servico(4, "degrade", 25);
        
        
        Agendamentos agendamento = new Agendamentos(1, cliente, s, 25, "15/02/2023 09:15");
        System.out.println(agendamento.toString());
    }
}
