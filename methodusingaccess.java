package AllProgram;

public class methodusingaccess {
	public void display() {
		System.out.println("method using public");
	}
	public void display1(String a) {
		System.out.println("Method using public through using parameter "+a);
	}
	
	public static void main(String[] args) {
		methodusingaccess obj = new methodusingaccess();
		obj.display();//access the display method
		obj.display1("hi");//access the display1
	}
}
