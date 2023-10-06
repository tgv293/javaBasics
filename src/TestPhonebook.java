import java.io.*;
import java.util.Hashtable;

class TestPhonebook {
    /*public static void main(String args[]) throws IOException {
        BufferedReader inKbd = new BufferedReader(new InputStreamReader(System.in));
        String inputLine;
        System.out.println("creating a Phonebook");
        Phonebook b = new Phonebook(4);
        boolean exit = false;
        while (exit == false) {
            System.out.println("Enter what do you want to do:");
            System.out.println("1- new entry   2- search number" +
                    "  3- change number 4-delete 0- end");
            inputLine = inKbd.readLine();
            int x = Integer.parseInt(inputLine);
            switch (x) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    System.out.print("enter the name : ");
                    String name = inKbd.readLine();
                    System.out.print("enter the number: ");
                    String snumber = inKbd.readLine();
                    int nnumber = Integer.parseInt(snumber);
                    b.setEntry(name, nnumber);
                    break;
                case 2:
                    System.out.print("enter the name : ");
                    inputLine = inKbd.readLine();
                    int num = b.getNumber(inputLine);
                    if (num == -1)
                        System.out.println("not found");
                    else
                        System.out.println("The number is " + num);
                    break;
                case 3:
                    System.out.print("Enter name :");
                    name = inKbd.readLine();
                    System.out.print("enter the new number: ");
                    snumber = inKbd.readLine();
                    nnumber = Integer.parseInt(snumber);
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
                default:
                    System.out.println("Not a valid number!");
            }
        }
    }*/
    public static void main(String[] args) throws IOException {

        BufferedReader inKbd = new BufferedReader(new InputStreamReader(System.in));

        Hashtable<String, Integer> b = new Hashtable<String, Integer>();

        while(true){
            System.out.println("Menu:");
            System.out.println("1. Add entry");
            System.out.println("2. Find number");
            System.out.println("3. Change number");
            System.out.println("4. Delete entry");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");

            String schoice = inKbd.readLine();
            int choice = Integer.parseInt( schoice );

            switch(choice){
                case 1:
                    System.out.print("Enter name :");
                    String name = inKbd.readLine();
                    System.out.print("enter the number: ");
                    String snumber = inKbd.readLine();
                    int number = Integer.parseInt( snumber );
                    b.put(name, number);
                    break;

                case 2:
                    System.out.print("Enter name :");
                    name = inKbd.readLine();
                    Integer num = b.get(name);
                    if(num != null)
                        System.out.println(name+"'s number is "+num);
                    else
                        System.out.println("Person "+name+" not found");
                    break;

                case 3:
                    System.out.print("Enter name :");
                    name = inKbd.readLine();
                    System.out.print("enter the new number: ");
                    snumber = inKbd.readLine();
                    int nnumber = Integer.parseInt( snumber );
                    if(b.containsKey(name)){
                        b.put(name, nnumber);
                        System.out.println("Number changed");
                    } else {
                        System.out.println("Person "+name+" not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter name :");
                    String delName = inKbd.readLine();
                    if(b.containsKey(delName)){
                        b.remove(delName);
                        System.out.println("Entry deleted");
                    } else {
                        System.out.println("Person "+delName+" not found");
                    }
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
