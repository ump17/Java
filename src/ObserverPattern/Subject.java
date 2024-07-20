package ObserverPattern;

public interface Subject {
	
	void subscribe(Observer ob);
	void unsubscribe(Observer ob);
	
	//This will notify the Observer/Subscriber
	void newVideoUploaded();

}
