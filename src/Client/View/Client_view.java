package Client.View;

import Client.Client_main;
import Client.Controler.Enter_Action;
import Client.Controler.Send_Action;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Client_view extends JFrame {

    private static Client_view instance;
    private Client_main client_main;
    private JTextArea jTextArea;
    private JTextField jTextField;
    private JButton jButton;
    private JPanel bottonPane;
    private JScrollPane jScrollPane;
    private Change_username_dialog changeUsernamedialog;

    public static Client_view getInstance(){
        return instance;
    }

    public static Client_view getInstance(Client_main client_main){
        if(instance == null){
            instance = new Client_view(client_main);
            instance.init();
            instance.initDialog();
        }
        return instance;
    }
    private Client_view(Client_main client_main){
        this.client_main = client_main;
    }

    private void init(){
        try {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e){

        }
        initGui();

    }

    private void initDialog(){
        changeUsernamedialog = new Change_username_dialog(client_main,this);
        changeUsernamedialog.setLocationRelativeTo(this);
        changeUsernamedialog.setVisible(true);
    }

    private void initGui(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenW = screenSize.width;
        int screenH = screenSize.height;
        setSize(screenW/2,screenH/2);
        setLocationRelativeTo(null);;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Super Awsome Secure Chat by Milan and Petar");

        jTextArea = new JTextArea();
        jTextArea.setEnabled(false);
        jScrollPane = new JScrollPane(jTextArea);
        jTextField = new JTextField();
        jButton = new JButton("Send");
        add(jScrollPane,BorderLayout.CENTER);
        bottonPane = new JPanel();
        bottonPane.setLayout(new BoxLayout(bottonPane, BoxLayout.LINE_AXIS));
        bottonPane.add(jTextField);
        bottonPane.add(jButton);
        add(bottonPane,BorderLayout.SOUTH);
        jButton.addActionListener(new Send_Action(getInstance()));
        jTextArea.setLineWrap(true);
        jTextField.addKeyListener(new Enter_Action(getInstance()));
    }



    public void scrollToBottom(JScrollPane scrollPane) {
        JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
    }

    public JTextArea getjTextArea() {
        return jTextArea;
    }


    public JTextField getjTextField() {
        return jTextField;
    }

    public Client_main getClient_main() {
        return client_main;
    }

    public JScrollPane getjScrollPane() {
        return jScrollPane;
    }

    public Change_username_dialog getChangeUsername() {
        return changeUsernamedialog;
    }

}
