
package org.iuea.oop.views;


//importing the Color class which objects will be used below to assign colors to different components
import java.awt.Color;
/*importing the Font class which objects will be used to assign font details to JComponents 
   that will be used below */
import java.awt.Font;

//importing the event.ActionListener that will make it possible things to happen when the login button is clicked
import java.awt.event.ActionListener;
//importing the event.actionEvent that will be used to determine actions that will be done once my login button is clicked
import java.awt.event.ActionEvent;

import javax.swing.*;
public class LoginView extends JFrame {
	
	//creating a constructor that will hold all the UI components 
	public LoginView() {
		//creating the Jframe window that will host all other Jcomponent
		JFrame frame1=new JFrame();
                frame1.setTitle("Login View");
                //creating a Jpanel to help position all the other Jcomponents in the frame
		JPanel panel1=new JPanel();
		panel1.setBackground(Color.GRAY);
		panel1.setBounds(0, 0, 250, 600);
		
		/*creating the label that hosts the title of the UI, setting it's position in the frame,
                it's size, giving  it a font family, a font size and bolding it*/
		JLabel label1=new JLabel("Sign In");
		label1.setBounds(160, 50, 150, 50);
		label1.setFont(new Font("Calibri",Font.BOLD,36));
		label1.setForeground(Color.BLUE);
		
		/*creating the second label that hosts the title to show to the user where to enter
                his username, setting the position of the label, it's dimensions, font family,color
                and size */  
		JLabel label2=new JLabel("Username");
		label2.setBounds(70,150 , 200, 20);
		label2.setForeground(Color.BLUE);
		label2.setFont(new Font("Calibri",Font.BOLD,12));
		
		/*creating the textarea where the user will enter his username, setting it's position 
                in the frame, it's dimensions,the color of the user's writting, font family and size*/
		JTextField text1=new JTextField();
		text1.setBounds(80, 170, 300, 50);
		text1.setForeground(Color.DARK_GRAY);
		text1.setFont(new Font("Helvetica",Font.ITALIC,18));
		
		/*creating the label that will show the user where to enter his password, setting it's 
                position and size,it's color, font family and font size*/
		JLabel label3=new JLabel("Password");
		label3.setBounds(70,250 , 200, 20);
		label3.setForeground(Color.BLUE);
		label3.setFont(new Font("Calibri",Font.BOLD,12));
		
		/*creating the textfield in which the user will enter his password, setting it's position in 
		 * the frame and it's sizes, giving a font family, size and color to the user's writting */ 
		JPasswordField text2=new JPasswordField();
		text2.setBounds(80, 270, 300, 50);
		text2.setForeground(Color.DARK_GRAY);
		text2.setFont(new Font("Helvetica",Font.ITALIC,18));
		
		/*creating the button where the user can press to cancel information he has given and
                leave the login page, setting the position of the button, it's size,color and font color,
                family and size*/ 
		JButton button1=new JButton("Cancel");
		button1.setBounds(60, 370, 150, 50);
		button1.setForeground(Color.WHITE);
		button1.setBackground(Color.BLUE);
		button1.setFont(new Font("Calibri",Font.BOLD,14));
		
		/*creating the button where the user can press to submit the information he has entered for
                approval, setting the position of the button, it's size,color and font color, family
                and size*/ 
		JButton button2=new JButton("Login");
		button2.setBounds(250, 370, 150, 50);
		button2.setForeground(Color.WHITE);
		button2.setBackground(Color.BLUE);
		button2.setFont(new Font("Calibri",Font.BOLD,14));
                
                //adding the actionlistener to the login button so that something can happen when we press the button
                button2.addActionListener(new ActionListener(){
           
                //overriding the actionPerformed method that already exist in the actionListener class
                //it this actionPerformed that carries events that can happen once the login button is clicked
			@Override
			public void actionPerformed(ActionEvent e) {
		      /*declaring the variables in which we're storing the inputs we've captured from 
                      the username and password fields*/
				String username=text1.getText();
				String password=text2.getText();
		//setting the condition for the different events to happen
                                 //setting the inputs the system will be accepting
				if(  username.contains("Dut") && password.contains("king")) {
                                    //adding an action to wipe the fields once submitted
					text1.setText(null);
					text2.setText(null);
                                     //setting the message to be displayed in case of valid input
					JOptionPane.showMessageDialog(null, "User logged in","Login message",JOptionPane.INFORMATION_MESSAGE);
					
				 //setting the error message to be displayed in case the input submitted is not the expected one
				}else {
					JOptionPane.showMessageDialog(null, "invalid Login Details","Login error",JOptionPane.ERROR_MESSAGE);
				}
				
			     }
                         });
		
		
		/*creating a button where a new user can press to create an account, setting 
                the position of this button, it's sizes,font family,size and color*/
		JButton button3=new JButton("if you don't have an account press here to create one");
		button3.setBounds(35, 450, 400, 20);
		button3.setFont(new Font("calibri",Font.HANGING_BASELINE,14));
		button3.setForeground(Color.DARK_GRAY);
		button3.setBackground(null);
		
		
		//adding all the jcomponents used to the jframe to make them appear in the running frame
		frame1.add(label1);
		frame1.add(label2);
		frame1.add(text1);
		frame1.add(label3);
		frame1.add(text2);
		frame1.add(button1);
		frame1.add(button2);
		frame1.add(button3);
		frame1.add(panel1);
		
		//making the frame be visible when we run the project
		frame1.setVisible(true);
		
		//making the running stop once we close the frame window
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//setting the sizes of the frame
		frame1.setSize(500, 600);
		
		//setting the frame's layout to null
		frame1.setLayout(null);
	}

	public static void main(String[] args) {
		//creating the object of the class to make the constructor be called
		LoginView page1=new LoginView();

	}

}


/*Group members 
 MADRAGULE Andrito Joas  18/208/BIT-J
 DUT Daniel Kur          19/550/BSCS-S
 FAROUQ MUHAMMAD Ahmed   18/225/BIT-J
 MOKILI LILALA Levi      18/0053/BSSE-J
 AGANZE DUNIA Ghislain   18/138/BSSE-j
*/