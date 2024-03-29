package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{

	private String ip;
	private String data;
	private List<String> domain = new ArrayList<>();
	
	

	public List<String> getDomain() {
		return domain;
	}

	public void setDomain(List<String> domain) {
		this.domain = domain;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void loadVeryImpData() {
		// Suppose it is taking alot of time
		this.data = "This is imp data";
		
		this.domain.add("Goog.com");
		this.domain.add("meta.com");
	}

	

	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", data=" + data + ", domain=" + domain + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp(this.getIp());
		networkConnection.setData(this.getData());
		
		for(String d: this.getDomain()) {
			networkConnection.getDomain().add(d);
		}
		
		
		return networkConnection;
	}
	
	

}
