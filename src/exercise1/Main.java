package exercise1;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		printToUser("Josh");
			System.out.println(returnTypes());
			System.out.println(addUp(5, 0, true));
			
		for (int x=1 ; x<10; x++) {
			System.out.println(addUp(x,numArray[x-1],true));
			
		}
			
			
		
	}
	public static void printToUser(String name) {
		String helloworld;
		helloworld = ("Hello World!");
				System.out.println(helloworld + name);
	}
	
	public static String returnTypes() {
		return "Hello You!";
	}
	
	public static int addUp( int numberOne,int numberTwo,boolean sumNumber) {
		if (sumNumber == true) {
			return numberOne + numberTwo;
		}
		else if (numberOne == 0 || numberTwo == 0) {
			return (3);
		}
		else {
			return (numberOne * numberTwo);
		}}
	
	public static int [] numArray = {1,2,3,4,5,6,7,8,9,10};
	
	public static int numArray(int[] array, int check) {
		for (int i =0; i<array.length; i++){
			if(array[i] == check)
				return System.out.println(i);
				else ;}		  
			
				
		}
	}
	
}	

		
		