public class Overriding {
    public static void main(String[] args) {
        A_Overriding a = new A_Overriding();
        a.p(10);
    }
}

class B_Overriding {
    public void p(int i) {
    }
}

class A_Overriding extends B_Overriding {
    //This method overrides the method in B
    public void p(int i) {
        System.out.println(i);
    }
}