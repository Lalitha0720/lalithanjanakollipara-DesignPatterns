package behavioralPattern;
public class calculator
{
	private Strategy strategy;
	public calculator(Strategy strategy)
	{
		this.strategy = strategy;
	}
	public int execute(int n1,int n2)
	{
		return strategy.doOperation(n1,n2);
	}
}