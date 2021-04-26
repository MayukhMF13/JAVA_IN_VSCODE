class Area {

	private double area;
	
	public void calculate(int l) {
		area = Math.pow(l,2);
	}
	
	public void calculate(double l, double w) {
		area = l * w;
	}
	
	public void calculate(double l) {
		area = 3.14 * Math.pow(l,2);
	}
	
	void display() {
		System.out.println("Area: " + this.area);
	}


}