package chainResponsability;

public class Moeda10CentHandler implements Handler{

	private Handler handler;
	private String handlerName;
	
	
	public Moeda10CentHandler(String handlerName) {
		this.handlerName = handlerName;
	}
	
	@Override
	public void setHandler(Handler handler) {
		this.handler = handler;
		
	}

	@Override
	public void process(Moeda file) {
		System.out.println("Moeda 10 cent...");
		handler.process(file);
	}

	@Override
	public String getHandlerName() {
		return handlerName;
	}


}
