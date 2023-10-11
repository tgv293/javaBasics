public class Overloading{
	public static void main(String[] args){
		A_Overloading a = new A_Overloading();
		a.p(10);
		//a.p(10.0);
	}
}

class B_Overloading{
	public void p (int i){}
}
class A_Overloading extends B_Overloading{
	//This method overloads the method in B
	public void p (double i){
		System.out.println(i);
	}
}