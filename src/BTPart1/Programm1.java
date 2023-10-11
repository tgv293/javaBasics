public class Programm1 {
	public static void main(String args[]) {
		Console con = new Console();
		con.print("Hello, input a number : ");
		int yourNumber;
		yourNumber = con.readInt();
		con.print("My number is ");
		con.print(yourNumber + 1);
		con.println("So I win this time !");
	}
}
