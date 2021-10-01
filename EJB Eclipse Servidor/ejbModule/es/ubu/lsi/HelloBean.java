package es.ubu.lsi;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloBean.
 * 
 * @author Ra�l Marticorena
 */
@Stateless
@LocalBean
public class HelloBean implements HelloBeanRemote {

    /**
     * Default constructor. 
     */
    public HelloBean() {
        // TODO Auto-generated constructor stub
    }
    
	public String hello() {
		return "hello";
	}

}
