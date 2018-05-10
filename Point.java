public class Point
{
	//Attribute für Dimension und Koordinaten des Punktes
	int dim;
	double[] val;
	
	public Point(int d, double... values)
	{	
		dim = d;
		//Dimenion muss mindestens 0 sein, sonst wird eine Exception geworfen
		if(dim < 0)
		{
			throw new IllegalArgumentException("Die Dimension muss groesser als Null sein!");
		}
		//alle Eingabewerte müssen ins Feld passen, daher muss dim mindestens genauso groß sein wie die Anzahl der Eingaben
		if(dim < values.length)
		{
			throw new IllegalArgumentException("Die Dimension ist zu klein fuer die Eingaben!");
		}
		//Attribut wird mit der Dimension als Feldgröße initialisiert
		val = new double[d];
		//Schreiben jede Eingabe in das zuvor angelegte Feld
		for(int i = 0; i < d; i++)
		{
			val[i] = values[i];
		}
		
		//AUSGABE ZUM TESTEN
		for(double i : val)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public double get(int i)
	{
		//gibt den Wert der Koordinate an Stelle i des Punktes aus
		return val[i];
	}
	
	public int dim()
	{
		//gibt den Wert der Dimension zurück
		return dim;
	}
	
	//MAIN METHODE ZUM TESTEN
	public static void main(String[] args)
	{
		Point p = new Point(2, 3, 4);
		System.out.println(p.get(1));
		System.out.println(p.dim());
	}
}