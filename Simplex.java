public abstract class Simplex
{
	int dim;
	Point[] p;
	
	public Simplex(int d, Point... points)
	{
		dim = d;
		p = new Point[dim+1];
		for(int i = 0; i < points.length; i++)
		{
			p[i] = points[i];
		}
	}
	
	public Point get(int i)
	{
		return p[i];
	}
	
	public abstract boolean validate();
	
	public double perimeter()
	{
		double leng = 0;
		EuclidDistance e = new EuclidDistance();
		for(int i = 0; i < p.length-1; i++)
		{
			leng += e.distance(p[i], p[i+1]);
		}
		leng += e.distance(p[0], p[p.length-1]);
		return leng;
	}
	
	
	//MAIN METHODE NUR ZUM TESTEN
	/*
	public static void main(String[] args)
	{
		Point p1 = new Point(3, 1, 2, 3);
		Point p2 = new Point(3, 3, 4, 5);
		Point p3 = new Point(3, 2, 3, 6);
		Simplex s = new Simplex(1, p1, p2);
		s.get(0).show();
		System.out.println("\n" + "Summe der Seitenlaengen: " + s.perimeter());
	}
	*/
}