package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamentos;
import Model.DAO.AgendamentoDAO;
import View.Agenda;
import java.util.ArrayList;

public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    
    public void atualizaTabela(){
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamentos> agendaamentos = agendamentoDAO.selectAll();
        
        
    }
}
