public abstract class Simplex
{
	int dim;
	Point[] p;
	
	public Simplex(int d, Point... points)
	{
		dim = d;
		p = new Point[dim+1];
		for(int i = 0; i < dim+1; i++)
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
		double temp = 0;
		double leng = 0;
		for(int i = 0; i < dim; i++)
		{
			temp = 0;
			for(int j = 0; j < p[i].dim; j++)
			{
				temp += Math.pow(p[i+1].get(j) - p[i].get(j), 2);
			}
			leng += Math.sqrt(temp);
		}
		return leng;
	}
	
	
	//MAIN METHODE ZUM TESTEN
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