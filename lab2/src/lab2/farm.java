package lab2;

import java.util.*;
public class farm {
	/*public static void main(String[] args) {
		Duck duck = new Duck(true);
		
		boolean canTheDuckFly = duck.canfly;
		if(canTheDuckFly == true) {
			System.out.println("the duck can fly");
		}
		
		duck.quack();
		String feed = duck.eat("burger");
		System.out.println(feed);
		
		int expectedDistance = 10;
		duck.swim(expectedDistance);
		System.out.println("the Expected distance = " + expectedDistance);
	}*/
	
	/*public static void main(String[] args) {
		String in = "Hello,World,Java";
		StringTokenizer st = new StringTokenizer(in,",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		int sum = Duck.add(1, 4);
		System.out.println(sum);
		
		Duck duck = new Duck(true);
		duck.swim(10);
		
		int sum1 = Duck.add(5, 11);
		System.out.println(sum1);
		
	}*/
	

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String Input = scanner.nextLine();
			boolean[] dp = new boolean[100000001];
			long i;
			long count = 6;
			long test = 6;
			
			long value = Integer.valueOf(Input.substring(2));

			if (Input.startsWith("X")) {
				if (value > 5) {
					while ( value != 5 && value % 5 == 0)
						value /= 5;
					while ( value != 3 && value % 3 == 0)
						value /= 3;
					while ( value != 2 && value % 2 == 0)
						value /= 2;
					if ( value == 2 || value == 3 || value == 5) 
						System.out.print("true ");
					else
						System.out.print("false ");
				} else {
					System.out.print("true ");
				}
			}

			if (Input.startsWith("Y")) {
				long counter = 0;
				i = 0; long Cal_i; 
				long orgValue = value;
				while ( counter < value ) {
					i++;
					Cal_i = i;
					if (Cal_i > 5) {
						while ( Cal_i != 5 && Cal_i % 5 == 0)
							Cal_i /= 5;
						while ( Cal_i != 3 && Cal_i % 3 == 0)
							Cal_i /= 3;
						while ( Cal_i != 2 && Cal_i % 2 == 0)
							Cal_i /= 2;
						if ( Cal_i == 2 || Cal_i == 3 || Cal_i == 5) 
							counter++;
					} else {
						counter++;
					}
				}
				System.out.print(i);
			}
		}
	
}
