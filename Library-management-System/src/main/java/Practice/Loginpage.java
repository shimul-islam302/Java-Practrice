package Practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Shirajul
 */
public class Loginpage extends JFrame {
    private Container c;
    private ImageIcon img,Icon,imgbg; 
    private JLabel l1,l2,bg,bgg;
    private JTextField tf1;
    private JPasswordField tf2;
    private JButton b1,b2;
    private Font f;
    Loginpage()
    {
      init();
      setVisible(true);
      setTitle("PU Library");
      setResizable(false);
    }
    private void init()
    {
        
      c= getContentPane();
      c.setLayout(null);
      c.setBackground(Color.white);
      f = new Font("Arial",Font.BOLD,18);
      //label
      l1 = new JLabel("UserName");
      l1.setFont(f);
      l1.setBounds(810, 400, 150, 30);
      l1.setBackground(Color.black);
      l1.setForeground(Color.white);
      c.add(l1);
      l2 = new JLabel("PassWord");
      l2.setFont(f);
      l2.setBounds(810, 450, 150, 30);
      l2.setBackground(Color.white);
      l2.setForeground(Color.white);
      c.add(l2);
      //textfield
      tf1 = new JTextField();
      tf1.setBackground(Color.white);
      tf1.setBounds(960, 400, 250, 30);
      c.add(tf1);
      tf2 = new JPasswordField();
      tf2.setBackground(Color.white);
      tf2.setBounds(960,450, 250, 30);
      c.add(tf2);
      //button
      b1 = new JButton("Clear");
      b1.setBounds(960, 490,100, 30);
      c.add(b1);
      b1.addActionListener((ActionEvent e) -> {
          tf1.setText("");
          tf2.setText("");
      });
      b2 = new JButton("LogIn");
      b2.setBounds(1110, 490,100, 30);
      b2.addActionListener((ActionEvent e) -> {
          String usern = tf1.getText();
          String pass = tf2.getText();
          if(usern.equals("shimul")&& pass.equals("12345"))
          {
              dispose();
              LibraryPage1 frame = new LibraryPage1();
              frame.setVisible(true);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          }
          else
          { JOptionPane.showMessageDialog(null,"Invalid UserName or PassWord !");}
      });
      c.add(b2);

      //icon
      Icon = new ImageIcon(getClass().getResource("Primeicn.jpeg"));
      this.setIconImage(Icon.getImage());
      //bg
      img = new ImageIcon(getClass().getResource("prime.jpeg"));
      bg = new JLabel(img);
      bg.setBounds(450, 0, 1000, 150);
      c.add(bg);
      imgbg = new ImageIcon(getClass().getResource("l.jpg"));
      bgg = new JLabel(imgbg);
      bgg.setBounds(0, 0, 1920, 1080);
      c.add(bgg);
    }
    public static void main(String[] args) {
        Loginpage frame = new Loginpage();
        frame.setBounds(0, 0, 1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
