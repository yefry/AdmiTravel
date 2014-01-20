package co.edu.udea.ingenieriaweb.admitravel.util.exception;

import org.apache.log4j.Logger;

/**
 * Excepción propia del sistema para las excepciones en la capa de acceso a datos
 * @author Elver Suarez Alzate
 *
 */
public class IWDaoException extends Exception {

	Logger log = Logger.getLogger(IWDaoException.class);
	
	public IWDaoException() {
		super();
		log.error(this.getMessage(), this);
	}

	public IWDaoException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		log.error(arg0, arg1);
	}

	public IWDaoException(String arg0) {
		super(arg0);
		log.error(arg0, this);
	}

	public IWDaoException(Throwable arg0) {
		super(arg0);
		log.error(arg0.getMessage(), arg0);
	}
}
