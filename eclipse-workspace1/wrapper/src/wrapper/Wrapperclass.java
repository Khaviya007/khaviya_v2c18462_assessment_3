//wrapper class-autoboxing,unboxing,bigdecimal

package wrapper;
import java.math.*; 
public class Wrapperclass {

	public static void main(String[] args) {
Integer i = new Integer(10);//autoboxing
System.out.println("i value is :" +i);
BigDecimal k=new BigDecimal(2045235435.7869354645645);
System.out.println("k value is :" +k);
int j;
j=i.intValue();//unboxing
System.out.println("j value is : "+j);
	}

}
