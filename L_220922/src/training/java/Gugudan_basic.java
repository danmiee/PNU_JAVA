package training.java;

public class Gugudan_basic {

	public void main(String[] args) {

		int col;
		
		col=Integer.parseInt(args[0]);
		
		if (col < 1 || 9 <= col) {
			System.out.println("col is not valid!");
			return;
		}
		
		for (int i = 2; i < 10; i += col) {
			
			for (int j = 1; j < 10; j++) {
				
				for (int k = 0; k < col; k++) {
					
					if (10 <= i + k) {
						System.out.print("\n");
						break;
					}
					
					System.out.printf("%d*%d=%d", (i + k), j, (i + k) * j);
					// %d : Á¤¼ö
					if (k < col - 1)
						System.out.print("\t");
					// \t : tab
					else
						System.out.print("\n");
					// \n : new line
					
				}
				
			}
			System.out.println();
			
		}
	}
}
