package ders03062024;

public class Main {
	public static void main(String[] args) {
		/*
		 * Fotoğraf alma davranışlarını belirlediğiniz bir interface
		 * Fotoğraf makinası özelliklerini belirlediğiniz bir superclass
		 * iki tane subclass
		 * bir tane kalem
		 * bir tane telefon
		 * bir tane fotoğrafçı sınıfı yapıpı bunların her biri ile fotoğraf almasını sağlayan kodu yazınız.
		 */
		
		SipsakPhoto sp=new SipsakPhoto("Nikon", "Şipşak");
		DigitalPhoto dp=new DigitalPhoto("Kodak", "Dijital", 0);
		PozluPhoto pp=new PozluPhoto("Canon", "Pozlu", 0);
		CasusKalem ck=new CasusKalem();
		Fotographer foto=new Fotographer("Polat Alemdar");
		for (int i = 0; i < 10; i++) {
			//foto.takePhoto(dp);
			//foto.takePhoto(sp);
			foto.takePhoto(ck);
		}
		//foto.takePhoto(pp);
		
	}

}
