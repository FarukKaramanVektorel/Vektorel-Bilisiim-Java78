package polimorfizm.kameraman;

public class Main {
	public static void main(String[] args) {
		Lens lens=new Lens(50.5);
		Canon canon=new Canon("EOS 7D");
		Nikon nikon=new Nikon("Nikon");
		SmartPhone sp=new SmartPhone();
		Cameraman kameraci=new Cameraman("Abdulhey Çoban");
		kameraci.takeVideo(nikon);
		kameraci.takeVideo(canon);
		kameraci.takeVideo(sp);
	}

}
