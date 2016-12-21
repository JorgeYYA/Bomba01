
public class Bomba01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String mensaje = "Shingeki no Kiojin";
	String mensajeEncriptado="";
	
	mensajeEncriptado=encriptador(mensaje);
	System.out.println(mensajeEncriptado);
	}
	
	public static String encriptador(String mensaje){
		
		String mensajeEncriptado="";
		int ascii=0;
		char caracter=' ';
		
		for(int i=0;i<mensaje.length();i++){
			
			caracter = mensaje.charAt(i);
			
			ascii = (int) caracter;
			
			mensajeEncriptado = mensajeEncriptado+ascii+" ";
			
		}
		
		StringBuffer sb = new StringBuffer(mensajeEncriptado);
		 
		mensajeEncriptado = sb.reverse().toString();
		
		
		return mensajeEncriptado;
		
		
	}
	
	
	

}
