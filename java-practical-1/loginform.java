import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class JobForm extends Frame implements ActionListener
{
	Label l1=new Label("User name : ");
	Label l2=new Label("Surname : ");
	Label l3=new Label(" ");
	TextField t1=new TextField();
	TextField t2=new TextField();
	Button b=new Button("submit");
	public JobForm()
	{
                add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(l3);
		l1.setBounds(20,45,70,20);//set co-ordinates 
		t1.setBounds(180,45,200,20);
		l2.setBounds(20,95,70,20);
		t2.setBounds(180,95,200,20);
		b.setBounds(150,150,100,50);
		b.addActionListener(this);
		addWindowListener(new A());
	}
	public void actionPerformed(ActionEvent e)
	{ 
		l3.setText("SUBMITTED "+t1.getText());
	}
	public static void main(String s[])
    {
		jobform j=new JobForm();
		j.setSize(new Dimension(400,400));
		j.setTitle("Job Registration");
		j.setVisible(true);
   }
}
 class A extends WindowAdapter
{ 
	public A(){}
	public void WindowClosing(WindowEvent e)
   { 
	System.exit(0);
   }
}
