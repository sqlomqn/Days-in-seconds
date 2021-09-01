import	java.util.Scanner;
public	class	Days	{
	public	static	void	main(String[]	args)	{
		Scanner	sc	=	new	Scanner(System.in);
		System.out.println("Enter the numbers,please:");
		int	days	=	sc.nextInt();
		System.out.println("Seconds="	+	days*24*60*60);
		sc.close();
	}
}