package assertNull;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class UtilidadesTest {
     
	Utilidades utils;
	@Before
	public void setUp() throws Exception {
		utils = new Utilidades();
	}

	@Test
	public void testValidatedNull() throws Exception {
		
		Persona personaA= utils.validatedNull("Yeyson");
		Persona personaB= utils.validatedNull("Camilo");
		
		Assert.assertNotNull(personaA);
		
		Assert.assertNull(personaB);
		
		
	}

}
