package sample;

public class Instance_block {
	static int a=1;
	char c='a';
	
	static {
		System.out.println("static block");//1
		Instance_block ref= new Instance_block();
		System.out.println(a);//4
		a=5;
	}
	{
		System.out.println("Instance block");//2//9
		System.out.println(c);//3//10
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main starts");//7
		System.out.println(a);//8
		Instance_block ref1= new Instance_block();
		System.out.println("Main Ends");//11
		

	}
	static {
		System.out.println(" static block 1");//5
		System.out.println("static");//6
	}

}
