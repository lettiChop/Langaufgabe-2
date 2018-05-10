public class Application
{
	public static void main(String[] args)
	{
		if(args.length == 6)
		{
			int x1 = Integer.parseInt(args[0]);
			int y1 = Integer.parseInt(args[1]);
			int x2 = Integer.parseInt(args[2]);
			int y2 = Integer.parseInt(args[3]);
			int x3 = Integer.parseInt(args[4]);
			int y3 = Integer.parseInt(args[5]);
			Point p1 = new Point(2, x1, y1);
			Point p2 = new Point(2, x2, y2);
			Point p3 = new Point(2, x3, y3);
			Triangle t = new Triangle(2, p1, p2, p3);
			System.out.println("Ist es ein Dreieck? " + t.validate());
			System.out.println("Umfang? " + t.perimeter());
		}
		else
		{
			
		}
	}
}