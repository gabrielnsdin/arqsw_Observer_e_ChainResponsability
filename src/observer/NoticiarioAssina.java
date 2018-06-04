package observer;

public class NoticiarioAssina extends Noticiario{

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topica) {
		System.out.println("...");
		NotificaNoticia a = new NotificaNoticia();
		a.notificaNoticia(textoNoticia, dia, mes, topica);
	}

}
