import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class home implements ActionListener{
    String userID;
    JButton logout,feedback,contact_us,plans,invitation;
    JLabel head_home,feedback_lab,contact_us_lab,plans_lab,invitation_lab,hr1;
    JFrame mainpg=new JFrame();
    home(String userID){
        // JScrollBar mainscroll=new JScrollBar();
        // mainscroll.setBounds(800,0, 20,100);  
        // JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        // mainpg.setContentPane(pane);
        // JPanel container = new JPanel();
        // JScrollPane jsp = new JScrollPane(container);
        head_home=new JLabel("<html>Welcome to <br>Happily Ever After!</html>");
        head_home.setBounds(0,10,1300,100);
        head_home.setFont(new Font("Castellar",Font.BOLD,40));
        head_home.setBackground(new Color(54,83,100));
        // head_home.setForeground(new Color(228,123,231));
        head_home.setForeground(Color.white);
        head_home.setOpaque(true);


        logout =new JButton("Logout");
        logout.setBounds(950,35, 200,50);
        logout.setFocusable(false);
        logout.setBackground(Color.white);
        logout.setForeground(new Color(54,83,100));
        logout.setFont(new Font("Castellar",Font.PLAIN,21));
        logout.addActionListener(this);


        plans=new JButton("Plans");
        plans.setBounds(40,120, 200,50);
        plans.setFocusable(false);
        plans.setBackground(new Color(54,83,100));
        plans.setForeground(Color.white);
        plans.setFont(new Font("Castellar",Font.PLAIN,21));
        plans.addActionListener(this);


        plans_lab=new JLabel("<html>Hey user! Click on the button above to know our plans exclusively customized just for your comfort.<br>"+
        "Our attempt to start your happily ever after in the best way possible<hr></html>");
        plans_lab.setFont(new Font("Times New Roman",Font.BOLD,22));
        plans_lab.setForeground(new Color(54,83,100));
        plans_lab.setBounds(40,190,1000,50);
        // hr1=new JLabel("<html><hr></html>");
        // hr1.setBounds(0,200,1000,10);


        invitation=new JButton("Invitation");
        invitation.setBounds(40,260, 200,50);
        invitation.setFocusable(false);
        invitation.setBackground(new Color(54,83,100));
        invitation.setForeground(Color.white);
        invitation.setFont(new Font("Castellar",Font.PLAIN,21));
        invitation.addActionListener(this);


        invitation_lab=new JLabel("<html>The first step after planning a wedding is to send out invitations<br>"+
        "Hence we have created some beautiful invitation templates. Feel free to check them out! </html>");
        invitation_lab.setFont(new Font("Times New Roman",Font.BOLD,22));
        invitation_lab.setForeground(new Color(54,83,100));
        invitation_lab.setBounds(40,330,1000,50);


        feedback=new JButton("Feedback");
        feedback.setBounds(40,400,200,50);
        feedback.setFocusable(false);
        feedback.setBackground(new Color(54,83,100));
        feedback.setForeground(Color.white);
        feedback.setFont(new Font("Castellar",Font.PLAIN,21));
        feedback.addActionListener(this);


        feedback_lab=new JLabel("<html>Your feedback is the most precious thing for us, it is our driving force and motivation<br>"+
        "So please don't forget to drop in your opinion on how our planner is doing and how it can improve</html>");
        feedback_lab.setFont(new Font("Times New Roman",Font.BOLD,22));
        feedback_lab.setForeground(new Color(54,83,100));
        feedback_lab.setBounds(40,470,1000,50);


        contact_us=new JButton("Contact Us");
        contact_us.setBounds(40,540,200,50);
        contact_us.setFocusable(false);
        contact_us.setBackground(new Color(54,83,100));
        contact_us.setForeground(Color.white);
        contact_us.setFont(new Font("Castellar",Font.PLAIN,21));
        contact_us.addActionListener(this);


        contact_us_lab=new JLabel("<html>For any further details and features feel free to contact us personally or<br>"+
        "through our social media, phone numbers</html>");
        contact_us_lab.setFont(new Font("Times New Roman",Font.BOLD,22));
        contact_us_lab.setForeground(new Color(54,83,100));
        contact_us_lab.setBounds(40,610,1000,50);


        mainpg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainpg.setLayout(null);
        mainpg.setVisible(true);
        mainpg.setSize(3000,3000);
        ImageIcon frameico=new ImageIcon("siteicon.png");//create an image icon
        mainpg.setIconImage(frameico.getImage());
        ImageIcon framebg=new ImageIcon("sitebg.jpg");
        mainpg.setContentPane(new JLabel(framebg));
        // mainpg.getContentPane().setBackground();
        mainpg.add(logout);
        mainpg.add(feedback);
        mainpg.add(feedback_lab);
        mainpg.add(contact_us);
        mainpg.add(contact_us_lab);
        mainpg.add(invitation);
        mainpg.add(invitation_lab);
        mainpg.add(plans);
        mainpg.add(plans_lab);
        // mainpg.add(hr1);
        mainpg.add(head_home);
        // mainpg.add(jsp);
        // mainpg.add(container);
        // // mainpg.add(mainscroll);

    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==logout){
            mainpg.dispose();
            IDandPasswords idandPasswords= new IDandPasswords();
            logmein ok=new logmein(idandPasswords.getLoginInfo());
        }
        if(e.getSource()==invitation){
            mainpg.dispose();
            new invite();
        }
        if(e.getSource()==feedback){
            mainpg.dispose();
            new FeedBack();
        }
        if(e.getSource()==contact_us){
            mainpg.dispose();
            new contactus();
        }
        if(e.getSource()==plans){
            mainpg.dispose();
            new planspage();
        }

    }
    public static void main(String args[]){
         new home(String userID);
    }
}
