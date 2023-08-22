import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class feedbackog extends JFrame implements ActionListener{
    JFrame feedmeback=new JFrame();
    JLabel mainlabel, label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, msg;
    JTextField t1, t2, t3, t4 ;
    JRadioButton r1,r2,r3,r4;
    feedbackog(){
        setTitle("Feedback Form") ;
setSize(3000,3000);
setDefaultCloseOperation( EXIT_ON_CLOSE) ;
setVisible(true);
// JPanel C = new JPanel();
setLayout(null) ;
setBackground(Color.YELLOW);
Font f1 = new Font("Castellar ", Font.BOLD,20) ;
Color oh=new Color(242,204,190);
Color oh2=new Color(252,208,107);
mainlabel = new JLabel("Feedback ");
mainlabel.setFont(f1);
mainlabel.setForeground(Color.BLACK) ;
mainlabel.setBackground(oh);
mainlabel.setOpaque(true);
mainlabel.setBounds(0,10,1300,90) ;
add(mainlabel);
label1=new JLabel("<html> In this feedback form ; There are several options, you have to choose or fill<br>"+" You have to select or write the ratings out of five for the features given below</html>");
label1.setBounds(40,40,900,50);
add(label1);
// feedmeback.add(C);

    }
    public void actionPerformed(ActionEvent e){

    }
    public static void main(String args[]){
        new feedbackog();
    }
    
}
