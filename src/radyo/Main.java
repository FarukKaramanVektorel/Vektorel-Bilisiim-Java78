package radyo;

public class Main {

	public static void main(String[] args) {
		RadyoIstasyonu ri=new RadyoIstasyonu("Ostim Radyo", 106);
		RadyoIstasyonu ri1=new RadyoIstasyonu("Alem Fm", 106.6);
		RadyoIstasyonu ri2=new RadyoIstasyonu("Radyo Nostalji", 88.9);
		RadyoIstasyonu ri3=new RadyoIstasyonu("Radyo Etimesgut", 100.6);
		RadyoIstasyonu ri4=new RadyoIstasyonu("Sincan FM", 101.2);
		RadyoIstasyonu ri5=new RadyoIstasyonu("Show Radyo", 98.8);
		RadyoIstasyonu ri6=new RadyoIstasyonu("Radyo D", 104);
		RadyoIstasyonu ri7=new RadyoIstasyonu("Radyo Trafik", 88);
		RadyoIstasyonu[] radyolar= {ri,ri1,ri2,ri3,ri4,ri5,ri6,ri7};
		Radyo r=new Radyo(radyolar);
		r.searchChannel(201, true);
//		r.open();
//		r.open();
//		r.open();
//		r.searchChannel(201, true);
//		r.searchChannel(201, true);
//		r.searchChannel(201, true);
//		r.searchChannel(201, true);
//		r.searchChannel(201, true);
//		r.searchChannel(201, true);
//		r.searchChannel(201, true);
//		r.searchChannel(201, true);
//		r.searchChannel(201, true);
//		r.searchChannel(201, true);
		//r.voiceChange(false, 25);
	}

}
