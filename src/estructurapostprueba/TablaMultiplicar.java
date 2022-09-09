package estructurapostprueba;
import java.util.*;
public class TablaMultiplicar {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("¿Que tabla quieres ver?");
		byte tabla=s.nextByte();
		for(int i=0;i<13;i++) {
			System.out.println(tabla+"*"+i+"="+(tabla*i));
		}
	}
}
