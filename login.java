import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class logmein extends JFrame implements ActionListener{
// String userID;
JLabel user,passwd,messagelabel,head,logpriv;
JTextField user_txtfld=new JTextField();;
String userID = user_txtfld.getText();
JPasswordField passwd_txtfld;
JButton login_btn,register_btn;
JFrame login;
Color c, white,turqoise;
HashMap<String,String> logininfo = new HashMap<String,String>();
logmein(HashMap<String,String> loginInfoOriginal){

logininfo = loginInfoOriginal;
login=new JFrame("Login");
login.setSize(3000,3000);
login.setVisible(true);
c=new Color(54,83,100);
white=new Color(255,255,255);
turqoise=new Color(54,83,100);

// f.addWindowListener(new myclass());
ImageIcon framebg=new ImageIcon("sitebg.jpg");
login.setContentPane(new JLabel(framebg));
// login.setBackground(new Color(221,160,51));
ImageIcon frameico=new ImageIcon("siteicon.png");//create an image icon
login.setIconImage(frameico.getImage());
head=new JLabel("Login");
head.setFont(new Font("Castellar",Font.BOLD,40));
head.setBackground(c);
head.setForeground(white);
head.setOpaque(true);
logpriv=new JLabel("Your privacy is our priority. Please login beforehand to plan your wedding with Happily Ever After.");
logpriv.setFont(new Font("Bell MT",Font.PLAIN,30));
logpriv.setForeground(turqoise);
user=new JLabel("Username");
user.setFont(new Font("Bell MT",Font.PLAIN,30));
user.setForeground(turqoise);
// user_txtfld=new JTextField();
passwd=new JLabel("Password");
passwd.setFont(new Font("Bell MT",Font.PLAIN,30));
passwd.setForeground(turqoise);
passwd_txtfld=new JPasswordField();
login_btn=new JButton("Login");
login_btn.setBackground(c);
login_btn.setForeground(white);
login_btn.setFocusable(false);
login_btn.setFont(new Font("Castellar",Font.PLAIN,30));
login_btn.addActionListener(this);
register_btn=new JButton("Register");
register_btn.setBackground(c);
register_btn.setForeground(white);
register_btn.setFocusable(false);
register_btn.setFont(new Font("Castellar",Font.PLAIN,30));
register_btn.addActionListener(this);
messagelabel=new JLabel();
messagelabel.setFont(new Font("Bell MT",Font.PLAIN,30));
messagelabel.setForeground(white);
login.setLayout(null);
head.setBounds(0,10,1300,100);
logpriv.setBounds(50,160,1300,30);
user.setBounds(50,210,200,30);
user_txtfld.setBounds(270,210,200,30);
passwd.setBounds(50,260,200,30);
passwd_txtfld.setBounds(270,260,200,30);
login_btn.setBounds(470,410,240,50);
register_btn.setBounds(70,410,240,50);
messagelabel.setBounds(270,310,250,50);



login.add(logpriv);
login.add(head);
login.add(user);
login.add(user_txtfld);
login.add(passwd);
login.add(passwd_txtfld);
login.add(login_btn);
login.add(register_btn);
login.add(messagelabel);

// f.setDefaultCloseOperation(JJFrame.HIDE_ON_CLOSE);


}
public void actionPerformed(ActionEvent e){
    if(e.getSource()==register_btn){
        login.dispose();
        Registration registration_form=new Registration();
    }
    if(e.getSource()==login_btn){
        String userID = user_txtfld.getText();
	    String password = String.valueOf(passwd_txtfld.getPassword());
        if(logininfo.containsKey(userID)){
            if(logininfo.get(userID).equals(password)) {
                login.dispose();
                new home(userID);
        }
        else{
            JOptionPane.showMessageDialog(this, "Wrong password entered");
            messagelabel.setForeground(Color.red);
            messagelabel.setText("Wrong password");
        }
    }
    else{
        JOptionPane.showMessageDialog(this, "Wrong password entered");
        messagelabel.setForeground(Color.red);
        messagelabel.setText("Wrong password");
    }
}
}
public static void main(String args[])
{
    IDandPasswords idandPasswords= new IDandPasswords();
   logmein Logmein=new logmein(idandPasswords.getLoginInfo());

}

}
