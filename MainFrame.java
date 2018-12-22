package DX_BALL;

import java.awt.Color;
import javax.swing.ImageIcon;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
    private ImageIcon icon;

    public MainFrame(){
        initComponents();
    }
    
    public void initComponents(){
        icon=new ImageIcon(getClass().getResource("misaka.jpg"));
        this.setIconImage(icon.getImage());
    }
    

    public static void main(String[] args){
        JFrame frame = new JFrame();
        GamePlay gamePlay = new GamePlay();

        frame.setBounds(10,10,700,600);
        frame.setTitle("Rafi's Game");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gamePlay);
        frame.setVisible(true);

    }

}
