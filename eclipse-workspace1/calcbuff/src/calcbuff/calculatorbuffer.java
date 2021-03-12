//Use stringbuffer,string program,stringrevse,substring,append

package calcbuff;
import java.util.Scanner;
public class calculatorbuffer {

	public static void main(String[] args) {
StringBuffer str=new StringBuffer("Khaviya");
String str1="Sheela";
Scanner sc = new Scanner(System.in);
System.out.println("Enter option: ");
int op = sc.nextInt();

switch(op)
{
case 1:
	StringBuffer m=new StringBuffer(str.reverse());
	System.out.println("String is: "+m);
    break;

case 2:
	StringBuffer k=new StringBuffer(str1.substring(3));
    System.out.println("String is: "+k);
    break;

case 3:
	StringBuffer h=new StringBuffer(str.append(" Rajendran"));
    System.out.println("String is: "+h);
    break;
default:
	System.out.println("Error");
}
	}

}
