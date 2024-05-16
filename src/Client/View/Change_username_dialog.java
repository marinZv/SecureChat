package Client.View;

import Client.Client_main;
import Client.View.Client_view;

import javax.swing.*;
import java.awt.*;

public class Change_username_dialog extends JDialog{
    Client_main client_main;
    public Change_username_dialog(Client_main client_main, Client_view client_view){
        super(client_view);
        this.client_main = client_main;
        initialise();
}

    public void initialise(){

        this.setTitle("Choose username");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenWidth = screenSize.width;
        this.setSize(300,60);
        this.setResizable(false);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setUndecorated(false);

        JTextField jTextField = new JTextField("",25);

        JButton button = new JButton("OK");

        jTextField.setMaximumSize(new Dimension(250,75));



        button.setSize(30,10);
        button.addActionListener(e -> client_main.setClientName(jTextField.getText()));

        this.add(jTextField,BorderLayout.CENTER);
        this.add(button,BorderLayout.EAST);

    }
}
