package Practice;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/*Frame Creation*/
public class LibraryPage1 extends JFrame implements ActionListener{
    private Container c;
    private ImageIcon Icon,img,imgbg;
    private JLabel bg,bgg,bkid,bknm,athr,cpy,edsn,category,shelf;
    private JButton logout,add,issue,delete,clear,update,find;
    private JTextField bkn,bki,atr,cp,ed,ctgr,shelftf;
    private Font f;
    private JTable bktable;
    private DefaultTableModel model;
    private JScrollPane scroll;
    private final String[] colunms  ={"Book Code","Book Name","Author","Editon","Copies","Category","Shelf"};
    private final String[] row  = new String[7];
    
    //constructor
    LibraryPage1()
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
     bkid=new JLabel("Book Code");
     bkid.setBounds(50, 160, 100, 30);
     bkid.setFont(f);
     bkid.setForeground(Color.white);
     c.add(bkid);
     bki = new JTextField ();
     bki.setBounds(140, 160, 200,30);
     bki.setFont(f);
     c.add(bki);
     bknm=new JLabel("Book Name");
     bknm.setBounds(50, 210, 100, 30);
     bknm.setForeground(Color.white);
     bknm.setFont(f);
     c.add(bknm);
     bkn = new JTextField ();
     bkn.setBounds(140, 210, 200,30);
     bkn.setFont(f);
     c.add(bkn); //bk nm and id
     athr=new JLabel("Auhtor");
     athr.setBounds(360, 160, 50, 30);
     athr.setForeground(Color.white);
     athr.setFont(f);
     c.add(athr);
     atr = new JTextField ();
     atr.setBounds(440, 160, 200,30);
     atr.setFont(f);
     c.add(atr);
     shelf=new JLabel("Shelf No.");
     shelf.setBounds(700, 160, 100, 30);
     shelf.setForeground(Color.white);
     shelf.setFont(f);
     c.add(shelf);
     shelftf = new JTextField ();
     shelftf.setBounds(770, 160,90,30);
     shelftf.setFont(f);
     c.add(shelftf);
     cpy =new JLabel("Copies");
     cpy.setBounds(360, 210, 50, 30);
     cpy.setForeground(Color.white);
     cpy.setFont(f);
     c.add(cpy);
     cp = new JTextField ();
     cp.setBounds(440, 210, 200,30);
     cp.setFont(f);
     c.add(cp);
     edsn =new JLabel("Edition");
     edsn.setBounds(50, 260, 80,30);
     edsn.setForeground(Color.white);
     edsn.setFont(f);
     c.add(edsn);
     ed = new JTextField ();
     ed.setBounds(140, 260, 200,30);
     ed.setFont(f);
     c.add(ed);
     category =new JLabel("Category");
     category.setBounds(360, 260, 100,30);
     category.setForeground(Color.white);
     category.setFont(f);
     c.add(category);
     ctgr = new JTextField ();
     ctgr.setBounds(440, 260, 200,30);
     ctgr.setFont(f);
     c.add(ctgr);
     
     //Button
     add = new JButton("Add");
     add.setBounds(870, 160, 80,30);
     c.add(add);
     clear = new JButton("Clear");
     clear.setBounds(870, 210, 80,30);
     c.add(clear);
     update = new JButton("Update");
     update.setBounds(960, 160, 80,30);
     c.add(update);
     delete = new JButton("Delete");
     delete.setBounds(960, 210, 80,30);
     c.add(delete);
     issue = new JButton("Issue book");
     issue.setBounds(1050,210,100,30);
     issue.addActionListener((ActionEvent e) -> {
              dispose();
              StudentPage frame = new StudentPage();
              frame.setVisible(true);
              frame.setBounds(0, 0, 1920, 1080);
              frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      });
     c.add(issue);
     find = new JButton("Find Book");
     find.setBounds(1050, 160, 100,30);
     c.add(find);
     //Table
     bktable = new JTable();
     model = new DefaultTableModel();
     model.setColumnIdentifiers(colunms);
     bktable.setModel(model);
     bktable.setSelectionBackground(Color.cyan);
     bktable.setRowHeight(30);
     bktable.setFont(f);
     
     
     scroll = new JScrollPane(bktable);
     scroll.setBounds(60, 400, 1800, 600);
     c.add(scroll);
     bktable.addMouseListener(new MouseAdapter(){
         
         @Override
         public void mouseClicked(MouseEvent me){
             int nfr = bktable.getSelectedRow();
             String bid = model.getValueAt(nfr, 0).toString();
             String bnm = model.getValueAt(nfr, 1).toString();
             String ar = model.getValueAt(nfr, 2).toString();
             String e = model.getValueAt(nfr, 3).toString();
             String  c = model.getValueAt(nfr, 4).toString();
             String  ct = model.getValueAt(nfr, 5).toString();
             
             bki.setText(bid);
             bkn.setText(bnm);
             atr.setText(ar);
             ed.setText(e);
             cp.setText(c);
             ctgr.setText(ct);
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
      find.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add)
        {
            row[0]=bki.getText();
            row[1]=bkn.getText();
            row[2]=atr.getText();
            row[3]=ed.getText();
            row[4]=cp.getText();
            row[5]=ctgr.getText();
            row[6]=shelftf.getText();
            model.addRow(row);
        }
        else if(e.getSource()==clear)
        {
            
            bki.setText("");
            bkn.setText("");
            atr.setText("");
            ed.setText("");
            cp.setText("");
            ctgr.setText("");
            shelftf.setText("");
        }
        else if(e.getSource()==delete)
        {
            int num = bktable.getSelectedRow();
            if(num>=0)
            {
            model.removeRow(num);
            }
            else{ JOptionPane.showMessageDialog(null,"No Row has been selected!"); }
        }
        else if(e.getSource()==update)
        {
            int nfr = bktable.getSelectedRow();
             String bid =bki.getText();
             String bnm=bkn.getText();
             String ar =atr.getText();
             String  e1 =ed.getText();
             String c1 = cp.getText();
             String ct = ctgr.getText();
             String slt = shelftf.getText();
             model.setValueAt(bid,nfr, 0);
             model.setValueAt(bnm,nfr, 1);
             model.setValueAt(ar,nfr, 2);
             model.setValueAt(e1,nfr, 3);
             model.setValueAt(c1,nfr, 4);  
             model.setValueAt(ct,nfr, 5);  
             model.setValueAt(slt,nfr, 6);  
        }
        else if(e.getSource()==find)
        {
            // Prompt the user for a search keyword
        String searchKeyword = JOptionPane.showInputDialog("Enter a search keyword:");
            int rowCount = bktable.getRowCount();
        int colCount = bktable.getColumnCount();
        boolean found = false;
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                Object cellValue = bktable.getValueAt(row, col);
                if (cellValue != null && cellValue.toString().equalsIgnoreCase(searchKeyword)) {
                    // Found the keyword
                    found = true;
                    System.out.println("Found at row " + row + ", column " + col);

                    // Highlight the row and column (you can customize this part)
                    bktable.setRowSelectionInterval(row, row);
                    bktable.setColumnSelectionInterval(col, col);
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Keyword not found in the table.");
        }
    }
}
        
    public static void main(String[] args) {
        LibraryPage1 fr = new LibraryPage1();
        fr.setVisible(true);
        fr.setTitle("PU Library"); 
    }  
}
