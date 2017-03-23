package prime;

import java.util.*;

public class prime {
	
	public static void main(String[] args) {
		
	
		boolean special[] = new boolean[100000001];
		
		for(int i=0;i<100000001;i++) {
			special[i] = false;
		}
		
		special[1] = true;
		
		for(int i=2;i<100000001;i++) {
				int tmp = i;
				while(tmp%2==0)
					tmp=tmp/2;
				while(tmp%5==0)
					tmp=tmp/5;
				while(tmp%3==0)
					tmp=tmp/3;
				if(tmp==1)
				special[i] = true;
		}
		
		Scanner scanner = new Scanner(System.in);
		String instruction = scanner.nextLine();
		
		int number = Integer.valueOf(instruction.substring(2));
		
		if(instruction.startsWith("X")) {
			
			System.out.print(special[number]);
		}
		
		else if(instruction.startsWith("Y")) {
			int count = 0;
			
			for(int i=1;i<100000001;i++)
			{
				if(special[i]==true){
					count++;	
					if(count==number)
					{
						count=i;
						break;
					}
				}

			}
			System.out.print(count);
		}
		
		else {
			System.out.println("The input is not valid");
		}
	}
}
