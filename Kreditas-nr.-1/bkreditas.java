package kreditas;

public class bkreditas {
private double a, k, l, is, pa;
	
	public void setDuom(double a, double k, double l, double is, double pa){
		this.a=a;
		this.k=k;
		this.l=l;
		this.is=is;
		this.pa=pa;
	}
	
	public void kreditas(){
		double Vimk, Ksum;
		if(is<5000)
			if(pa<=50)
				{
				Ksum=kreditosuma(k,l);
				Vimk=imokosAp(Ksum, l);
				if(((Vimk/a)*100)<=40)
					System.out.println("Kreditą suteikti galima!" + " " + "Viso gražinti reikės: " + Ksum + " " + "Menėsinė įmoka bus: " + Vimk);
				else System.out.println("Kredito suteikti negalime! ");
				}else System.out.println("Kredito suteikti negalime! Pastatas Persenas!");
				else System.out.println("Kredito suteikti negalime! Jūsų įsiskolinimai per dideli");	
	}
	private double kreditosuma(double k, double l){
		double p=0.04;
		return k+(k*l*p);
	}
	private double imokosAp(double K, double l){
		return k/(l*12);
	}
}
