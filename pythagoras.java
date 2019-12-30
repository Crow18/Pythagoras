import java.util.*;

public class pythagoras
{
	public static int root(int num)
	{
		int i = 1;
		while (i*i < num)
			i++;
		return i;
	}

	public static void main(String[] args)
	{
		int a = 0, b = 0, x = 0; 
		Scanner read = new Scanner(System.in);
		System.out.println("insert two whole values of the sides\n"); 
		a = read.nextInt();
		b = read.nextInt();

		x = (a * a) + (b * b);
		System.out.println(root(x) + " units");
	}
}
