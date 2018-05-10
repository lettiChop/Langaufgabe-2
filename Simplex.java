public abstract class Simplex
{
	int dim;
	Point[] p;
	
	public Simplex(int d, Point... points)
	{
		dim = d;
		//Dimenion muss mindestens 0 sein, sonst wird eine Exception geworfen
		if(dim < 0)
		{
			throw new IllegalArgumentException("Die Dimension muss groesser als Null sein!");
		}
		//alle Eingabewerte müssen ins Feld passen, daher muss dim mindestens genauso groß sein wie die Anzahl der Eingaben
		if(dim < p.length)
		{
			throw new IllegalArgumentException("Die Dimension ist zu klein fuer die Eingaben!");
		}
		//Feld von Objekten der Klasse Point mit der Länge dim+1 wird initialisiert
		p = new Point[dim+1];
		//Schreiben jeder Eingabe in das zuvor angelegte Feld
		for(int i = 0; i < dim+1; i++)
		{
			p[i] = points[i];
		}
	}
	
	public Point get(int i)
	{
	        //gibt den Wert der Koordinate an Stelle i des Punktes aus
		return p[i];
	}
	
	public abstract boolean validate();
	
	public double perimeter()
	{
		double leng = 0;
		//Object der Klasse EuclidDistance zur Berechnung der Seitenlänge wird erstellt
		EuclidDistance e = new EuclidDistance();
		for(int i = 0; i < p.length-1; i++)
		{ 
		        //Seitenlänge zwischen zwei jeweils Koordinaten wird berechnet
			leng += e.distance(p[i], p[i+1]);
		}
		//am Ende wird noch die Distanz zwischen der ersten und der letzten Koordinate addiert
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
