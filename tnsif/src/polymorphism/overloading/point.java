package polymorphism.overloading;

public class point {
	private float x;
	private float y;
	
	public point() {
		x=0.0f;
		y=0.0f;
	}
	public point(float x,float y) {
		this.x=x;
		this.y=y;
	}
	public point(float x) {
		this.x=x;
		this.y=x;
	}
	
	@Override
	public String toString() {
		return "point[x="+x+",y="+y+"]";
	}

}
