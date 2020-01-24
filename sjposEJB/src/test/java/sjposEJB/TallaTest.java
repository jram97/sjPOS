package sjposEJB;

import static org.junit.jupiter.api.Assertions.*;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sv.com.stjacks.sjpos.ejb3.TallaBean;
import sv.com.stjacks.sjpos.ejb3.TallaBeanLocal;

class TallaTest {

	TallaBean talla = new TallaBean();
//	 private Context  ctx;
//     private EJBContainer ejbContainer;;
//    
//     @BeforeAll
//     public  void setUp() {
//         ejbContainer = EJBContainer.createEJBContainer();
//         System.out.println("Opening the container" );
//         ctx = ejbContainer.getContext();
//     }
//     
	@Test
	void test() throws NamingException {
		System.out.println("Prueba iniciada");
		assertNotNull(talla.findAll());
		
//		TallaBean converter = (TallaBean) ctx.lookup("java:global/classes/TallaBean");
//        assertNotNull(converter);
	}

}
