public class TestClockS {
	public static void main(String[] args) {
		Console c = new Console();

		c.println("Creating a new clock");
		ClockS a = new ClockS();

		c.print("Please enter new hours: ");
		int h = c.readInt();;

		c.print("Please enter new minutes: ");
		int m = c.readInt();;

		c.print("Please enter new seconds: ");
		int s = c.readInt();;

		a.setTime(h, m, s);
		c.println("The time is now " + a.getTime());

		c.print("Enter seconds to add: ");
		int adds = c.readInt();;
		a.addSeconds(adds);

		c.println("The new time is now " + a.getTime());
		c.println("The total number of seconds is " + a.totalSeconds());
	}
}
