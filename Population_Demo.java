class Population_Demo {

	public static void main(String args[]) {
		
		int n = 5;
		
		Population ob[] = new Population[n];
		
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				ob[i] = new Population(2001, 100);
			} else {
				ob[i] = new Population(ob[i-1]);
			}
		}
		
		for(int i = 0; i < n; i++) {
			ob[i].display();
		}
	
	}

}