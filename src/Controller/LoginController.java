package Controller;

import View.Login;

public class LoginController {
    private final Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    
    
    public void entrarNoSistema(){
        //Pegar um usuario da view
        //Pesquisar usuario no Banco
        
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        this.view.exibirMensagem("Executei Arquivo");
    }
    
    
}
