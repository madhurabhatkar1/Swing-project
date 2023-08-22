import javax.swing.*;

// import jdk.internal.org.jline.terminal.MouseEvent;

import java.awt.*;  
import java.awt.event.*;  
// import java.sql.*;  
public class Registration extends JFrame implements ActionListener, MouseListener{   
    JFrame register=new JFrame();
    String userID;
    JLabel l1, name, emailid, password, confpassword, contry, state, phoneno,prob, promo;  
    JTextField name_txt, emailid_txt, contry_txt, state_txt, phoneno_txt;  
    JButton submit,reset;  
    JPasswordField passwd_txt, confrm_passwd_txt;  
    Font f1,f2;
    Color c1,c2;
    Registration()  
    {   
        f1=new Font("Monsterrat",Font.PLAIN,25);
        f2=new Font("Serif", Font.BOLD, 25);
        c1=new Color(121,152,238);
        c2=new Color(70,30,82);
        setVisible(true);  
        setSize(3000, 3000);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setTitle("Registration Form");  
        ImageIcon frameico=new ImageIcon("siteicon.png");//create an image icon
        this.setIconImage(frameico.getImage());
        ImageIcon framebg=new ImageIcon("regbh.jpg");
        this.setContentPane(new JLabel(framebg));
        // setOpaque(true);/


        l1 = new JLabel("Registration Form:");  
        l1.setForeground(new Color(70,30,82));  
        l1.setFont(new Font("Serif", Font.BOLD, 50));  


        name = new JLabel("Name:");  
        emailid = new JLabel("Email-ID:");  
        password = new JLabel("Create Password:");  
        confpassword = new JLabel("Confirm Password:");  
        contry = new JLabel("Country:");  
        state = new JLabel("State:");  
        phoneno = new JLabel("Phone No:");  
        prob=new JLabel();
        prob.setForeground(Color.red);
        promo=new JLabel();
        ImageIcon reg=new ImageIcon("regpromo.jpg");
        promo.setIcon(reg);
        promo.addMouseListener(this);



        name_txt = new JTextField();  
        emailid_txt = new JTextField();  
        passwd_txt = new JPasswordField();  
        confrm_passwd_txt = new JPasswordField();  
        contry_txt = new JTextField();  
        state_txt = new JTextField();  
        phoneno_txt = new JTextField();  


        submit = new JButton("Submit");  
        reset = new JButton("Reset");  


        submit.setFocusable(false);
        reset.setFocusable(false);
        submit.addActionListener(this);  
        reset.addActionListener(this); 
        
        name.setFont(f1);
        emailid.setFont(f1);  
        password.setFont(f1);  
        confpassword.setFont(f1);  
        contry.setFont(f1);  
        state.setFont(f1);  
        phoneno.setFont(f1); 
        prob.setFont(f1); 
        name_txt.setFont(f1);  
        emailid_txt.setFont(f1);  
        passwd_txt.setFont(f1);  
        confrm_passwd_txt.setFont(f1);  
        contry_txt.setFont(f1);  
        state_txt.setFont(f1);  
        phoneno_txt.setFont(f1);  
        submit.setFont(f2);  
        reset.setFont(f2); 

        name.setForeground(c1);
        emailid.setForeground(c1);  
        password.setForeground(c1);  
        confpassword.setForeground(c1);  
        contry.setForeground(c1);  
        state.setForeground(c1);  
        phoneno.setForeground(c1); 
        name_txt.setForeground(c1);  
        emailid_txt.setForeground(c1);  
        passwd_txt.setForeground(c1);  
        confrm_passwd_txt.setForeground(c1);  
        contry_txt.setForeground(c1);  
        state_txt.setForeground(c1);  
        phoneno_txt.setForeground(c1);  
        submit.setForeground(Color.WHITE);  
        reset.setForeground(Color.WHITE); 

        submit.setBackground(c2);  
        reset.setBackground(c2); 


        l1.setBounds(100, 30, 500, 50);  
        name.setBounds(80, 100, 200, 30);  
        emailid.setBounds(80, 140, 200, 30);  
        password.setBounds(80, 180, 200, 30);  
        confpassword.setBounds(80, 220, 230, 30);  
        contry.setBounds(80, 260, 200, 30);  
        state.setBounds(80, 300, 200, 30);  
        phoneno.setBounds(80, 340, 200, 30); 
        prob.setBounds(200,500,500,30); 
        promo.setBounds(750,100,480,450);
        name_txt.setBounds(330, 100, 400, 30);  
        emailid_txt.setBounds(330, 140, 400, 30);  
        passwd_txt.setBounds(330, 180, 400, 30);  
        confrm_passwd_txt.setBounds(330, 220, 400, 30);  
        contry_txt.setBounds(330, 260, 400, 30);  
        state_txt.setBounds(330, 300, 400, 30);  
        phoneno_txt.setBounds(330, 340, 400, 30);  
        submit.setBounds(50, 410, 120, 70);  
        reset.setBounds(270, 410, 120, 70);  


        add(l1);  
        add(name);  
        add(name_txt);  
        add(emailid);  
        add(emailid_txt);  
        add(password);  
        add(passwd_txt);  
        add(confpassword);  
        add(confrm_passwd_txt);  
        add(contry);  
        add(contry_txt);  
        add(state);  
        add(state_txt);  
        add(phoneno);  
        add(phoneno_txt); 
        add(prob); 
        add(promo);
        add(submit);  
        add(reset);  
    }  
    public void actionPerformed(ActionEvent e)   
    {  
        if(e.getSource() == submit)  
         {   
            // if(name_txt.getText().equals(this)){
            //     prob.setText("That's a problem");
            // }
            // else if(emailid_txt.equals(this)){
            //     JOptionPane.showMessageDialog(this, "No data entered");
            // }
            // else if(contry_txt.equals(this)){
            //     JOptionPane.showMessageDialog(this, "No data entered");
            // }
            // else if(state_txt.equals( this)){
            //     JOptionPane.showMessageDialog(this, "No data entered");
            // }
            // else if(phoneno_txt.equals(this)){
            //     JOptionPane.showMessageDialog(this, "No data entered");
            // }
            // // else{
            // //     register.dispose();
            // //     new home();
            // // }
            String passwd_txt1=String.valueOf(passwd_txt.getPassword());
            String confrm_passwd_txt1=String.valueOf(confrm_passwd_txt.getPassword());
            // String name_txt1=name_txt.getText();
            // if(passwd_txt1.equals(confrm_passwd_txt1)){
            if(name_txt.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Name textfield is empty");
                prob.setText("Please fill in the name textfield");
            }
            // if(contry.getText().isEmpty()){
            //     JOptionPane.showMessageDialog(this, "Country textfield is empty");
            //     prob.setText("Please fill in the country textfield");
            // }
            // if(state.getText().isEmpty()){
            //             JOptionPane.showMessageDialog(this, "State textfield is empty");
            //             prob.setText("Please fill in the state textfield");
            // }
            else if(passwd_txt1.isEmpty()){
                            JOptionPane.showMessageDialog(this, "Password textfield is empty");
                            prob.setText("Please fill in the password textfield");
                        }
            else if (confrm_passwd_txt1.isEmpty()){
                JOptionPane.showMessageDialog(this, "Confirm passowrd textfield is empty");
                prob.setText("Please fill in the confirm password textfield");
                            }
            else if(passwd_txt1.equals(confrm_passwd_txt1)==false){
                JOptionPane.showMessageDialog(this, "Password and confirm password must be the same");
                prob.setText("Password is not confirmed");
            }        
        
            else{
                // if(name_txt1!=this){
                register.dispose();
                new home(userID);
                // }
            }
        // }
         }
         else if(e.getSource() == reset){
            name_txt.setText("");  
            emailid_txt.setText("");  
            passwd_txt.setText("");  
            confrm_passwd_txt.setText("");  
            contry_txt.setText("");  
            state_txt.setText("");  
            phoneno_txt.setText("");
            reset.setEnabled(false);  
         }
    }
    
    public void mouseClicked(MouseEvent e){
        
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){ImageIcon reg2=new ImageIcon("regpromo2.jpg");
    promo.setIcon(reg2);}
    public void mouseExited(MouseEvent e){
        ImageIcon reg=new ImageIcon("regpromo.jpg");
        promo.setIcon(reg);
    }
    public static void main(String args[])  
    {  
       new Registration();
    }  
}  