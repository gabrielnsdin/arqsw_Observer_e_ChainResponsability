package chainResponsability;

public class Moeda25CentHandler implements Handler{

	private Handler handler;
	private String handlerName;
	
	
	public Moeda25CentHandler(String handlerName) {
		this.handlerName = handlerName;
	}
	
	@Override
	public void setHandler(Handler handler) {
		this.handler = handler;
		
	}

	@Override
	public void process(Moeda file) {
		System.out.println("Moeda 25 cent...");
		handler.process(file);
	}

	@Override
	public String getHandlerName() {
		return handlerName;
	}

}
