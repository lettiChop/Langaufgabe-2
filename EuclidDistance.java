public class EuclidDistance implements Distance
{
	public double distance(Point p1, Point p2)
	{
		double temp = 0;
		double leng = 0;
		for(int i = 0; i < p1.dim; i++)
		{
			temp = 0;
			for(int j = 0; j < p1.dim; j++)
			{
				temp += Math.pow(p2.get(j) - p1.get(j), 2);
			}
			leng = Math.sqrt(temp);
		}
		return leng;
	}
}