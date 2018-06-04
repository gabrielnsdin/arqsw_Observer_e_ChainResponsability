package chainResponsability;


public class Moeda1realHandler implements Handler{

	private Handler handler;
	private String handlerName;
	
	
	public Moeda1realHandler(String handlerName) {
		this.handlerName = handlerName;
	}
	
	@Override
	public void setHandler(Handler handler) {
		this.handler = handler;
		
	}

	@Override
	public void process(Moeda file) {
		System.out.println("Moeda 1 real...");
		handler.process(file);
	}

	@Override
	public String getHandlerName() {
		return handlerName;
	}

}
