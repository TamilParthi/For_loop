package sample;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=0;i<5;i++) {
			for(int j=1;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
