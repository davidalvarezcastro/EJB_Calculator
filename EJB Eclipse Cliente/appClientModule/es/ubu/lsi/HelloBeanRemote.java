package es.ubu.lsi;

import javax.ejb.Remote;

/**
 * Remote interface.
 * 
 * @author Ra�l Marticorena
 *
 */
@Remote
public interface HelloBeanRemote {

	/** 
	 * Say hello. 
	 * 
	 * @return text
	 */
	public String hello();
}
