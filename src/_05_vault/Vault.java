package _05_vault;

public class Vault {
	
	int secretCode;
	
	
public Vault(int number) {
	secretCode = number;
}
 
public boolean tryCode(int number) {
	
	if(number == secretCode) {
		return true;
	}
	else {
		return false;
	}
}

public static void main(String[] args) {
	
		Vault vault = new Vault(234);
		JamesBond James = new JamesBond  ();
		System.out.println(James.findCode(vault)); 
		
		
	}

}
