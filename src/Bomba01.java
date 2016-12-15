
public class Bomba01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String mensaje = "Shingeki no Kiojin";
	
	
	encriptador(mensaje);
	
	}
	
	public static String encriptador(String mensaje){
		
		String mensajeEncriptado="";
		int ascii;
		char caracter;
		for(int i=0;i<mensaje.length();i++){
			
			caracter = mensaje.charAt(i);
			
			ascii = (int) caracter;
			
			mensajeEncriptado = mensajeEncriptado+ascii;
			
		}
		
		System.out.println(mensajeEncriptado);
		return mensajeEncriptado;
		
		
	}
	
	

}
