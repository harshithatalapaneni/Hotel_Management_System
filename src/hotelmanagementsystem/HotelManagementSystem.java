
package hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotelManagementSystem  extends JFrame implements ActionListener{

    HotelManagementSystem(){
       // setSize(800,600);
        //setLocation(230,90);
        setBounds(230,90,800,600);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo1.jpg"));
        JLabel  image = new JLabel(i1);
        image.setBounds(0,0 ,800 ,600);
        add(image);
        
        JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
        text.setBounds(20,30,2700,45);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("serit" ,Font.PLAIN, 50));
        image.add(text);
        
        JButton next = new JButton("OPEN");
        next.setBounds(710 ,520,70,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setFont(new Font("serit" ,Font.PLAIN, 10));
        image.add(next);
        
        setVisible(true);
        
        while(true){
            text.setVisible(false);
            try{
            Thread.sleep(500);
        }catch(Exception e){
            e.printStackTrace();
        }
            text.setVisible(true);
            try{
            Thread.sleep(500);
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
         new logintransparent().setVisible(true);
    }
    public static void main(String[] args) {
        new HotelManagementSystem(); 
    }
    
}
