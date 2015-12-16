package kreditas;

public class vkreditas {
	private double a, k, l, is;
	
	public void setDuom(double a, double k, double l, double is){
		this.a=a;
		this.k=k;
		this.l=l;
		this.is=is;
	}
	
	public void kreditas(){
		
		double Vimk, Ksum; //papildomi kintamieji, taip pat palukanu norma
		
		if(is<15000)
			if (k>=300&&k<=260000)
				if(l<=5)
				{		Ksum=kreditosuma(k,l);
						Vimk=imokosAp(Ksum, l);
						if(((Vimk/a)*100)<=40)
							System.out.println("Kreditą suteikti galima!" + " "
									+ "Viso gražinti reikės: " + Ksum + " " 
									+ "Menėsine įmoka bus: " + Vimk);
							else System.out.println("Kredito suteikti negalime! ");}
						else System.out.println("Kredito suteikti negalime! Perilgas terminas!");
				else System.out.println("Kredito suteikti negalime! Prašoma suma yra permaža arba per didelė!");
		else System.out.println("Kredito suteikti negalime! Jusu įsiskolinimai per dideli");	
		
	}
	private double kreditosuma(double k, double l){
		double p=0.04; //metine palukanu norma 4%
		return k+(k*l*p);
	}
	private double imokosAp(double K, double l){
		return k/(l*12); // imokos apskaiciavimas
	}
}

