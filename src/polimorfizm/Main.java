package polimorfizm;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// Encapsulation
		// Inheritance
		// Abstraction
		// Polymorphizm 
		
		Sanatci ferdiTayfur=new Sanatci("Ferdi Tayfur");
		Sanatci orhanGencebay=new Sanatci("Orhan Gencebay");
		
		Mp3 mp31=new Mp3("Tiryakinim", 220, ferdiTayfur);
		Mp3 mp32=new Mp3("İstanbul Sokakları", 245, ferdiTayfur);
		Mp3 mp33=new Mp3("Akşşam Güneşi", 223, ferdiTayfur);
		
		Mp3 mp34=new Mp3("Batsın bu dünya", 350, orhanGencebay);
		Mp3 mp35=new Mp3("Dilenci", 262, orhanGencebay);
		Mp3 mp36=new Mp3("Ayşen", 250, orhanGencebay);
		
		Mp3[] mp3s= {mp31,mp32,mp33,mp34,mp35,mp36};
		
		
		
		
		

	}

}
