package linecomparison;

public class LinecomparisonUc3 {
	double distancecal(int x1 , int y1 , int x2 , int y2)
	{
		double distance;
		distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		return distance;
	}
	public static void main(String[] args) {
		LinecomparisonUc3 obj = new LinecomparisonUc3();
		double line1 = obj.distancecal(1,6,1,9);
		double line2 = obj.distancecal(6,1,8,1);
		if(Double.compare(line1,line2)==0)
		{
			System.out.println("line1 and line 2 are equal");
		}
		else if(Double.compare(line1,line2) < 0)
		{
			System.out.println("line1 is less than line2");
		}
		else
			System.out.println("line1 is greater than line2");
	}
	

}
