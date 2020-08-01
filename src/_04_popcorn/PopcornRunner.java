package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String flavor = JOptionPane.showInputDialog(" What flavor do you want for your popcorn? ");
		Popcorn corn = new Popcorn(flavor);
		Microwave pop = new Microwave();

		String time = JOptionPane.showInputDialog(" How many minutes do you want your popcorn in the microwave for? ");
		int minutes = Integer.parseInt(time);
		pop.putInMicrowave(corn);
		pop.setTime(minutes);
		pop.startMicrowave();
		

		
		//Some code

	}

}

