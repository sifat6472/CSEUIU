package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Today implements ActionListener {
    JFrame jFrame= new JFrame();
    JLabel username = new JLabel();
    JLabel password = new JLabel();
    JTextField usernameinput = new JTextField();
    JTextField passwordinput = new JTextField();
    JButton login = new JButton();

    public void actionPerformed(ActionEvent e){
        if(usernameinput.getText().equals("abc") && passwordinput.getText().equals("123"))
            System.out.println("Successfully logged in");
        else
            System.out.println("Try Again!!!");
    }

    public Today(){
        username.setBounds(50,50,200,30);
        usernameinput.setBounds(200,50,200,30);
        password.setBounds(50,100,200,30);
        passwordinput.setBounds(200,100,200,30);
        login.setBounds(250,150,80,60);


        //setting the texts
        username.setText("User Name");
        password.setText("Password");
        login.setText("Login");

        //now ive to add these components to jframe

        jFrame.add(username);
        jFrame.add(usernameinput);
        jFrame.add(password);
        jFrame.add(passwordinput);
        jFrame.add(login);


        //adding button for action listening
        login.addActionListener(this);

        jFrame.setLocation(50,50);
        jFrame.setLayout(null);
        jFrame.setSize(600,600);
        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
        new Today();
    }
}
