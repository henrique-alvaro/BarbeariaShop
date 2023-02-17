package Controller;

import Controller.Helper.LoginHelper;
import Model.*;
import View.Login;

public class LoginController {
    private final Login view;
    private final LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    public void entrarNoSistema(){
        Usuario usuario = helper.obterModelo();
        //Pesquisar usuario no Banco
        
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        this.view.exibirMensagem("Executei Arquivo");
    }
    
    
}
