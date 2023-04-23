import java.io.*;

class CalculatorProgram
{
	DataInputStream dis = new DataInputStream(System.in);
	
	void add(int a,int b)
	{
		int c = a + b;
		String res = String.valueOf(c);
		System.out.println("The result of the addition operation is "+ c);
	}
	
	void subtract(int a, int b)
	{
		int c = a - b;
		String res = String.valueOf(c);
		System.out.println("The result of the subtraction operation is "+ c);
	}
	
	void multiply(int a, int b)
	{
		int c = a * b;
		String res = String.valueOf(c);
		System.out.println("The result of the multiplication operation is "+ c);
	}
	
	void divide(int a, int b)
	{
		float c = a/b;
		String res = String.valueOf(c);
		System.out.println("The result of the division operation is "+ c);
	}
	
	void square(int a)
	{
		int c = a * a;
		String res = String.valueOf(c);
		System.out.println("The result of the square operation is "+ c);
	}
	
	void cube(int a)
	{
		int c = a * a * a;
		String res = String.valueOf(c);
		System.out.println("The result of the cube operation is "+ c);
	}
	
	void exit()
	{
		System.exit(0);	
	}
	
	int findFactorial(int n)
	{
		if(n > 1)
		{
			return n *findFactorial(n-1);
		}
		else
		{
			return 1;
		}
	}
	
	void resultFacotrial(int b)
	{
		int c = findFactorial(b);
		String res = String.valueOf(c);
		System.out.println("The result of the factorial operation is "+ c);
	}
	void execute()
	{
		
		try
		{
		int d,e,f;
		while(true)
		{
		System.out.println("Welcome to the calculator program.");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Square");
		System.out.println("6. Cube");
		System.out.println("7. Compute factorial");
		System.out.println("8. Exit");
		System.out.println("Choose the number for the operation you want to perform");
		
		d = Integer.parseInt(dis.readLine());
		
		switch(d)
		{
			//String op = String.valueOf(d);
			case 1: 
				System.out.println("Enter the first number");
				e = Integer.parseInt(dis.readLine());
				System.out.println("Enter the first number");
				f = Integer.parseInt(dis.readLine());
				add(e,f);
				break;
			case 2:
				System.out.println("Enter the first number");
				e = Integer.parseInt(dis.readLine());
				System.out.println("Enter the first number");
				f = Integer.parseInt(dis.readLine());
				subtract(e,f);
				break;
			case 3:
				System.out.println("Enter the first number");
				e = Integer.parseInt(dis.readLine());
				System.out.println("Enter the first number");
				f = Integer.parseInt(dis.readLine());
				multiply(e,f);
				break;
			case 4:
				System.out.println("Enter the first number");
				e = Integer.parseInt(dis.readLine());
				System.out.println("Enter the first number");
				f = Integer.parseInt(dis.readLine());
				divide(e,f);
				break;
			case 5:
				System.out.println("Enter the number");
				e = Integer.parseInt(dis.readLine());
				square(e);
				break;
			case 6:
				System.out.println("Enter the number");
				e = Integer.parseInt(dis.readLine());
				cube(e);
				break;	
			case 7:
				System.out.println("Enter the number");
				e = Integer.parseInt(dis.readLine());
				resultFacotrial(e);
				break;
			case 8:
				exit();
				break;	
			default:
				System.out.println("Please check your input");
				break;
		}
		
		}
		}
	catch(Exception x)
	{
		System.out.println("Exception caught: "+ x.toString());
		System.exit(1);
	}
 }
}

class Exec
{	
	public static void main(String args[])
	{
		CalculatorProgram cp = new CalculatorProgram();
		cp.execute();
	}
	
}