public class Application
{
	public static void main(String[] args)
	{
		try
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
			else if(args.length == 0)
			{
				int rx1 = (int) (Math.random() * (1000 - (-1000)) + (-1000));
				int ry1 = (int) (Math.random() * (1000 - (-1000)) + (-1000));
				int rx2 = (int) (Math.random() * (1000 - (-1000)) + (-1000));
				int ry2 = (int) (Math.random() * (1000 - (-1000)) + (-1000));
				int rx3 = (int) (Math.random() * (1000 - (-1000)) + (-1000));
				int ry3 = (int) (Math.random() * (1000 - (-1000)) + (-1000));
				Point rp1 = new Point(2, rx1, ry1);
				Point rp2 = new Point(2, rx2, ry2);
				Point rp3 = new Point(2, rx3, ry3);
				Triangle rt = new Triangle(2, rp1, rp2, rp3);
				System.out.println("Ist es ein Dreieck? " + rt.validate());
				System.out.println("Umfang? " + rt.perimeter());
				
			}
			else
			{
				System.out.println("Bitte entweder genau sechs oder keinen Parameter eingeben.");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Fehler! Bitte nur Zahlen eingeben!");
		}
	}
}