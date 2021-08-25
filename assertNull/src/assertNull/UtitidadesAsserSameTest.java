package assertNull;

import org.junit.Assert;
import org.hamcrest.core.*; 

import org.junit.Before;
import org.junit.Test;

public class UtitidadesAsserSameTest {
     
	private UtitidadesAsserSame  utils;
	
	@Before
	public void setUp() throws Exception {
		utils = new UtitidadesAsserSame();
	}

	@Test
	public void testGetPersona() throws Exception {
		Persona miPersona = new Persona("Yeyson","Quiñones");
		 
		//Assert.fail("la operacion ha fallado");
		
		Persona persona= utils.getPersona(miPersona);
		
		Assert.assertSame(miPersona, persona);
		Assert.assertEquals(miPersona,persona);
		
		
		
	}
	
	@Test
	public void testPersonaNotSame() throws Exception {
		Persona miPersona = new Persona("Camilo","Cuastumal");
		
		Persona persona= utils.getPersona(miPersona);
		
		Assert.assertNotSame(miPersona, persona);
		Assert.assertNotEquals(miPersona,persona);
		
	}
	
	@Test
	public void testGetPersonaNotSame2() throws Exception {
		Persona miPersona = new Persona("Evenly","Tenorio");
		
		Persona persona = utils.getPersona(miPersona);
		
		Assert.assertNotSame(miPersona, persona);
		Assert.assertEquals(miPersona,persona);
		
	}
	
	
	@Test
	public void testSaludo() {
		String saludo = "saludo";
		
		//Assert.assertThat(saludo, Matchers.equalsTo(saludo));
	
	}

}
