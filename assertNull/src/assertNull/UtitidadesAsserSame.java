package assertNull;

import java.util.*;

public class UtitidadesAsserSame {
	
	private List<Persona> personas;
	
	public UtitidadesAsserSame() {
		personas = new ArrayList<Persona>();
		
		personas.add(new Persona("Yeyson","Quiñones"));
		personas.add(new Persona("Andres","Uribe"));
		
	}
	
	
	public Persona getPersona(Persona persona) {
		
		if(personas.contains(persona)) {
			return persona;
		}else {
			return new Persona("Evenly","Tenorio");
		}
		
	}
	
	public String getSaludo() {
		
		return "Hola mundo";
	}
	

}
