package lab1;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class mar_7 {
	
	public static void main(String[] args) {
		/*DecimalFormat df = new DecimalFormat("00.000");
		String str = df.format(1.23);
		System.out.println(str);
	
		DecimalFormat df2 = new DecimalFormat("#0.###");
		String str2 = df2.format(1.23);
		System.out.println(str2);*/
		
		/*int n1,n2;
		Scanner scannerObject = new Scanner(System.in);
	
		System.out.println("Enter two whole numbers");
		System.out.println("separated by one of more spaces: ");
		n1 = scannerObject.nextInt();
		n2 = scannerObject.nextInt();
		System.out.println("You entered" + n1 + "and" + n2);
	
		System.out.println("Next enter two number");
		System.out.println("Decimal point are allowed.");
	
		double d1,d2;
		d1 = scannerObject.nextDouble();
		d2 = scannerObject.nextDouble();
		System.out.println("You entered" + d1 + "and" + d2);
	
		System.out.println("Next enter two words: ");
	
	
		String word1 = scannerObject.next();
		String word2 = scannerObject.next();
		System.out.println("You entered \"" + word1 + "\"" + "and"+  word2 + "\"");
	
		String junk = scannerObject.nextLine();
	
		System.out.println("Next enter a line of text");
		String line = scannerObject.nextLine();
		System.out.println("You entered: \"" + line + "\"");*/
		
		/*Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		System.out.println("num=" + num);
		
		scanner.nextLine();
		
		String line2 = scanner.nextLine();
		System.out.println("line="+ line2);*/
		
		/*Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("##");
	
		int a = scanner.nextInt();
		int b = scanner.nextInt();
	
		System.out.println(a);
		System.out.println(b);*/
	
		/*Scanner filein = null;
	
		try{
			filein = new Scanner(new FileInputStream("ggg.txt"));
				
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
			System.exit(0);
		}
	
		String name = filein.nextLine();
		int num = filein.nextInt();
		filein.nextLine();
		String sch = filein.nextLine();
		System.out.println(name);
		System.out.println(num);
		System.out.println(sch);*/
		
		
		/*try{
			Scanner scanner = new Scanner(new FileInputStream("ggg.txt"));
			while(scanner.hasNextLine()){
				String line = scanner.nextLine();
				System.out.println(line);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}*/
		
		/*int number = 24;
		if(number%2==0)
			System.out.println("true");
		else
			System.out.println("false");
		
		int grade1 = 65;
		int grade2 = 50;
		
		System.out.println(grade1>=60 ? "Paused." : "Failed.");
		System.out.println(grade2>=60 ? "Paused." : "Failed.");*/
		
		/*int a = 1;
		int b = 0;
		if ((b !=0) && ((a/b) >=2))
		System.out.println("bingo");
		if ((b !=0) & ((a/b) >=2))
		System.out.println("bingo again");*/
		
		int e = 2;
		do{
			System.out.println(e);
			e+=2;
		}while(e<=10);
		
		int sum = 0;
		for(int i=0;i<=3;i++)
		{
			sum +=i;
		}
		System.out.println("the total is: "+ sum);
		
	}
}
