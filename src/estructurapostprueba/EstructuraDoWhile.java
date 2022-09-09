package estructurapostprueba;

public class EstructuraDoWhile {

	public static void main(String[] args) {
		int num=5;
		System.out.println("Ciclo while");
		while(num<10) {
			num++;
			System.out.println("num="+num);
		}
		System.out.println("Ciclo Do-While");
		do{
			num++;
			System.out.println("num="+num);

		}while(num<10);
		System.out.println("Fin del programa");
	}
}
