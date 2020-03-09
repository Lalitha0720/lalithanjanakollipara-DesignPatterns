package structuralPattern;
public class BridgePattern
{
	public static void main(String [] args)
	{
		Shape redcircle = new Circle(100,100,10,new redCircle());
		Shape greencircle = new Circle(100,100,10,new greenCircle());
		redcircle.draw();
		greencircle.draw();
	}
}