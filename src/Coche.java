
public class Coche {




			Integer cilindrada;
			String color;
			Double precio;
			boolean isArrancado;
		
		
		void arrancar(){
			if(isArrancado != true){
				isArrancado = true;
				System.out.println(" ¡¡¡Brrrrrr!!! El coche acaba de arrancar." );
				
			}else    {
				System.out.println(" ¡¡¡Kisch, kisch!!! El coche ya está arrancado." );
			}
		}
		
		void verCoche(){
			System.out.println(" Este coche es de color " + color + " tiene una cilindrada de " + cilindrada + " y cuesta " + precio + " euros ");
			
			if(isArrancado==true){
				System.out.println(" Ahora mismo está arrancado. ");
			}else {
				System.out.println(" Ahora mismo está parado ");
			}
		}
		
		
		
		
		
	}


