
public class Main {
	public static void main(String[] args) {
		DigitalSaat ds=new DigitalSaat(13,12,11);
		Saat s=new Saat(13,12,11);
		ds.ilerle(560);
		s.ilerle(560);
		s.saatGoster();
		ds.saatGoster();

	}
}
