public class Triangle extends Simplex
{
	public Triangle(int d, Point... points)
	{
		super(d, points);
	}
	
	public boolean validate()
	{
		for(int i = 0; i < p.length; i++)
		{
			if(p[i].dim != 2)
			{
				return false;
			}
			else
			{
				if(p.length == 3)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	//MAIN METHODE NUR ZUM TESTEN
	/*public static void main(String[] args)
	{
		Point p1 = new Point(2, 1, 2);
		Point p2 = new Point(2, 3, 4);
		Point p3 = new Point(2, 2, 3);
		Triangle t = new Triangle(2, p1,p2,p3);
		System.out.println(t.validate());
	}
	*/
}