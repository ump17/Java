package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

//This is our subject
public class YoutubeChannel implements Subject{
	
	private List<Observer> subscribers = new ArrayList<>();

	@Override
	public void subscribe(Observer ob) {
		this.subscribers.add(ob);
		
	}

	@Override
	public void unsubscribe(Observer ob) {
		this.subscribers.remove(ob);
		
	}

	@Override
	public void newVideoUploaded() {
		//Only once call this method, and it will notify all the subscribers
		for(Observer ob: this.subscribers) {
			ob.notified();
		}
		
	}

}
