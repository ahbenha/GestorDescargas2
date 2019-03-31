package es.ifp.gestordescargas.model;

import java.net.URL;

public class Descarga 
{
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
