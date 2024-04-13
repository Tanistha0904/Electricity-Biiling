package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton login, cancel, signup;
    JTextField username, password;
    Choice logginin;

    Login() {
        super("Login Page");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(300, 20, 100, 20);
        add(lblUsername);

        username = new JTextField();
        username.setBounds(400, 20, 150, 20);
        add(username);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(300, 60, 100, 20);
        add(lblPassword);

        JPasswordField password = new JPasswordField();
        password.setBounds(400, 60, 150, 20);
        add(password);

        JLabel lblLoggingInAs = new JLabel("Logging in as");
        lblLoggingInAs.setBounds(300, 100, 100, 20);
        add(lblLoggingInAs);

        JComboBox<String> loggingIn = new JComboBox<>();
        loggingIn.addItem("Admin");
        loggingIn.addItem("Customer");
        loggingIn.setBounds(400, 100, 150, 20);
        add(loggingIn);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Login.png"));
        Image i2 = i1.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        login = new JButton("Login", new ImageIcon(i2));
        login.setBounds(330, 160, 100, 20);
        login.addActionListener(this);
        add(login);

        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icon/cancel.jpg"));
        Image i4 = i3.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        cancel = new JButton("Cancel", new ImageIcon(i4));
        cancel.setBounds(450, 160, 100, 20);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
        Image i6 = i5.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        signup = new JButton("Signup", new ImageIcon(i6));
        signup.setBounds(450, 200, 100, 20);
        signup.addActionListener(this);
        add(signup);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon/second.jpg"));
        Image i8 = i7.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image = new JLabel(i9);
        image.setBounds(0, 0, 250, 250);
        add(image);

        setSize(640, 300);
        setLocation(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String username = username.getText();
            String Spassword = password.getText();
            String user = logginin.getSelectedItem();
            
            try{
                Conn c = new Conn();
                String query = "select * from login where username = '"+susrename+"' and password = '"+spassword+"' and user = '"+user+";
                ResultSet rs= c.s.executeQuery(query);
                
                
                if(rs.next()){
                    setVisible(false);
                    new Project();
                    
                } else{
                    JOptionPane.showMessageDiaLog(null. "Invalid Login");
                    username.setText("");
                    password.setText("");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            
            // Code for login button action
        } else if (ae.getSource() == cancel) {
            setVisible(false);
        } else if (ae.getSource() == signup) {
            setVisible(false);
            new Signup();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}