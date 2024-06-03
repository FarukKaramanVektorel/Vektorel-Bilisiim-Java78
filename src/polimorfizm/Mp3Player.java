package polimorfizm;

public abstract class Mp3Player implements IMp3Player{
	private String marka;
	private int kapasite;
	private Mp3[] mp3s;
	public Mp3Player(String marka, int kapasite, Mp3[] mp3s) {
		super();
		this.marka = marka;
		this.kapasite = kapasite;
		
		if(kapasite<mp3s.length) {
			System.out.println("Bellek aşımı, Belleği yükselt yada müziği azalt");
		}else {
			this.mp3s = mp3s;
		}
		
	}
	public void play() throws InterruptedException{
		System.out.println("IPOD müzik listesini çalıyor...");
		for (Mp3 mp3 : mp3s) {
			mp3.info();
			Thread.sleep(1000);
			mp3.info();
			Thread.sleep(1000);
			mp3.info();		
			
			Thread.sleep(1000);
			
		}
		System.out.println("Müzik listesi bitti...");
		
	}
	public void play(Mp3[] mp3s) throws InterruptedException {
		if(this.kapasite<mp3s.length) {
			System.out.println("Bellek aşımı");
		}else {
			this.mp3s=mp3s;
			this.play();
		}
	}
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public int getKapasite() {
		return kapasite;
	}
	public void setKapasite(int kapasite) {
		this.kapasite = kapasite;
	}
	public Mp3[] getMp3s() {
		return mp3s;
	}
	public void setMp3s(Mp3[] mp3s) {
		if(this.kapasite<mp3s.length) {
			System.out.println("Bellek aşımı");
		}else{
			this.mp3s = mp3s;
		}
		
	}
	
	

}
