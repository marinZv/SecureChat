package Client.Controler;

import Client.View.Client_view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Enter_Action extends KeyAdapter {

    private Client_view client_view;
    private String msg;

    public Enter_Action(Client_view client_view){
        this.client_view = client_view;
    }

    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
        msg = client_view.getjTextField().getText();
        client_view.getClient_main().SendMessage(msg);
        client_view.getjTextField().setText("");
        }
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
            client_view.getClient_main().exit();
        }
    }
}
