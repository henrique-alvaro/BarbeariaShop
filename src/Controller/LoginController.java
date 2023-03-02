package Controller;

import Controller.Helper.LoginHelper;
import Model.*;
import Model.DAO.UsuarioDAO;
import View.Login;
import View.MenuPrincipal;

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
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null){
            //navegar para menur principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
        } else{
            view.exibirMensagem("Usuario ou senha invalidos");
        }
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        this.view.exibirMensagem("Executei Arquivo");
    }
    
    
}
