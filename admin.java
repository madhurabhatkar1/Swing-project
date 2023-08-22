import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class adminspage implements ActionListener{
    String userID;
    JButton hillstation,beach,fort,backtohome;
    JLabel planshead,hillstation_l,beach_l,fort_l;
    Color c1,c2;
    JFrame plans=new JFrame("Admin Home");
   
    adminspage(){
        c1=new Color(182,88,128);
        c2=new Color(225,192,194);
        plans.getContentPane().setBackground(new Color(225,192,194));
        planshead=new JLabel("<html>Hey admin!");
        planshead.setFont(new Font("Castellar",Font.BOLD,37));
        planshead.setForeground(c2);
        planshead.setBackground(new Color(182,88,128));
        planshead.setOpaque(true);
        planshead.setBounds(0,10,1300,100);
        hillstation =new JButton("Add Invitation Template");
        hillstation.setBounds(40,140,400,50);
        hillstation.setFocusable(false);
        hillstation.setBackground(new Color(182,88,128));
        hillstation.setForeground(c2);
        hillstation.setFont(new Font("Castellar",Font.BOLD,21));
        hillstation.addActionListener(this);
        hillstation_l=new JLabel("<html>Click to add invitation</html>");
        hillstation_l.setFont(new Font("Times New Roman",Font.BOLD,22));
        hillstation_l.setForeground(c1);
        hillstation_l.setBounds(40,190,1000,100);
        beach =new JButton("Add Wedding Plan");
        beach.setBounds(40,290,400,50);
        beach.setFocusable(false);
        beach.setBackground(new Color(182,88,128));
        beach.setForeground(c2);
        beach.setFont(new Font("Castellar",Font.BOLD,21));
        beach.addActionListener(this);
        beach_l=new JLabel("<html>Click to aadd wedding plan</html>");
        beach_l.setFont(new Font("Times New Roman",Font.BOLD,22));
        beach_l.setForeground(c1);
        beach_l.setBounds(40,340,1000,100);
        fort =new JButton("Orders recived");
        fort.setBounds(40,440, 400,50);
        fort.setFocusable(false);
        fort.setBackground(new Color(182,88,128));
        fort.setForeground(c2);
        fort.setFont(new Font("Castellar",Font.BOLD,21));
        fort.addActionListener(this);
        fort_l=new JLabel("<html>Click to view orders received</html>");
        fort_l.setFont(new Font("Times New Roman",Font.BOLD,22));
        fort_l.setForeground(c1);
        fort_l.setBounds(40,490,1000,100);
        // backtohome =new JButton("Back to Home");
        // backtohome.setBounds(900,550, 300,50);
        // backtohome.setFocusable(false);
        // backtohome.setBackground(new Color(182,88,128));
        // backtohome.setForeground(c2);
        // backtohome.setFont(new Font("Castellar",Font.BOLD,21));
        // backtohome.addActionListener(this);
        plans.add(planshead);
        plans.add(hillstation);
        plans.add(beach);
        plans.add(fort);
        plans.add(hillstation_l);
        plans.add(beach_l);
        plans.add(fort_l);
        // plans.add(backtohome);
        plans.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        plans.setLayout(null);
        plans.setVisible(true);
        plans.setSize(3000,3000);
        ImageIcon frameico=new ImageIcon("siteicon.png");//create an image icon
        plans.setIconImage(frameico.getImage());

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==hillstation){
            plans.dispose();
            new Check1();
        }
        if(e.getSource()==beach){
            plans.dispose();
            new Check2();
        }
        if(e.getSource()==fort){
            plans.dispose();
            new CheckBox();
        }
        if(e.getSource()==backtohome){
            plans.dispose();
            new home(userID);
        }
    }
    public static void main(String arg[]){
        new adminspage();
        
    }
}