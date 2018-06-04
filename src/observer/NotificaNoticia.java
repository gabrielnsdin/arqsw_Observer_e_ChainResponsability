package observer;

public class NotificaNoticia implements ConsomeNoticia{

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topica) {
		System.out.println("...");
	}

}
