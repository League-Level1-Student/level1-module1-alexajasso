package _06_duck;

public class Duck {
	String favoriteFood;
	int numberOfFriends;
	 Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	       
	}
	 
	 void quack() {
		 System.out.println("Duck is quacking");
	 }
	 
	 void waddle() {
		 System.out.println("Duck is waddling");
	 }

}
