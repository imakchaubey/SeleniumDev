package icici.loans.carloans;

public class FirstClass {
	int a=10,b=2,result;
	public void sum() {
		result=a+b;
	System.out.println("sum of a and b is :"+result);
	}
	public void sub() {
		result=a-b;
		System.out.println("subtraction of a and b is :"+result);
	}

	public static void main(String args[]) {
		System.out.println("Hi");
		FirstClass obj1=new FirstClass();
		obj1.sum();
		obj1.sub();
				
	}
}
