// package my;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Check2 extends JFrame implements ActionListener{
String userID;
JLabel l1,vl2,dl3,gl4,fl5,fl6,fl7,fl8,pl9,l10;
JCheckBox vcb1,vcb2,vcb3,vcb4,dcb5,dcb6,fcb7,fcb8,fcb9,fcb10,fcb11,fcb12,fcb13,fcb14,fcb15,fcb16,fcb17,fcb18,fcb19,fcb20,fcb21,pcb22,pcb23;
JButton b,b1;
JComboBox gbc1;
Color c1,c2;
JTextField tf;
Check2(){
ImageIcon framebg=new ImageIcon("beach bg.jpg");
this.setContentPane(new JLabel(framebg));

c1=new Color( 177,142,80);
c2=new Color(150,0,175);

l1=new JLabel("Beach Wedding");
l1.setBounds(0,10,1300,70);
l1.setFont(new Font("Edwardian Script ITC", Font.BOLD, 70));
l1.setBackground(c1);
l1.setOpaque(true);
l1.setForeground(c2);
add(l1);



vl2=new JLabel("VENUE:");
vl2.setBounds(50,150,150,20);
vl2.setForeground(c1);
add(vl2);
vcb1=new JCheckBox("GOA");
vcb1.setBounds(100,200,150,20);
vcb1.setForeground(c2);
add(vcb1);
vcb2=new JCheckBox("ANDAMAN");
vcb2.setBounds(100,250,150,20);
vcb2.setForeground(c2);
add(vcb2);
vcb3=new JCheckBox("ALIIBAUG");
vcb3.setBounds(100,300,150,20);
vcb3.setForeground(c2);
add(vcb3);
vcb4=new JCheckBox("LAKSHADWEEP");
vcb4.setBounds(100,350,150,20);
vcb4.setForeground(c2);
add(vcb4);
ButtonGroup vcb=new ButtonGroup();
vcb.add(vcb1);
vcb.add(vcb2);
vcb.add(vcb3);
vcb.add(vcb4);

dl3=new JLabel("DECORATION :"); 
dl3.setForeground(c1);
dl3.setBounds(50,400,150,20);
add(dl3);
dcb5=new JCheckBox("Flowers");
dcb5.setBounds(100,450,150,20);
dcb5.setForeground(c2);
add(dcb5);
dcb6=new JCheckBox("Other");
dcb6.setBounds(100,500,150,20);
dcb6.setForeground(c2);
add(dcb6);

gl4=new JLabel("GUEST :");
gl4.setForeground(c1);
gl4.setBounds(50,550,150,20);
add(gl4);
String Guest[]={"0","50","100","150","250","300"};
gbc1=new JComboBox(Guest);
gbc1.setBounds(150,550,150,20);
gbc1.setForeground(c2);
add(gbc1);


l10=new JLabel("WEDDING DATE:-");
l10.setForeground(c1);
l10.setBounds(50,600,150,20);
add(l10);
tf = new JTextField();
tf.setBounds(150,600,150,20);
add(tf);


fl5=new JLabel("FOOD :-");
fl5.setForeground(c1);
fl5.setBounds(300,100,150,20);
add(fl5);
fl6=new JLabel("STARTERS");
fl6.setForeground(c1);
fl6.setBounds(350,150,150,20);
add(fl6);
fcb7=new JCheckBox("CHINESE");
fcb7.setBounds(400,200,150,20);
fcb7.setForeground(c2);
add(fcb7);
fcb8=new JCheckBox("INDIAN");
fcb8.setBounds(400,250,150,20);
fcb8.setForeground(c2);
add(fcb8);
fcb13=new JCheckBox("CONTINENTAL");
fcb13.setBounds(400,300,150,20);
fcb13.setForeground(c2);
add(fcb13);
fcb14=new JCheckBox("PORTUGUESE");
fcb14.setBounds(400,350,150,20);
fcb14.setForeground(c2);
add(fcb14);
fcb17=new JCheckBox("ITALIAN");
fcb17.setBounds(400,400,150,20);
fcb17.setForeground(c2);
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
fcb9.setForeground(c2);
add(fcb9);
fcb10=new JCheckBox("INDIAN");
fcb10.setBounds(400,550,150,20);
fcb10.setForeground(c2);
add(fcb10);
fcb15=new JCheckBox("CONTINENTAL");
fcb15.setBounds(400,600,150,20);
fcb15.setForeground(c2);
add(fcb15);
fcb16=new JCheckBox("PORTUGUESE");
fcb16.setBounds(400,650,150,20);
fcb16.setForeground(c2);
add(fcb16);
fcb18=new JCheckBox("ITALIAN");
fcb18.setBounds(550,100,150,20);
fcb18.setForeground(c2);
add(fcb18);
ButtonGroup fcb2=new ButtonGroup();
fcb2.add(fcb9);
fcb2.add(fcb10);
fcb2.add(fcb15);
fcb2.add(fcb16);
fcb2.add(fcb18);


fl8=new JLabel("DESSERT");     
fl8.setForeground(c1);         
fl8.setBounds(600,150,150,20);
add(fl8);
fcb11=new JCheckBox("ICE CREAM");
fcb11.setBounds(650,200,150,20);
fcb11.setForeground(c2);
add(fcb11);
fcb12=new JCheckBox("GULAB JAM");
fcb12.setBounds(650,250,150,20);
fcb12.setForeground(c2);
add(fcb12);
fcb19=new JCheckBox("GHEVAR");
fcb19.setBounds(650,300,150,20);
fcb19.setForeground(c2);
add(fcb19);
fcb20=new JCheckBox("RASMALAI");
fcb20.setBounds(650,350,150,20);
fcb20.setForeground(c2);
add(fcb20);
fcb21=new JCheckBox("KULFI");
fcb21.setBounds(650,400,150,20);
fcb21.setForeground(c2);
add(fcb21);


pl9=new JLabel("PARKING");
pl9.setForeground(c1);
pl9.setBounds(600,450,150,20);
add(pl9);
pcb22=new JCheckBox("VALET PARKING");
pcb22.setBounds(650,500,150,20);
pcb22.setForeground(c2);
add(pcb22);
pcb23=new JCheckBox("OPEN SPACE PARKING");
pcb23.setBounds(650,550,200,20);
pcb23.setForeground(c2);
add(pcb23);
ButtonGroup pcb=new ButtonGroup();
pcb.add(pcb22);
pcb.add(pcb23);


b=new JButton("BOOK");
b.setBounds(700,600,150,30);
b.setBackground(c1);
b.setForeground(c2);
add(b);
b.addActionListener(this);
// b1=new JButton("GO TO HOME PAGE");
// b1.setBounds(900,600,200,30);
// add(b1);

setSize(3000,3000);
setLayout(null);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ImageIcon frameico=new ImageIcon("siteicon.png");//create an image icon
this.setIconImage(frameico.getImage());
getContentPane().setBackground(new Color(213,247,196));
}

public void actionPerformed(ActionEvent e){

JOptionPane.showMessageDialog(this,"BOOKING CONFIRMED");
this.dispose();
new home(userID);
}
public static void main(String args[]){
new Check2();
}
}