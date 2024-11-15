package AllProgram;

public class MethodParameter {
	static void method(String name,int z)
	{
		System.out.println(name+ " " +z);
	}
	
	static int method(int b) {
		System.out.println("my value is ");
		return b=20;
	}

	
	public static void main(String[] args) {
		method("teddy",3);
		method("pinky",4);
		method("jiggu",5);
		
	}
}
