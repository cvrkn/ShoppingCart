package Shop;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class UserName extends UserMail
{
	////////////////////////////////////
	////////////////////////////////////
    boolean UserFlag=false;
    static JFrame F;
    Frame F1 = new Frame();
    JButton Login = new JButton(" Login ");
    JButton OTP   = new JButton("Send OTP");
    JButton B_Exit   = new JButton("EXIT");
    int otp=0;
    JPanel UserLogin =new JPanel();
    JPanel User =new JPanel();
    //JLabel UserName = new JLabel("USER NAME");
    //JLabel Password = new JLabel("Password");
    JTextField T_UserName = new JTextField(10);
    //JTextField T_Password = new JTextField(10);

    JLabel L_Name = new JLabel(" NAME");
    JLabel L_Email = new JLabel("Email Id.");

    JTextField T_Name = new JTextField(20);
    JTextField T_Email = new JTextField(30);
    JTextField T_OTP = new JTextField(4);

    //public String U_Name;
    
    int U_OTP;
    int G_OTP;
     
    JPasswordField T_Password = new JPasswordField();   
    
    //MailId
    UserMail UM = new UserMail();

    void LogIn()
    {
        F1.setSize(1300, 800);
        T_UserName.setText("UserName..");

        User.setLayout(new BorderLayout());
        UserLogin.setLayout(new GridLayout(4,2,10,10));
        UserLogin.add(L_Name);
        UserLogin.add(T_Name);
        UserLogin.add(L_Email);
        UserLogin.add(T_Email);
        UserLogin.add(OTP);
        UserLogin.add(T_OTP);
        UserLogin.add(Login);
        UserLogin.add(B_Exit);

        User.add(UserLogin, BorderLayout.CENTER);
        User.setBorder(new EmptyBorder(270, 450, 270, 450));
        F1.add(User);
        F1.setVisible(true);
        
        OTP.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
	                otp_Button();
            }         
        });        
       
        Login.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
                U_OTP = Integer.parseInt( T_OTP.getText());
                //if(U_OTP.length()!=0)
                if(U_OTP == G_OTP)
                {
                    UserFlag=true;
                    F1.setVisible(false);
                    F.setVisible(UserFlag); 
                }
            }         
        });
        B_Exit.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
        	System.exit(0);
            }
        });
    }
    void otp_Button()
    {
    	U_Name = String.valueOf( T_Name.getText());
        U_Email = String.valueOf( T_Email.getText());
        if(U_Name.length()!=0)
        if(U_Email.contains("@"))
        {
        	if (otp==0)
    		{
	        	T_OTP.setText("OTP Generated");
	        	G_OTP = UM.OTPmail(U_Name,U_Email,"0");
	        }
	        otp++;
        }
    }
    void MContext(String Cont)
    { 
    	G_OTP = UM.OTPmail(U_Name,U_Email,Cont); 
    }
}
