package org.iuea.oop.views;

/*Group members 
MADRAGULE Andrito Joas  18/208/BIT-J
DUT Daniel Kur          19/550/BSCS-S
FAROUQ MUHAMMAD Ahmed   18/225/BIT-J
MOKILI LILALA Levi      18/0053/BSSE-J
AGANZE DUNIA Ghislain   18/138/BSSE-j
*/
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.iuea.oop.views.MainView;

import javax.swing.*;
public class LoginView extends MainView {
	
	//creating a constructor that will hold all the UI components 
	public LoginView() {
		//creating the Jframe window that will host all other Jcomponent
		JFrame frame1=new JFrame();
		JPanel panel1=new JPanel();
		panel1.setBackground(Color.GRAY);
		panel1.setBounds(0, 0, 250, 600);
		
		/*creating the label that hosts the title of the UI, setting it's position in the frame, it's size, giving 
		 * it a font family, a font size and bolding it*/
		JLabel label1=new JLabel("Sign Up");
		label1.setBounds(160, 50, 150, 50);
		label1.setFont(new Font("Calibri",Font.BOLD,36));
		label1.setForeground(Color.BLUE);
		
		/*creating the second label that hosts the title to show to the user where to enter his username, setting
		  * the position of the label, it's dimensions, font family,color and size */  
		JLabel label2=new JLabel("User name");
		label2.setBounds(70,150 , 200, 20);
		label2.setForeground(Color.BLUE);
		label2.setFont(new Font("Calibri",Font.BOLD,12));
		
		/*creating the textarea where the user will enter his username, setting it's position in the frame,
		  * it's dimensions,the color of the user's writting, font family and size*/
		JTextField text1=new JTextField();
		text1.setBounds(80, 170, 300, 50);
		text1.setForeground(Color.DARK_GRAY);
		text1.setFont(new Font("Helvetica",Font.ITALIC,18));
		
		/*creating the label that will show the user where to enter his password, setting it's position and 
		 * size,it's color, font family and font size*/
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
		
		/*creating the button where the user can press to cancel information he has given and leave the login page,
		 *  setting the position of the button, it's size,color and font color, family and size*/ 
		JButton button1=new JButton("Cancel");
		button1.setBounds(60, 370, 150, 50);
		button1.setForeground(Color.WHITE);
		button1.setBackground(Color.BLUE);
		button1.setFont(new Font("Calibri",Font.BOLD,14));
		button1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				frame1.setVisible(false);
			}
		});
		
		/*creating the button where the user can press to submit the information he has entered for approval,
		 *  setting the position of the button, it's size,color and font color, family and size*/ 
		JButton button2=new JButton("Login");
		button2.setBounds(250, 370, 150, 50);
		button2.setForeground(Color.WHITE);
		button2.setBackground(Color.BLUE);
		button2.setFont(new Font("Calibri",Font.BOLD,14));
		
		button2.addActionListener(new ActionListener(){
           
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String username=text1.getText();
				String password=text2.getText();
				
                 if(  username.contains("Dut") && password.contains("king")) {
					text1.setText(null);
					text2.setText(null);
					frame1.dispose();
					JOptionPane.showMessageDialog(null, "User logged in","Login message",JOptionPane.INFORMATION_MESSAGE);
					
					//opening the mainview page within loginpage for user Dut
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								MainView frame = new MainView();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});

					
					
				
				}else if(  username.contains("Dunia") && password.contains("ddunia")) {
					text1.setText(null);
					text2.setText(null);
					JOptionPane.showMessageDialog(null, "User logged in","Login message",JOptionPane.INFORMATION_MESSAGE);
                    frame1.dispose();
					
                  //opening the mainview page within loginpage for user Dut
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								MainView frame = new MainView();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				
				}else if(  username.contains("Joas") && password.contains("andrito")) {
					text1.setText(null);
					text2.setText(null);
					JOptionPane.showMessageDialog(null, "User logged in","Login message",JOptionPane.INFORMATION_MESSAGE);
                    frame1.dispose();
					
                  //opening the mainview page within loginpage for user Dut
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								MainView frame = new MainView();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				
				}else if(  username.contains("Mokili") && password.contains("levi")) {
					text1.setText(null);
					text2.setText(null);
					JOptionPane.showMessageDialog(null, "User logged in","Login message",JOptionPane.INFORMATION_MESSAGE);
                    frame1.dispose();
					
                  //opening the mainview page within loginpage for user Dut
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								MainView frame = new MainView();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				
				}else if(  username.contains("Farouq") && password.contains("farouq")) {
					text1.setText(null);
					text2.setText(null);
					JOptionPane.showMessageDialog(null, "User logged in","Login message",JOptionPane.INFORMATION_MESSAGE);
                    frame1.dispose();
					
                  //opening the mainview page within loginpage for user Dut
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								MainView frame = new MainView();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				
				}else if(text1.getText().isEmpty() || text2.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"fill all the forms first","warning ", JOptionPane.NO_OPTION);
				} else{ 
					JOptionPane.showMessageDialog(null, "invalid Login Details","Login error",JOptionPane.ERROR_MESSAGE);
				}
			}
        });
		
		/*creating a button where a new user can press to create an account, setting the position of this button,
		 *  it's sizes,font family,size and color*/
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

	

}
