import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prog51 {
	public Scanner t = new Scanner (System.in);
	public Pattern pat;
	public Matcher mat;
	public String dni,tlf;
	
	
	
	public Prog51() {
		int opcion;
		do {
			System.out.println("1-2,0-salir");
			opcion=Integer.parseInt(t.nextLine());
			switch(opcion) {
				case 1:
					DNI();
					break;
				case 2:
					tlfn();
					break;
				default:
					System.out.println("Error");
			}
		}while(opcion!=0);
	}
	
	public void DNI() {
		pat=Pattern.compile("[0-9]{8}[A-Z]{1}");
		System.out.println("Introduce el DNI");
		dni=t.nextLine();
		mat=pat.matcher(dni);
		if(mat.matches()) {
			System.out.println("El dni es correcto");
		}else {
			System.out.println("Error de DNI");
		}
	}
	
	public void tlfn() {
		pat=Pattern.compile("[0-9]{9}");
		System.out.println("Introduce el tlf");
		tlf=t.nextLine();
		mat=pat.matcher(tlf);
		if(mat.matches()) {
			System.out.println("El tlf es correcto");
		}else {
			System.out.println("Error de tlf");
		}
	}

	public static void main(String[] args) {
		Prog51 prog = new Prog51();

	}

}
