package structuralPattern;
public class greenCircle implements DrawAPI
{
	@Override
	public void drawCircle(int radius,int x,int y)
	{
		System.out.println("Drawing a circle of colour - green, radius - " + radius + ", x - " + x + ", y - " + y);
	}
}