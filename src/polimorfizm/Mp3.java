package polimorfizm;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Mp3 {
	
	private String name;
	private double sure;
	private Sanatci sanatci;
	public Mp3(String name, double sure, Sanatci sanatci) {
		super();
		this.name = name;
		this.sure = sure;
		this.sanatci = sanatci;
	}
	public void info() {
		double dakika=this.sure/60;
		DecimalFormat dc=new DecimalFormat("0.00");
		
		System.out.println("Eser Adı: "+this.name+" Süre: "+dc.format(dakika)+" saniye");
		this.sanatci.getName();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSure() {
		return sure;
	}
	public void setSure(double sure) {
		this.sure = sure;
	}
	public Sanatci getSanatci() {
		return sanatci;
	}
	public void setSanatci(Sanatci sanatci) {
		this.sanatci = sanatci;
	}
	
	

}
