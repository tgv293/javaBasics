public class WasedaStudent2 extends WasedaStudent {
      static int nstudents = 0;
      public static int nSt() {
       	return nstudents;
     }

     WasedaStudent2(String x, String y, int z) {
 	      super(x,y,z);
	      nstudents = nstudents +1;
     }

     public static void main(String args[]) {
     		WasedaStudent2 ws21, ws22, ws23;
     		System.out.println("nstudents = "+WasedaStudent2.nSt());
 	 	ws21 = new WasedaStudent2("st1","here",1970);
         	System.out.println("new student: "+ws21.show());
 		System.out.println("nstudents = "+WasedaStudent2.nSt());
 	 	ws22 = new WasedaStudent2("st3","there",1971);
 		System.out.println("new student: "+ws22.show());
 		System.out.println("nstudents = "+WasedaStudent2.nSt());
 	 	ws23 = new WasedaStudent2("st2","everywhere",1970);
 		System.out.println("new student: "+ws23.show());
 		System.out.println("nstudents = "+WasedaStudent2.nSt());
     } 
} 