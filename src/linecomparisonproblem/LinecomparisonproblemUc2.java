package linecomparisonproblem;

public class LinecomparisonproblemUc2 {
	double distancecal(int x1 , int y1 , int x2 , int y2)
	{
		double distance;
		distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		return distance;
	}
	public static void main(String[] args) {
		LinecomparisonproblemUc2 obj = new LinecomparisonproblemUc2();
		Double line1 = obj.distancecal(1,1,1,1);
		Double line2 = obj.distancecal(1,2,3,4);
		System.out.println("Distance" +line1);
		System.out.println("Distance" +line2);
		System.out.println("line 1 and line 2 are equal.True or False :" +line1.equals(line2));
	}


}
