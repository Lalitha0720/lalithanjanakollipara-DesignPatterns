package behavioralPattern;
public class StrategyPattern
{
	public static void main(String [] args)
	{
		calculator cal = new calculator(new addNumbers());
		System.out.println("20 + 7 = " + cal.execute(20,7));
		cal = new calculator(new subNumbers());
		System.out.println("20 - 7 = " + cal.execute(20,7));
		cal = new calculator(new mulNumbers());
		System.out.println("20 * 7 = " + cal.execute(20,7));
	}
}