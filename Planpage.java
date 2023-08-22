import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class planspage implements ActionListener{
    String userID;
    JButton hillstation,beach,fort,backtohome;
    JLabel planshead,hillstation_l,beach_l,fort_l;
    Color c1,c2;
    JFrame plans=new JFrame("Plans");
   
    planspage(){
        c1=new Color(182,88,128);
        c2=new Color(225,192,194);
        plans.getContentPane().setBackground(new Color(225,192,194));
        planshead=new JLabel("<html>Hey user! Here you can select <br>"+"plans that you think are suitable for you");
        planshead.setFont(new Font("Castellar",Font.BOLD,37));
        planshead.setForeground(c2);
        planshead.setBackground(new Color(182,88,128));
        planshead.setOpaque(true);
        planshead.setBounds(0,10,1300,100);
        hillstation =new JButton("Hillstation wedding");
        hillstation.setBounds(40,140,400,50);
        hillstation.setFocusable(false);
        hillstation.setBackground(new Color(182,88,128));
        hillstation.setForeground(c2);
        hillstation.setFont(new Font("Castellar",Font.BOLD,21));
        hillstation.addActionListener(this);
        hillstation_l=new JLabel("<html>Recently destination weddings have grown into a new trend<br>"+
        "and a hillstation could be a great destination wedding when the right arrangements are made. <br>"+
        "So click on the button to plan your hillstation wedding</html>");
        hillstation_l.setFont(new Font("Times New Roman",Font.BOLD,22));
        hillstation_l.setForeground(c1);
        hillstation_l.setBounds(40,190,1000,100);
        beach =new JButton("Beach wedding");
        beach.setBounds(40,290,400,50);
        beach.setFocusable(false);
        beach.setBackground(new Color(182,88,128));
        beach.setForeground(c2);
        beach.setFont(new Font("Castellar",Font.BOLD,21));
        beach.addActionListener(this);
        beach_l=new JLabel("<html>Beaches provide a serene location for a beautiful aesthetic wedding<br>"+
        "A beach is the best place to have a summer wedding<br>"+
        "So click on the button to plan your beach wedding </html>");
        beach_l.setFont(new Font("Times New Roman",Font.BOLD,22));
        beach_l.setForeground(c1);
        beach_l.setBounds(40,340,1000,100);
        fort =new JButton("Fort wedding");
        fort.setBounds(40,440, 400,50);
        fort.setFocusable(false);
        fort.setBackground(new Color(182,88,128));
        fort.setForeground(c2);
        fort.setFont(new Font("Castellar",Font.BOLD,21));
        fort.addActionListener(this);
        fort_l=new JLabel("<html>If you want to go for a vintage royal vibe for your wedding<br>"+
        "You should definitely check out our arrangements for our fort wedding plan<br>"+
        "So click on the button to plan your fort wedding </html>");
        fort_l.setFont(new Font("Times New Roman",Font.BOLD,22));
        fort_l.setForeground(c1);
        fort_l.setBounds(40,490,1000,100);
        backtohome =new JButton("Back to Home");
        backtohome.setBounds(900,550, 300,50);
        backtohome.setFocusable(false);
        backtohome.setBackground(new Color(182,88,128));
        backtohome.setForeground(c2);
        backtohome.setFont(new Font("Castellar",Font.BOLD,21));
        backtohome.addActionListener(this);
        plans.add(planshead);
        plans.add(hillstation);
        plans.add(beach);
        plans.add(fort);
        plans.add(hillstation_l);
        plans.add(beach_l);
        plans.add(fort_l);
        plans.add(backtohome);
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
        new planspage();
        
    }
}