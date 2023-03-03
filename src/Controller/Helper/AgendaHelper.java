package Controller.Helper;

import Model.Agendamentos;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class AgendaHelper {
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }
    
    
    public void preencherTabela(ArrayList<Agendamentos> agendamentos){
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        
        for (Agendamentos agendamento : agendamentos){
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getData(),
                agendamento.getData(),
                agendamento.getObservacao()
            });
        }
        
    }
}
