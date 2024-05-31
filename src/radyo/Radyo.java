package radyo;

import java.text.DecimalFormat;

public class Radyo {
	private int sesDuzeyi;
	private double frekans;
	private boolean isOpen;
	private final int MAX_SES = 35;
	private final double MAX_FREKANS = 108;
	private final double MIN_FREKANS = 88;
	private RadyoIstasyonu[] istasyonlar;

	public Radyo(RadyoIstasyonu[] istasyonlar) {
		this.istasyonlar = istasyonlar;
		this.sesDuzeyi = 20;
		this.frekans = this.MIN_FREKANS;
		this.isOpen = false;
	}

	public void searchChannel(int deger, boolean durum) {
		if (!isOpen) {
			System.out.println("Önce radyoyu açmış olmak gerekir sanki!!!");

		} else {
			for (int i = 0; i < deger; i++) {
				if (durum) {
					if (this.frekans >= (this.MAX_FREKANS - 0.1)) {
						this.frekans = 88;
					}
					this.frekans += 0.1;
					if (istasyonKontrol(this.frekans)) {
						this.info(this.frekans);
						break;
					}
				} else {
					if (this.frekans <= (this.MIN_FREKANS + 0.1)) {
						this.frekans = 108;
					}
					this.frekans -= 0.1;
					if (istasyonKontrol(this.frekans)) {
						this.info(this.frekans);
						break;
					}

				}
			}
		}

	}

	public void info(double frekans) {
		RadyoIstasyonu ri = istasyonDonder(this.frekans);
		System.out.println("Çalınan Radyo: " + ri.getName() + "-" + ri.getFrekans());

	}

	public void open() {
		if (isOpen) {
			System.out.println("Açık olan bir radyoyu tekrar açmamı isteyerek nereye varmak istemektesin.");
			isOpen = false;
			System.out.println("Radyo Kapatıldı");
		} else {
			this.isOpen = true;
			System.out.println("Radyo Açıldı");
		}
	}

	public void voiceChange(boolean durum, int miktar) {
		this.isOpen = true;
		if (durum) {

			for (int i = 0; i < miktar; i++) {
				if (this.sesDuzeyi >= this.MAX_SES) {
					System.out.println("Kulak zarı sağlığı açısından sınırlandırılmış düzeye ulaştınız!!!");
					break;
				} else {
					this.sesDuzeyi++;
					System.out.println("Ses düzeyi: " + this.sesDuzeyi);
				}
			}

		} else {
			for (int i = 0; i < miktar; i++) {
				if (this.sesDuzeyi <= 0) {
					System.out.println("Kırdın kırdın daha düşük seviye yok");
					this.isOpen = false;
					break;
				} else {
					this.sesDuzeyi--;
					System.out.println("Ses düzeyi: " + this.sesDuzeyi);
				}
			}

		}
	}

	public boolean istasyonKontrol(double frekans) {
		DecimalFormat df = new DecimalFormat("0.00");
		String frek = df.format(frekans);
		for (RadyoIstasyonu istasyon : istasyonlar) {
			if (frek.equals(df.format(istasyon.getFrekans()))) {
				return true;
			}
		}
		return false;
	}

	public RadyoIstasyonu istasyonDonder(double frekans) {
		DecimalFormat df = new DecimalFormat("0.00");
		String frek = df.format(frekans);
		for (RadyoIstasyonu istasyon : istasyonlar) {
			if (frek.equals(df.format(istasyon.getFrekans()))) {
				return istasyon;
			}
		}
		return null;

	}

}
