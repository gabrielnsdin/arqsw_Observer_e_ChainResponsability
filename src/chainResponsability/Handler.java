package chainResponsability;

public interface Handler {
	
	public void setHandler(Handler handler);
	public void process(Moeda file);
	public String getHandlerName();
}