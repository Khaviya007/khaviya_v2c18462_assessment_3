//nested class

package nestedcls;
import java.io.*;
public class nstcls {
			int i=10;
		public class nstcls1{
			void fun() {
			System.out.println("The value is :"+i);
		}
		}
public static void main(String[] args) {
	nstcls a=new nstcls();
	nstcls.nstcls1 b=a.new nstcls1();
	b.fun();
	}
}

