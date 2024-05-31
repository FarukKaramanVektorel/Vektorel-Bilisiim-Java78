
public class Saat {

	private int saat;
	private int dakika;
	private int saniye;

	public Saat() {
		this.saat = 0;
		this.dakika = 0;
		this.saniye = 1;
	}

	public Saat(int saat, int dakika, int saniye) {
		this.saat = saat;
		this.dakika = dakika;
		this.saniye = saniye;
	}

	public void ilerle() {
		if (this.saniye < 59) {
			this.saniye++;
		} else {
			this.saniye = 0;
			if (this.dakika < 59) {
				this.dakika++;
			} else {
				this.dakika = 0;
				if (this.saat < 23) {
					this.saat++;
				} else {
					this.saat = 0;
				}
			}
		}
	}
	

	public void ilerle(int saniye) {
		for (int i = 0; i < saniye; i++) {
			this.ilerle();
		}
	}
	
	public void saatGoster() {
		System.out.println("Saat: "+this.saat+":"+this.dakika);
	}

	public int getSaat() {
		return saat;
	}

	public void setSaat(int saat) {
		this.saat = saat;
	}

	public int getDakika() {
		return dakika;
	}

	public void setDakika(int dakika) {
		this.dakika = dakika;
	}

	public int getSaniye() {
		return saniye;
	}

	public void setSaniye(int saniye) {
		this.saniye = saniye;
	}

}
