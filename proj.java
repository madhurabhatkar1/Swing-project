
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.event.*;
import javax.swing.*;



class invite implements ActionListener
{   String userID;
    JButton button,button1,button2,button3,button4;
    JLabel label,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13;
    JFrame frame = new JFrame("Invitation Page");
    invite(){
        Border border = BorderFactory.createLineBorder(Color.BLACK);

        ImageIcon image,image2,image3,image4,image5,image6,image7;
        image = new ImageIcon("topcard.png");
        image2 = new ImageIcon("topcard.png");
        image3 = new ImageIcon("invite1.png");
        image4 = new ImageIcon("invite2.png");
        image5  = new ImageIcon("invite3.png");
        image6  = new ImageIcon("invite4.png");
        image7  = new ImageIcon("invite5.png");


        
        label = new JLabel();
        label.setBounds(0, 0, 700, 170);
        label.setIcon(image);
        

        label2 = new JLabel();
        label2.setBounds(622, 0, 622, 170);
        label2.setIcon(image2);
        


        label3 = new JLabel();
        label3.setBounds(55,350,140, 170);
        label3.setIcon(image3);
        label3.setBorder(border);
       
        label4 = new JLabel();
        label4.setBounds(300,350, 140, 170);
        label4.setIcon(image4);
        label4.setBorder(border);

        label5 = new JLabel();
        label5.setBounds(535, 350, 140, 170);
        label5.setIcon(image5);
        label5.setBorder(border);


        label6 = new JLabel();
        label6.setBounds(770, 365, 183, 140);
        label6.setIcon(image6);
        label6.setBorder(border);


        label7 = new JLabel();
        label7.setBounds(1035, 350, 140, 170);
        label7.setIcon(image7);
        label7.setBorder(border);

        label8 = new JLabel();
        label8.setText("INVITATION CARDS");
        label8.setBounds(515,180, 300, 70);
        Font  f1  = new Font(Font.MONOSPACED, Font.BOLD,30);
        label8.setForeground(new Color(177,142,38));
        label8.setFont(f1);

        label9 = new JLabel();
        label9.setText("~Floral Rs.500");
        label9.setBounds(55,225,160,170);
        Font  f2  = new Font(Font.SERIF, Font.PLAIN,20);
        label9.setForeground(new Color(177,142,38));
        label9.setFont(f2);


        label10 = new JLabel();
        label10.setText("~Painted Rs.1500");
        label10.setBounds(300,225,160,170);
        label10.setForeground(new Color(177,142,38));
        label10.setFont(f2);


        label11 = new JLabel();
        label11.setText("~Natural Palette Rs.300");
        label11.setBounds(535,225,200,170);
        label11.setForeground(new Color(177,142,38));
        label11.setFont(f2);


        label12 = new JLabel();
        label12.setText("~Minimal Chic Rs.700");
        label12.setBounds(770,225,200,170);
        label12.setForeground(new Color(177,142,38));
        label12.setFont(f2);


        label13 = new JLabel();
        label13.setText("~Elegant Ethereal Rs.1200");
        label13.setBounds(1035,225,220,170);
        label13.setForeground(new Color(177,142,38));
        label13.setFont(f2);
    
        

        button = new JButton("Order");
        button.setBounds(125, 550, 70,25);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setBackground(new Color(177,142,38));
        button.setForeground(Color.white);

        button1 = new JButton("Order");
        button1.setBounds(370, 550, 70,25);
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setBackground(new Color(177,142,38));
        button1.setForeground(Color.white);

        button2 = new JButton("Order");
        button2.setBounds(605, 550, 70,25);
        button2.addActionListener(this);
        button2.setFocusable(false);
        button2.setBackground(new Color(177,142,38));
        button2.setForeground(Color.white);

        button3 = new JButton("Order");
        button3.setBounds(883, 550, 70,25);
        button3.addActionListener(this);
        button3.setFocusable(false);
        button3.setBackground(new Color(177,142,38));
        button3.setForeground(Color.white);

        button4 = new JButton("Order");
        button4.setBounds(1105, 550, 70,25);
        button4.addActionListener(this);
        button4.setFocusable(false);
        button4.setBackground(new Color(177,142,38));
        button4.setForeground(Color.white);
        
        frame.setSize(1244,700);
        // frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(255-255-25));
        ImageIcon frameico=new ImageIcon("siteicon.png");//create an image icon
        frame.setIconImage(frameico.getImage());
        frame.add(label);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);
        frame.add(label9);
        frame.add(label10);
        frame.add(label11);
        frame.add(label12);
        frame.add(label13);
        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            int answer=JOptionPane.showConfirmDialog(null, "Are you sure you want to order this template?", "Confirmation",JOptionPane.YES_NO_OPTION);
            if(answer==0){
            JOptionPane.showMessageDialog(null, "Your total cost is Rs.500 ");
            frame.dispose();
            new home(userID);
            }
        }
        if(e.getSource()==button1){
            int answer=JOptionPane.showConfirmDialog(null, "Are you sure you want to order this template?", "Confirmation",JOptionPane.YES_NO_OPTION);
            if(answer==0){
            JOptionPane.showMessageDialog(null, "Your total cost is Rs.1500 ");
            frame.dispose();
            new home(userID);
            }
        }
        if(e.getSource()==button2){
            int answer=JOptionPane.showConfirmDialog(null, "Are you sure you want to order this template?", "Confirmation",JOptionPane.YES_NO_OPTION);
            if(answer==0){
            JOptionPane.showMessageDialog(null, "Your total cost is Rs.300 ");
            frame.dispose();
            new home(userID);
            }
        }
        if(e.getSource()==button3){
            int answer=JOptionPane.showConfirmDialog(null, "Are you sure you want to order this template?", "Confirmation",JOptionPane.YES_NO_OPTION);
            if(answer==0){
            JOptionPane.showMessageDialog(null, "Your total cost is Rs.700 ");
            frame.dispose();
            new home(userID);
            }
        }
        if(e.getSource()==button4){
            int answer=JOptionPane.showConfirmDialog(null, "Are you sure you want to order this template?", "Confirmation",JOptionPane.YES_NO_OPTION);
            if(answer==0){
            JOptionPane.showMessageDialog(null, "Your total cost is Rs.1200 ");
            frame.dispose();
            new home(userID);
            }
        }

    }
    public static void main(String args[]) {
       new invite();
    }

    

}