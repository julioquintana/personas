
public class PersonaExcepton extends Exception {
	String nombre;
	int edad;
	
	PersonaExcepton(String causa, String nom, int eda){
		super(causa);
		this.nombre = nom;
		this.edad = eda;
	}

	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String toString(){
		return  getMessage()+ this.nombre+" edad: "+ getEdad()+" años";
	}
}
