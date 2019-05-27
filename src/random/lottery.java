package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
public static void main(String[] args) {

String winner = " Your lottery tickets are ";

	int randomNumber;
	Random random = new Random();
	randomNumber = random.nextInt(100);
	System.out.println(randomNumber);
	winner+=randomNumber;
 winner+=" , ";
	randomNumber = random.nextInt(100);
	winner+=randomNumber;
 winner+=" , ";
	randomNumber = random.nextInt(100);
		winner+=randomNumber;
	winner+=" , ";
	randomNumber = random.nextInt(100);
			winner+=randomNumber;
		winner+=" , ";
			randomNumber = random.nextInt(100);
			winner+=randomNumber;
	
	
	JOptionPane.showMessageDialog(null,winner);
}}
