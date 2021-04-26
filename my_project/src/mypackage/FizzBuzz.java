package mypackage;

public class FizzBuzz {
	
	private static String fizz = "...Fizz...";
	private static String buzz = "...Buzz...";
	
	private boolean isFizz(int number) {
		return number%3 == 0 || String.valueOf(number).contains("3");
	}
	
	private boolean isBuzz(int number) {
		return number%5 == 0 || (number+"").contains("5");
	}
	
	public static void main(String[] args) {
		
		FizzBuzz fizzBuzz = new FizzBuzz();
			
			for(int i=0; i<100; i++) {
				
				if(fizzBuzz.isFizz(i)) {
					System.out.println(fizz);
					if(fizzBuzz.isBuzz(i) ) {
						System.out.println(buzz);
					}
				}else if(fizzBuzz.isBuzz(i) ) {
					System.out.println(buzz);
				}
				else {
					System.out.println(i);
				}
			}
	
	}

}
