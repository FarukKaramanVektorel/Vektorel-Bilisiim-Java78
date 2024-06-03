package ders03062024;

public class Fotographer {
	private String name;
	public Fotographer(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void takePhoto(IPhoto photo) {
		if(photo instanceof Photo) {
			Photo foto=(Photo) photo;
			System.out.println(this.name+" isimli fotoğrafçı "+foto.getMarka()+" marka makina ile çalışıyor");
		}else {
			System.out.println(this.name+" isimli fotoğrafçı çekim yapıyor");
		}
		
		photo.takePhoto();
	}

}
