
public class Persona {
	String nombre;
	int edad;
	
	Persona(String nombre){
		this.nombre=nombre;
		this.edad=0;
	}
	Persona(String nom, int eda) throws PersonaExcepton {
		this.nombre = nom;
		setEdad(eda);
	}
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) throws PersonaExcepton {
		if(edad<0 ) throw new PersonaExcepton("La edad no puede ser menor que 0 ", nombre, edad);
		this.edad = edad;
	}
	public String toString(){
		return this.nombre+" edad: "+ getEdad()+" años";
	}

}
