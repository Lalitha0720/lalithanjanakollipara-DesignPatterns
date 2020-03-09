package structuralPattern;
public class redCircle implements DrawAPI
{
	@Override
	public void drawCircle(int radius,int x,int y)
	{
		System.out.println("Drawing a circle of colour - red, radius - " + radius + ", x - " + x + ", y - " + y);
	}
}