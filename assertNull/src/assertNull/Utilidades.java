package assertNull;

import java.util.*;
public class Utilidades {
	
	private List<Persona> personas;
	
	public Utilidades() {
	 personas = new ArrayList<Persona>();
	 personas.add(new Persona("Yeyson","Quiñones"));
	 personas.add(new Persona("Manuel","Alejandro"));
	 personas.add(new Persona("Andres","CAicedo"));
	 
	}
	
	public Persona validatedNull(String nombre) {
	 Persona  p= null;
	 
	 for(Persona persona:personas) {
		 if(persona.getNombre().equalsIgnoreCase(nombre) ) {
		   p = persona; 
		 }
		 
	 }
	 			 
	 return p;	 
		
	}
	
	

}
