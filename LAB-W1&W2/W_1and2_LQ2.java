
public class W_1and2_LQ2 {

	public static void main(String[] args) {
	MyPoint point =new MyPoint();
	//MyPoint point2 =new MyPoint();
	point.distance(50, 30.85);
	
	
	
	}
	
	public static class  MyPoint{
		double X;
		double Y;
		public double getX() {
			return X;
		}
		public void setX(double x) {
			X = x;
		}
		public double getY() {
			return Y;
		}
		public void setY(double y) {
			Y = y;
		}
		public MyPoint() {
			
			X = 0;
			Y = 0;
		}
		public MyPoint(double X,double Y) {
			this.X=X;
			this.Y=Y;
		}
		
		public void  distance(double X, double Y) {
			double x2=X-this.X;
			double y2=Y-this.Y;
			double distance = Math.sqrt((x2*x2)+(y2*y2));
			 System.out.println("Distance: " + distance);
		}
		
	}
	
	

}
