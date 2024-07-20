package ObserverPattern;

public class Main {

	public static void main(String[] args) {

		YoutubeChannel channel = new YoutubeChannel();

		Subscriber aman = new Subscriber("Aman");
		Subscriber rohit = new Subscriber("Rohit");
		Subscriber Ashish = new Subscriber("Ashish");

		channel.subscribe(aman);
		channel.subscribe(rohit);

		channel.newVideoUploaded();
		System.out.println("----------------------------------------");
		
		channel.subscribe(Ashish);
		
		channel.newVideoUploaded();

	}
}
