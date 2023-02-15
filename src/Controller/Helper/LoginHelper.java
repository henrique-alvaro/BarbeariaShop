package Controller.Helper;

import Model.*;
import View.Login;

public class LoginHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        Usuario modelo = new Usuario(0, nome, senha);
        return modelo;
    }
    
    public void starModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha);
    }
    
    public void LimparTela(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }
    
}
