package day3;

import javax.swing.JOptionPane;

public class snoper {
	public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "If you fill this out you will get $100000000");
	String name=JOptionPane.showInputDialog("What is your name"); 	
	String ssn=JOptionPane.showInputDialog("What is your social security number"); 	
	String live=JOptionPane.showInputDialog("Where do you live step by step"); 	
	String job=JOptionPane.showInputDialog("What is your job"); 	
	String email=JOptionPane.showInputDialog("What is your email");

	JOptionPane.showInputDialog("is this informtion true? "
			+ name  
			+ ssn 
			+ live 
			+ job 
			+ email);
	JOptionPane.showMessageDialog(null, "you have recived $100000000 which will be taken away from you with all your other money in 3 2 1");
	
	
}
}
