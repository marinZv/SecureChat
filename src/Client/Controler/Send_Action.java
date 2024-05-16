package Client.Controler;

import Client.View.Client_view;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Send_Action extends AbstractAction {

    private Client_view client_view;
    private String msg;


    public Send_Action(Client_view client_view){
        this.client_view = client_view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        msg = client_view.getjTextField().getText();
        client_view.getClient_main().SendMessage(msg);
        client_view.getjTextField().setText("");
    }
}
