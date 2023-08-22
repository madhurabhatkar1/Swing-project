// package my;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class CheckBox extends JFrame implements ActionListener{
String userID;
JLabel l1,vl2,dl3,gl4,fl5,fl6,fl7,fl8,pl9,l10,im;
JCheckBox vcb1,vcb2,vcb3,vcb4,dcb5,dcb6,fcb7,fcb8,fcb9,fcb10,fcb11,fcb12,fcb13,fcb14,fcb15,fcb16,fcb17,fcb18,fcb19,fcb20,fcb21,pcb22,pcb23;
JButton b,b1;
JComboBox gbc1;
Color c1,c2;
JTextField tf;
JFrame third=new JFrame();
CheckBox(){
c1=new Color( 255,255,255);
// c2=new Color(150,0,175);
ImageIcon framebg=new ImageIcon("fortbg.jpg");
this.setContentPane(new JLabel(framebg));
l1=new JLabel("Fort Wedding");
l1.setBounds(0,10,1300,70);
l1.setFont(new Font("Edwardian Script ITC", Font.BOLD, 70));
l1.setBackground(new Color(82,170,199));
l1.setOpaque(true);
l1.setForeground(new Color(255,255,255));
add(l1);

vl2=new JLabel("VENUE:");
vl2.setBounds(50,150,150,20);
vl2.setForeground(c1);
add(vl2);
vcb1=new JCheckBox("JAGMANDIR");
vcb1.setBounds(100,200,150,20);
vcb1.setForeground(new Color(224,211,73));
add(vcb1);
vcb2=new JCheckBox("FATEGARH");
vcb2.setBounds(100,250,150,20);
vcb2.setForeground(new Color(224,211,73));
add(vcb2);
vcb3=new JCheckBox("TAJ LAKE");
vcb3.setBounds(100,300,150,20);
vcb3.setForeground(new Color(224,211,73));
add(vcb3);
vcb4=new JCheckBox("LEELA");
vcb4.setBounds(100,350,150,20);
vcb4.setForeground(new Color(224,211,73));
add(vcb4);
ButtonGroup vcb=new ButtonGroup();
vcb.add(vcb1);
vcb.add(vcb2);
vcb.add(vcb3);
vcb.add(vcb4);



dl3=new JLabel("DECORATION :"); 
dl3.setBounds(50,400,150,20);
dl3.setForeground(c1);
add(dl3);
dcb5=new JCheckBox("Flowers");
dcb5.setBounds(100,450,150,20);
dcb5.setForeground(new Color(224,211,73));
add(dcb5);
dcb6=new JCheckBox("Other");
dcb6.setBounds(100,500,150,20);
dcb6.setForeground(new Color(224,211,73));
add(dcb6);

gl4=new JLabel("GUEST :");
gl4.setBounds(50,550,150,20);
gl4.setForeground(c1);
add(gl4);
String Guest[]={"0","50","100","150","250","300"};
gbc1=new JComboBox(Guest);
gbc1.setBounds(150,550,150,20);
gbc1.setForeground(new Color(224,211,73));
add(gbc1);


l10=new JLabel("WEDDING DATE:-");
l10.setBounds(50,600,150,20);
l10.setForeground(c1);
add(l10);
tf = new JTextField();
tf.setBounds(150,600,150,20);
add(tf);


fl5=new JLabel("FOOD :-");
fl5.setBounds(300,100,150,20);
fl5.setForeground(c1);
add(fl5);
fl6=new JLabel("STARTERS");
fl6.setBounds(350,150,150,20);
fl6.setForeground(c1);
add(fl6);
fcb7=new JCheckBox("CHINESE");
fcb7.setBounds(400,200,150,20);
fcb7.setForeground(new Color(224,211,73));
add(fcb7);
fcb8=new JCheckBox("INDIAN");
fcb8.setBounds(400,250,150,20);
fcb8.setForeground(new Color(224,211,73));
add(fcb8);
fcb13=new JCheckBox("CONTINENTAL");
fcb13.setBounds(400,300,150,20);
fcb13.setForeground(new Color(224,211,73));
add(fcb13);
fcb14=new JCheckBox("PORTUGUESE");
fcb14.setBounds(400,350,150,20);
fcb14.setForeground(new Color(224,211,73));
add(fcb14);
fcb17=new JCheckBox("ITALIAN");
fcb17.setBounds(400,400,150,20);
fcb17.setForeground(new Color(224,211,73));
add(fcb17);
ButtonGroup fcb=new ButtonGroup();
fcb.add(fcb7);
fcb.add(fcb8);
fcb.add(fcb13);
fcb.add(fcb14);
fcb.add(fcb17);





fl7=new JLabel("MAIN COURSE");
fl7.setBounds(350,450,150,30);
fl7.setForeground(c1);
add(fl7);
fcb9=new JCheckBox("CHINESE");
fcb9.setBounds(400,500,150,20);
fcb9.setForeground(new Color(224,211,73));
add(fcb9);
fcb10=new JCheckBox("INDIAN");
fcb10.setBounds(400,550,150,20);
fcb10.setForeground(new Color(224,211,73));
add(fcb10);
fcb15=new JCheckBox("CONTINENTAL");
fcb15.setBounds(400,600,150,20);
fcb15.setForeground(new Color(224,211,73));
add(fcb15);
fcb16=new JCheckBox("PORTUGUESE");
fcb16.setBounds(400,650,150,20);
fcb16.setForeground(new Color(224,211,73));
add(fcb16);
fcb18=new JCheckBox("ITALIAN");
fcb18.setBounds(550,100,150,20);
fcb18.setForeground(new Color(224,211,73));
add(fcb18);
ButtonGroup fcb2=new ButtonGroup();
fcb2.add(fcb9);
fcb2.add(fcb10);
fcb2.add(fcb15);
fcb2.add(fcb16);
fcb2.add(fcb18);

fl8=new JLabel("DESSERT");              
fl8.setBounds(600,150,150,20);
fl8.setForeground(c1);
add(fl8);
fcb11=new JCheckBox("ICE CREAM");
fcb11.setBounds(650,200,150,20);
fcb11.setForeground(new Color(224,211,73));
add(fcb11);
fcb12=new JCheckBox("GULAB JAM");
fcb12.setBounds(650,250,150,20);
fcb12.setForeground(new Color(224,211,73));
add(fcb12);
fcb19=new JCheckBox("GHEVAR");
fcb19.setBounds(650,300,150,20);
fcb19.setForeground(new Color(224,211,73));
add(fcb19);
fcb20=new JCheckBox("RASMALAI");
fcb20.setBounds(650,350,150,20);
fcb20.setForeground(new Color(224,211,73));
add(fcb20);
fcb21=new JCheckBox("KULFI");
fcb21.setBounds(650,400,150,20);
fcb21.setForeground(new Color(224,211,73));
add(fcb21);


pl9=new JLabel("PARKING");
pl9.setBounds(600,450,150,20);
pl9.setForeground(c1);
add(pl9);
pcb22=new JCheckBox("VALET PARKING");
pcb22.setBounds(650,500,150,20);
pcb22.setForeground(new Color(224,211,73));
add(pcb22);
pcb23=new JCheckBox("OPEN SPACE PARKING");
pcb23.setBounds(650,550,200,20);
pcb23.setForeground(new Color(224,211,73));
add(pcb23);
ButtonGroup pcb=new ButtonGroup();
pcb.add(pcb22);
pcb.add(pcb23);

// im=new JLabel();
// ImageIcon im1=new ImageIcon("img3.jpg");
// im.setIcon(im1);
// im.setBounds(750,50,);

b=new JButton("BOOK");
b.setBounds(700,600,150,30);
b.setBackground(c1);
b.setForeground(new Color(224,211,73));
add(b);
b.addActionListener(this);
b.setFocusable(false);
// b1=new JButton("GO TO HOME PAGE");
// b1.setBounds(900,600,200,30);
// add(b1);

setSize(3000,3000);
setLayout(null);
setVisible(true);
ImageIcon frameico=new ImageIcon("siteicon.png");//create an image icon
this.setIconImage(frameico.getImage());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// third.setOpacity(0.0f);
getContentPane().setBackground(new Color(213,247,196));

}

public void actionPerformed(ActionEvent e){

JOptionPane.showMessageDialog(this,"BOOKING CONFIRMED");
this.dispose();
new home(userID);
}
public static void main(String args[]){
new CheckBox();
}
}