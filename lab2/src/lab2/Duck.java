package lab2;

public class Duck {
	public boolean canfly = true;
	
	public Duck(boolean canfly) {
		this.canfly = canfly;
	}
	
	public void quack() {
		System.out.println("Quack!");
	}
	
	public String eat(String food) {
		String message = "Thank you! The " + food + " "
				+ "is good!";
		return message;
	}
	
	public void swim(int distance) {
		distance--;
		System.out.println("The duck can swim " + distance);
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	
	
}
