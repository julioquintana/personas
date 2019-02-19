import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pruebaExcepcionesPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("Escribe el nombre de la persona: ");
			String nombre = in.readLine();
			System.out.print("\n");
			System.out.print("Escribe la edad de la persona: ");
			String e= in.readLine();
			int edad = Integer.parseInt(e);
			
			Persona p = new Persona(nombre,edad);
			System.out.println("Se agrego a la persona exitosamente: " + p);
			
			
		}catch(IOException e){
			System.out.println("Error de lectura: "+e);
			e.printStackTrace();
		}catch(PersonaExcepton e){
			System.out.println("Error al agregar la persona: "+e);
			e.printStackTrace();
		}
		
	}

}
