package ders03062024;

public class CasusKalem implements IPhoto{
	private int hafiza=8;
	private int durum=0;

	@Override
	public void takePhoto() {
		if(hafiza<=durum) {
			System.out.println("Hafıza doldu be hafız!!!");
		}else {
			System.out.println("Casus kalem ile çekim yapıldı");
			this.output();
		}
		
	}

	@Override
	public void output() {
		
		durum++;
		System.out.println("Hafızaya kaydedildi, Kalan hafıza: "+(hafiza-durum));
	}

}
