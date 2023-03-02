package Controller;

import View.*;

public class MenuPrincipalContoller {
    private final MenuPrincipal view;

    public MenuPrincipalContoller(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }
    
    
}
