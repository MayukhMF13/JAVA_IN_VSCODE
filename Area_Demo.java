class Area_Demo {

	public static void main(String args[]) {
		
		Area square = new Area();
		square.calculate(4);
		square.display();
		
		Area rect = new Area();
		rect.calculate(6.7, 4.8);
		rect.display();
		
		Area circle = new Area();
		circle.calculate(8.2);
		circle.display();
		
	
	}

}