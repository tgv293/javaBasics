import java.io.*;

class TestPhonebook2 {

    public static void main(String[] args) throws IOException {

        BufferedReader inKbd = new BufferedReader(new InputStreamReader(System.in));

        Phonebook2 b = new Phonebook2();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add entry");
            System.out.println("2. Find number");
            System.out.println("3. Change number");
            System.out.println("4. Delete entry");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");

            String schoice = inKbd.readLine();
            int choice = Integer.parseInt(schoice);

            switch (choice) {
                case 1:
                    System.out.print("Enter name :");
                    String name = inKbd.readLine();
                    System.out.print("enter the number: ");
                    String snumber = inKbd.readLine();
                    int number = Integer.parseInt(snumber);
                    b.setEntry(name, number);
                    break;

                case 2:
                    System.out.print("Enter name :");
                    name = inKbd.readLine();
                    number = b.getNumber(name);
                    if (number != -1)
                        System.out.println(name + "'s number is " + number);
                    else
                        System.out.println("Person " + name + " not found");
                    break;

                case 3:
                    System.out.print("Enter name :");
                    name = inKbd.readLine();
                    System.out.print("enter the new number: ");
                    snumber = inKbd.readLine();
                    int nnumber = Integer.parseInt(snumber);
                    if (b.changeNumber(name, nnumber) == 0)
                        System.out.println("Number changed");
                    else
                        System.out.println("Person " + name + " not found");
                    break;

                case 4:
                    System.out.print("Enter name :");
                    String delName = inKbd.readLine();
                    if (b.deleteEntry(delName) == 0)
                        System.out.println("Entry deleted");
                    else
                        System.out.println("Person " + delName + " not found");
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
