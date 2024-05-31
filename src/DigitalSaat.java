
public class DigitalSaat extends Saat {

	private double pilDurumu;

	public DigitalSaat(double pilDurumu) {
		super();
		this.pilDurumu = pilDurumu;
	}

	public DigitalSaat() {
		this.pilDurumu = 100;
	}

	public DigitalSaat(int saat, int dakika, int saniye) {
		super(saat, dakika, saniye);
		this.pilDurumu = 100;

	}

	@Override
	public void saatGoster() {
		System.out.printf("Pil Durumu:  %f\n%d:%d:%d", this.pilDurumu, super.getSaat(), super.getDakika(),
				super.getSaniye());

	}
	@Override
	public void ilerle() {
		pilHarca();
		super.ilerle();
	}
	@Override
	public void ilerle(int saniye) {
		for(int i=0;i<saniye;i++) {
			pilHarca();
			super.ilerle();
		}
		
	}
	public void pilHarca() {
		this.pilDurumu-=0.01;
	}

}
