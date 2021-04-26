class Population {

	int year;
	int count;
	
	
	Population(int y, int c) {	
		this.year = y;
		this.count = c;
	}
	
	Population(Population ob) {	
		this.year = (ob.year + 1);
		this.count = (ob.count + 1);	
	}
	
	void display() {
		System.out.println("Year: " + this.year + "  Population: " + this.count);
	}


}