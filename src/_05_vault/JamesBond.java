package _05_vault;

public class JamesBond {

	 int findCode(Vault vault) {

		for(int i = 0; i <= 1000000; i++) {
			boolean answer  = vault.tryCode(i);
			if(answer == true) {
				return i;
			}
		}
		return -1;
	}
}




