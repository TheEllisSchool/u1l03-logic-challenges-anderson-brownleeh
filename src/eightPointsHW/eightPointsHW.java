package eightPointsHW;

import javax.swing.JOptionPane;

public class eightPointsHW {

	public static void main(String[] args) {
		
		//Evaluates number to an exponent (4 points)
		/*
		String input = JOptionPane.showInputDialog(null, "What number is the base?");
		String input2 = JOptionPane.showInputDialog(null, "What number is the exponent?");
		int base = Integer.parseInt(input);
		int exponent = Integer.parseInt(input2);
		int answer = base;
		exponent--;
		
		do {
			exponent --;
			answer = answer*base;
			//JOptionPane.showMessageDialog(null, answer);
		} while (exponent>0);
		JOptionPane.showMessageDialog(null,"Your answer is: " + answer);
	*/
	
	// calculates multiplication tables of a certain number to a certain number (4 points)
		//note: dosn't work with non-positive numbers as howFar
		String input1 = JOptionPane.showInputDialog(null, "What number are you multipying?");
		String input2 = JOptionPane.showInputDialog(null, "How far do you want to multiplications to go?");
		int multipyer = Integer.parseInt(input1);
		int howFar = Integer.parseInt(input2);
		int counter = 1;
		while (counter<howFar+1){ // plus one is bc otherwise it was cutting off too early
			int result = multipyer*counter; // result defined in loop so it resets
			JOptionPane.showMessageDialog(null, multipyer+"*"+counter+"="+result);
			counter++;
		} 
	
	
	
	
	
	}
}


