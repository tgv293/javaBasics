package BTOnThi;

public class BT1{
    private static int x = 20;
    public static void main (String args[]){
        BT1.x ++;
        BT1 obj1 = new BT1();
        obj1.x --;
        BT1 obj2 = new BT1();
        obj2.x --;
        obj1 = new BT1();
        obj1.x --;
        System.out.println("x = " + x);
    }
}

