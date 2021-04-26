package mypackage;

public class KataLaCombe {
	
	
	
	public static void main(String[] args) {
		
		for(int i=0; i<100; i++) {
			//enlever les if else
			//static
			//meme niveau d'abstraction
			// l'implementation objet utiliser fiz buz dans les objets.
			
			if(i%3 == 0 || String.valueOf(i).contains("3")) {
				System.out.println("...Fizz...");
			}else			
			if(i%5 == 0 || containsTheNumber(i, 5) ) {
				System.out.println("...Buzz...");
			}
			else {
				System.out.println(i);
			}
		}

	}
	
	private static boolean containsTheNumber(int nombre, int nbr) {
		
		if((nombre+"").contains(nbr+"") ) {
			return true;
		}
		return false;
	}

}
