package hw2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class hw2 {
	
	
	public static void main(String[] args) {
		
		Scanner scannerObj = new Scanner(System.in);

		int a,b,c;
	
		a = scannerObj.nextInt();
		scannerObj.nextLine();
	
		b = scannerObj.nextInt();
		scannerObj.nextLine();
	
		c = scannerObj.nextInt();
		scannerObj.nextLine();
	
		String decimalPlaces = scannerObj.next();
		scannerObj.nextLine();
	
		double x1,x2;
	
		x1 = (-b + Math.sqrt(Math.pow(b,2.0)-4*a*c))/(2*a);
		x2 = (-b - Math.sqrt(Math.pow(b,2.0)-4*a*c))/(2*a);
	
		DecimalFormat df = new DecimalFormat(decimalPlaces);
		String str1 = df.format(x1);
		String str2 = df.format(x2);
		
		if(a>0)
		{
			if(x1>x2)
			{
				System.out.println(str1);
				System.out.println(str2);
			}
			else
			{
				System.out.println(str2);
				System.out.println(str1);
			}
		}
		
		else
		{
			if(x1>x2)
			{
				System.out.println(str2);
				System.out.println(str1);
			}
			else
			{
				System.out.println(str1);
				System.out.println(str2);
			}
		}
		
	}

}