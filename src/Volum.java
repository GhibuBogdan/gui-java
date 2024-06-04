
public class Volum {
	int r;
	int h;
	public Volum(int r, int h) {
		super();
		this.r = r;
		this.h = h;
	}
@Override
public String toString() {
	return Integer.toString(r)+" "+ Integer.toString(h);
}
	
public double CalculVolum() {
	return 3.14*r*r*h;
}

}
