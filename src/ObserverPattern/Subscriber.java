package ObserverPattern;

public class Subscriber implements Observer{
	
	private String name;
	
	
	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void notified() {
		System.out.println("Hi "+ this.name +", - New video uploaded");
	}

}
