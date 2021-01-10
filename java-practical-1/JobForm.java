import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class JobForm extends Frame implements ActionListener
{
	Label name=new Label("Name : ");
	Label email=new Label("Email : ");
	Label phone=new Label("Phone : ");
	Label jobProfile = new Label("Job Profile : ");
	Label submittedResult=new Label(" ");
	TextField tname=new TextField();
	TextField temail=new TextField();
	TextField tphone=new TextField();
	TextField tjobProfile = new TextField();
	Button b=new Button("submit");
	public JobForm()
	{
        add(name);
		add(tname);
		add(email);
		add(temail);
		add(phone);
		add(tphone);
		add(jobProfile);
		add(tjobProfile);
		add(b);
		add(submittedResult);
		name.setBounds(20,45,70,20);
		tname.setBounds(180,45,200,20);
		email.setBounds(20,95,70,20);
		temail.setBounds(180,95,200,20);
		phone.setBounds(20,125,70,20);
		tphone.setBounds(180,125,200,20);
		jobProfile.setBounds(20,150,70,20);
		tjobProfile.setBounds(180,150,200,20);
		b.setBounds(175,175,100,50);
		submittedResult.setBounds(200, 200, 300, 20);
		b.addActionListener(this);
		addWindowListener(new A());
	}
	public void actionPerformed(ActionEvent e)
	{ 
		String nameData = "Name: " + tname.getText() + " ";
		String emailData = "Email: " + temail.getText() + " ";
		String phoneData = "Phone Number: " + tphone.getText() + " ";
		String jobProfileData = "Job Profile: " + tjobProfile.getText() + " ";
		submittedResult.setText("SUBMITTED! "+ nameData + emailData + phoneData + jobProfileData);
	}
	public static void main(String s[])
    {
		JobForm j=new JobForm();
		j.setSize(new Dimension(500,500));
		j.setTitle("Job Registration");
		j.setVisible(true);
   }
}
 class App extends WindowAdapter
{ 
	public App(){}
	public void WindowClosing(WindowEvent e)
   { 
	System.exit(0);
   }
}
