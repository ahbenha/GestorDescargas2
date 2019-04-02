package es.ifp.gestordescargas.model;

import java.net.URL;

public class Descarga 
{

    static void cancelado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	private URL url;
	private Estado estado;
	
	public Descarga(URL url) 
	{
		this.url = url;
	}

	public enum Estado
	{
		NO_ICIADO,
		INICIADO,
		CANCELADO
	}
}
