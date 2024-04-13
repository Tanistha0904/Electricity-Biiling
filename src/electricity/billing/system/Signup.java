
package electricity.billing.system;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame implements ActionListener {
    JButton create, back;

    Signup() {
        setSize(700, 400); // en tino se frame banta hai.
        setLocation(450, 150);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(173, 216, 230), 2), "Create-Account", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(172, 216, 230)));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        panel.setForeground(new Color(34, 139, 34));
        add(panel);

        JLabel heading = new JLabel("Create Account As");
        heading.setBounds(100, 50, 140, 20);
        heading.setForeground(Color.GRAY);
        heading.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(heading);

        JComboBox<String> accountType = new JComboBox<>();
        accountType.addItem("Admin");
        accountType.addItem("Customer");
        accountType.setBounds(260, 50, 150, 20);
        panel.add(accountType);

        JLabel lblMeter = new JLabel("Meter Number");
        lblMeter.setBounds(100, 90, 140, 20);
        lblMeter.setForeground(Color.GRAY);
        lblMeter.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblMeter);

        JTextField meter = new JTextField();
        meter.setBounds(260, 90, 150, 20);
        panel.add(meter);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(100, 130, 140, 20);
        lblUsername.setForeground(Color.GRAY);
        lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblUsername);

        JTextField username = new JTextField();
        username.setBounds(260, 130, 150, 20);
        panel.add(username);

        JLabel lblName = new JLabel("Name");
        lblName.setBounds(100, 170, 140, 20);
        lblName.setForeground(Color.GRAY);
        lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblName);

        JTextField name = new JTextField();
        name.setBounds(260, 170, 150, 20);
        panel.add(name);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(100, 210, 140, 20);
        lblPassword.setForeground(Color.GRAY);
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblPassword);

        JPasswordField password = new JPasswordField();
        password.setBounds(260, 210, 150, 20);
        panel.add(password);

        create = new JButton("Create");
        create.setBackground(Color.BLACK);
        create.setForeground(Color.WHITE);
        create.setBounds(140, 260, 120, 25);
        create.addActionListener(this);
        panel.add(create);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(300, 260, 120, 25);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/signupImage.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(415, 30, 250, 250);
        panel.add(image);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == create) {
            // Code for create button action
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
