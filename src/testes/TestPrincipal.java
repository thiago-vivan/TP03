package testes;
import controle.Principal;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class TestPrincipal {


	Principal p = new Principal();
	
	  
	
	@Test	
	void testRealizarLogin() {
	
		p.cadastraUsu("teste","senha", "nome", 0);
		
		assertTrue(p.realizarLogin("teste","senha"));
		
		assertFalse(p.realizarLogin("abacate", "banana"));
	
	
	}


	@Test
	void testVerificaTel() {
		
		
		assertTrue(p.verificaTel("8"));
		assertFalse(p.verificaTel("olaMonitor"));
	}

}
