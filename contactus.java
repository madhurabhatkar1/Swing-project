
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// String userID;

class contactus extends JFrame	implements ActionListener {
		String userID;
		JButton submit;
		JLabel NAME,EMAIL,CONTACT,MESSAGE,heading,INFOT;
		JTextField NAMET,EMAILT,CONTACTT,MESSAGET;
		JFrame contactpg=new JFrame();
		contactus(){

		ImageIcon framebg=new ImageIcon("sitebg.jpg");
        contactpg.setContentPane(new JLabel(framebg));
		Font f1=new Font("Times New Roman",Font.BOLD,16);
		Color c1=new Color(255,255,255);
		Color c2=new Color(54,83,100);

	
		heading =new JLabel("<html>CONTACT US</html>");
        heading.setBounds(0,10,1366,100);
        heading.setFont(new Font("Castellar",Font.BOLD,40));
        heading.setBackground(new Color(54,83,100));
        heading.setForeground(c1);
        heading.setOpaque(true);
		
		NAME =new JLabel("NAME");
		NAME.setBounds(50,150,100,50);
		NAME.setFont(f1);
		NAME.setForeground(c2);
		
		NAMET=new JTextField();
		NAMET.setBounds(150,150,300,50);
		
		EMAIL =new JLabel("EMAIL");
		EMAIL.setBounds(50,220,100,50);
		EMAIL.setFont(f1);
		EMAIL.setForeground(c2);
		
		EMAILT =new JTextField();
		EMAILT.setBounds(150,220,300,50);
		
		CONTACT =new JLabel("CONTACT");
		CONTACT.setBounds(50,290,100,50);
		CONTACT.setFont(f1);
		CONTACT.setForeground(c2);
		
		CONTACTT =new JTextField();
		CONTACTT.setBounds(150,290,300,50);
		
		MESSAGE =new JLabel("MESSAGE");
		MESSAGE.setBounds(50,360,100,50);
		MESSAGE.setFont(f1);
		MESSAGE.setForeground(c2);

		MESSAGET =new JTextField();
		MESSAGET.setBounds(150,360,300,50);
		
		
		INFOT =new JLabel("<html>EMAIL: WEDDINGPLANER@gmail.com<br><br>CONTACT-NO: 9584157545<br><br> WEBSITE: WWW.WEDDINGPLANER.COM <br><br> OFFICE-LOCATION: FLAT NO 52, <br><br>COMMERCIAL COMPLEX, <br><br>GIRGAON EAST,<br><br>MUMBAI,<br><br>423234</html>");
		INFOT.setBounds(500,50,900,500);
		INFOT.setFont(f1);
		INFOT.setBackground(new Color(220,220,220));
        INFOT.setForeground(c2);
        INFOT.setOpaque(false);
				
		submit =new JButton("SUBMIT");
		submit.setBounds(643,500,100,50);
		submit.addActionListener(this);
		submit.setBackground(new Color(54,83,100));
		submit.setForeground(c1);
		submit.setFocusable(false);
		
		contactpg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contactpg.setLayout(null);
        contactpg.setVisible(true);
        contactpg.setSize(3000,3000);
		
		contactpg.add(heading);
		contactpg.add(NAME);
		contactpg.add(EMAIL);
		contactpg.add(CONTACT);
		contactpg.add(MESSAGE);
		contactpg.add(submit);
		contactpg.add(NAMET);
		contactpg.add(EMAILT);
		contactpg.add(CONTACTT);
		contactpg.add(MESSAGET);
		contactpg.add(INFOT);
		
		ImageIcon frameico=new ImageIcon("siteicon.png");//create an image icon
        contactpg.setIconImage(frameico.getImage());
		
		
	}	
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==submit){
			String input = CONTACTT.getText(); 
						if(CONTACTT.getText().isEmpty()){
							JOptionPane.showMessageDialog(this, "Contact field is empty");
						}
					// 	else if(CONTACTT.getText().isEmpty()==false){
					// 		try{
					// 			Integer.parseInt(input); 	
					// 			}
					// 	catch (Exception exception)  {
					// 		JOptionPane.showMessageDialog(this,"Contact should consist of numbers only");
					// 	}
					// }

		else if(NAMET.getText().isEmpty()){
							JOptionPane.showMessageDialog(this, "Name field is empty");			

					}
		else if(EMAILT.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Email field is empty");

				}
		else if(MESSAGET.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Message field is empty");
			}
			else{
			JOptionPane.showMessageDialog(this, "Your response has been recorded");
			contactpg.dispose();
			new home(userID);
			}
		}
	}
	 public static void main(String args[]){
        new contactus();
    }
}
	
		