//*********  Basic Syntax  ********** 

import javax.swing.JFrame;

public class BasicSyntax {
	public static void main(String[] args) {
		JFrame f = new JFrame("Title Here");
		// We have to make object of frame.
		f.setSize(500,500);
		// Here we give size in pixel only.
		f.setResizable(true);
		// Page is resizeable
		// If you does not want resizeable page use- make it FALSE.
		f.setVisible(true);
		// By default visibility is false so you want to make it TRUE.
		f.setLocationRelativeTo(null);
		// Default location is CENTER.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// By default it is not AUTO CLOSE.
	}}