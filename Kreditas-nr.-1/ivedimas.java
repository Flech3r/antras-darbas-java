package kreditas;

import java.util.Scanner;

public class ivedimas {
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		vkreditas VartClass = new vkreditas();
		bkreditas BustClass = new bkreditas();
		double Pajamos, PajamosB, skolos, Ksuma; // ivedimo
		int variantas, Svaiku, pam, laik;// ivedimo
		
		int sumavaik = 100;
		System.out.println(" ");
		System.out.println("Pasirinkite kreditą: "
				+ "Būsto Kreditas - 1" + " "
				+ "Vartojamasis Kreditas - 2");
		variantas = scan.nextInt();
		
		
		if(variantas <= 2){ 
			if (variantas==2){
				System.out.println("Įveskite vaikų skaičiu nuo 0 iki 10 :");
				Svaiku = scan.nextInt();
				System.out.println("Įveskite pajamas atskaičiavus mokesčius:");
				Pajamos = scan.nextDouble();
				System.out.println("Įveskite įsiskolinimų skaičių:");
				skolos = scan.nextDouble();
				System.out.println("Įveskite kredito laikotarpi iki 5 metų:");
				laik = scan.nextInt();
				System.out.println("Įveskite kredito suma nuo 300 Eu iki 26000 Eu: ");
				Ksuma = scan.nextDouble();
				PajamosB=Pajamos-skolos-(Svaiku*sumavaik);
				VartClass.setDuom(PajamosB, Ksuma, laik, laik);
				VartClass.kreditas();
				}
			else {	
				System.out.println("Įveskite vaikų skaiciu nuo 0 iki 10 :");
				Svaiku = scan.nextInt();
				System.out.println("Įveskite pajamas atskaičiavus mokesčius:");
				Pajamos = scan.nextDouble();
				System.out.println("Įveskite įsiskolinimų skaičių: ");
				skolos = scan.nextDouble();
				System.out.println("Įveskite pastato amžių: ");
				pam = scan.nextInt();
				System.out.println("Įveskite kredito laikotarpį: ");
				laik = scan.nextInt();
				System.out.println("įveskite kredito sumą: ");
				Ksuma = scan.nextDouble();
				PajamosB=Pajamos-skolos-(Svaiku*sumavaik);
				BustClass.setDuom(PajamosB, Ksuma, laik, skolos, pam);
				BustClass.kreditas();
			}
		}
		else System.out.println("Neteisingas parinktas parametras!");
	
	}
}
		

	


