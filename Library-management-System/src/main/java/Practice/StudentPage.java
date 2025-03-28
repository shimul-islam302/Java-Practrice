package Practice;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/*Frame Creation*/
public class StudentPage extends JFrame implements ActionListener{
    private Container c;
    private ImageIcon Icon,img,imgbg;
    private JLabel bg,bgg,studentid,studentname,department,phonenum,batch,search,booknm,date;
    private JButton logout,add,home,delete,clear,update,rtrn,issue,find;
    private JTextField studentnametf,stidtf,departmenttf,phonenumtf,batchtf,src,booknmtf,datetf;
    private Font f;
    private JTable sttable;
    private DefaultTableModel model;
    private JScrollPane scroll;
    private String[] colunms  ={"Student Name","Student Id","Department","Batch","Phone Number","Issued Book","Date"};
    private String[] row  = new String[6];
    
   // private String[] com ={"Department of CSE","Department of BBA","Department of EEE"};
    //constructor
    StudentPage()
    {
        init();
        setBounds(0, 0, 1920, 1080);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    
    }
    private void init()
    {
     c = getContentPane();
     logout = new JButton("LogOut");
     c.setLayout(null);
     c.setBackground(Color.black);
     f = new Font("Arial",Font.BOLD,14);
     logout.setBounds(50, 20, 80, 30);
      logout.addActionListener((ActionEvent e) -> {
              dispose();
              Loginpage frame = new Loginpage();
              frame.setVisible(true);
              frame.setBounds(0, 0, 1920, 1080);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      });
     c.add(logout);
     home = new JButton("Home");
     home.setBounds(150,20,80,30);
     home.addActionListener((ActionEvent e) -> {
              dispose();
              LibraryPage1 frame = new LibraryPage1();
              frame.setVisible(true);
              frame.setBounds(0, 0, 1920, 1080);
              frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      });
     c.add(home);
     studentid=new JLabel("Student id");
     studentid.setBounds(50, 160, 100, 30);
     studentid.setForeground(Color.white);
     studentid.setFont(f);
     c.add(studentid);
     stidtf = new JTextField ();
     stidtf.setBounds(150, 160, 200,30);
     stidtf.setFont(f);
     stidtf.setHorizontalAlignment(JTextField.CENTER);
     c.add(stidtf);
     studentname=new JLabel("Student Name");
     studentname.setBounds(50, 210, 100, 30);
     studentname.setForeground(Color.white);
     studentname.setFont(f);
     c.add(studentname);
     studentnametf = new JTextField ();
     studentnametf.setBounds(150, 210, 200,30);
     studentnametf.setHorizontalAlignment(JTextField.CENTER);
     studentnametf.setFont(f);
     c.add(studentnametf);
     batch =new JLabel("Batch");
     batch.setBounds(50, 260, 50,30);
     batch.setForeground(Color.white);
     batch.setFont(f);
     c.add(batch);
     batchtf = new JTextField ();
     batchtf.setBounds(150, 260, 200,30); 
     batchtf.setFont(f);
     batchtf.setHorizontalAlignment(JTextField.CENTER);
     c.add(batchtf);
//bk nm and id
     department=new JLabel("Department");
     department.setBounds(360, 160, 100, 30);
     department.setForeground(Color.white);
     department.setFont(f);
     c.add(department);
     departmenttf = new JTextField();
     departmenttf.setBounds(480, 160, 200,30);
     departmenttf.setHorizontalAlignment(JTextField.CENTER);
     departmenttf.setFont(f);
     c.add(departmenttf);
     phonenum =new JLabel("Phone Number");
     phonenum.setBounds(360, 210, 120, 30);
     phonenum.setForeground(Color.white);
     phonenum.setFont(f);
     c.add(phonenum);
     phonenumtf = new JTextField ();
     phonenumtf.setBounds(480, 210, 200,30);
     phonenumtf.setFont(f);
     phonenumtf.setHorizontalAlignment(JTextField.CENTER);
     c.add(phonenumtf);
     date =new JLabel("Date");
     date.setBounds(360, 260, 100,30);
     date.setForeground(Color.white);
     date.setFont(f);
     c.add(date);
     datetf = new JTextField ();
     datetf.setBounds(480, 260, 200,30);
     datetf.setFont(f);
     datetf.setHorizontalAlignment(JTextField.CENTER);
     c.add(datetf);
     
     search =new JLabel("Book Id");
     search.setBounds(920, 160, 80,30);
     search.setForeground(Color.white);
     search.setFont(f);
     c.add(search);
     src = new JTextField ();
     src.setBounds(1000, 160, 200,30);
     src.setHorizontalAlignment(JTextField.CENTER);
     src.setFont(f);
     c.add(src);
    /* booknm =new JLabel("Book Name");
     booknm.setBounds(920, 210, 80,30);
     booknm.setForeground(Color.white);
     booknm.setFont(f);
     c.add(booknm);
     booknmtf = new JTextField ();
     booknmtf.setBounds(1000, 210, 200,30);
     booknmtf.setHorizontalAlignment(JTextField.CENTER);
     booknmtf.setFont(f);
     c.add(booknmtf);*/
     
     //Butto
     add = new JButton("Add");
     add.setBounds(700, 160, 80,30);
     c.add(add);
     clear = new JButton("Clear");
     clear.setBounds(700, 210, 80,30);
     c.add(clear);
     update = new JButton("Update");
     update.setBounds(790, 160, 80,30);
     c.add(update);
     delete = new JButton("Delete");
     delete.setBounds(790, 210, 80,30);
     c.add(delete);
     rtrn = new JButton("Return Book");
     rtrn.setBounds(1210, 160, 120,30);
     c.add(rtrn);
     issue = new JButton("Issue Book");
     issue.setBounds(1210, 210, 120,30);
     c.add(issue);
     find = new JButton("Find Student");
     find.setBounds(1210, 260, 120,30);
     c.add(find);
     
     //Table
     sttable = new JTable();
     model = new DefaultTableModel();
     model.setColumnIdentifiers(colunms);
     sttable.setModel(model);
     sttable.setSelectionBackground(Color.cyan);
     sttable.setRowHeight(30);
     sttable.setFont(f);
     
     scroll = new JScrollPane(sttable);
     scroll.setBounds(60, 400, 1800, 600);
     c.add(scroll);
     sttable.addMouseListener(new MouseAdapter(){
         
         @Override
         public void mouseClicked(MouseEvent me){
             int nfr = sttable.getSelectedRow();
             String sid = model.getValueAt(nfr, 1).toString();
             String snm = model.getValueAt(nfr, 0).toString();
             String dp = model.getValueAt(nfr, 2).toString();
             String bt = model.getValueAt(nfr, 3).toString();
             String  ph = model.getValueAt(nfr, 4).toString();
             stidtf.setText(sid);
             studentnametf.setText(snm);
             departmenttf.setText(dp);
             batchtf.setText(bt);
             phonenumtf.setText(ph);
         }
     });
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
      bgg.setBounds(0, 0, 1920,1080);
      c.add(bgg);
      add.addActionListener(this);
      clear.addActionListener(this);
      delete.addActionListener(this);
      update.addActionListener(this);
      issue.addActionListener(this);
      rtrn.addActionListener(this);
      find.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add)
        {
            row[0]=studentnametf.getText();
            row[1]=stidtf.getText();
            row[2]=departmenttf.getText();
            row[3]=batchtf.getText();
            row[4]=phonenumtf.getText();
            model.addRow(row);
        }
        else if(e.getSource()==clear)
        {
            studentnametf.setText("");
            stidtf.setText("");
            departmenttf.setText("");
            batchtf.setText("");
            phonenumtf.setText("");
            booknmtf.setText("");
            src.setText("");
        }
        else if(e.getSource()==delete)
        {
            int num = sttable.getSelectedRow();
            if(num>=0)
            {
            model.removeRow(num);
            }
            else{ JOptionPane.showMessageDialog(null,"No Row has been selected!"); }
        }
        else if(e.getSource()==update)
        {
            int nfr = sttable.getSelectedRow();
             String stid =stidtf.getText();
             String stname=studentnametf.getText();
             String dp =departmenttf.getText();
             String btc =batchtf.getText();
             String phn = phonenumtf.getText();
             model.setValueAt(stid,nfr, 1);
             model.setValueAt(stname,nfr, 0);
             model.setValueAt(dp,nfr, 2);
             model.setValueAt(btc,nfr, 3);
             model.setValueAt(phn,nfr, 4);
            
        }
        else if(e.getSource()==issue)
        {
            int nfr = sttable.getSelectedRow();
           
             String dt = datetf.getText();
             String bkid= src.getText();
             model.setValueAt(bkid,nfr, 5);
             model.setValueAt(dt,nfr, 6);
             JOptionPane.showMessageDialog(null,"Issue Succesfully!");
        }
        else if(e.getSource()==rtrn)
        {
            int nfr = sttable.getSelectedRow();
             
             datetf.setText("");
             String dt = datetf.getText();
             src.setText("");
             String bkid= src.getText();
        
             model.setValueAt(bkid,nfr, 5);
             model.setValueAt(dt,nfr, 6);
             JOptionPane.showMessageDialog(null,"Return Succesfully!");
        }
         else if(e.getSource()==find)
        {
            // Prompt the user for a search keyword
        String searchKeyword = JOptionPane.showInputDialog("Enter Student Id or Name:");
            int rowCount = sttable.getRowCount();
        int colCount = sttable.getColumnCount();
        boolean found = false;
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                Object cellValue = sttable.getValueAt(row, col);
                if (cellValue != null && cellValue.toString().equalsIgnoreCase(searchKeyword)) {
                    // Found the keyword
                    found = true;
                    System.out.println("Found at row " + row + ", column " + col);

                    // Highlight the row and column (you can customize this part)
                    sttable.setRowSelectionInterval(row, row);
                    sttable.setColumnSelectionInterval(col, col);
                    break;
                }
            }
            if (found) {
                break;
            }
            
        }

        if (!found) {
            JOptionPane.showMessageDialog(null,"Student Id/Name not found.");
        }
    }

        
    }
    public static void main(String[] args) {
        StudentPage fr = new StudentPage();
        fr.setVisible(true);
        fr.setTitle("PU Library"); 
    }    
}
