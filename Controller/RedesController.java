package Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RedesController {

	public static void main(String[] args) {
		
		System.out.println(NomeSO());

	}
	
	private static String NomeSO() {
		
		String nome = System.getProperty("os.name");
		System.out.print("Sistema operacional identificado: "+nome+"\n");
	return nome;
	}
	
	public void IP() {
		String a = NomeSO();
		String comando = "";
		
		if ( a.contains("Win")) {
	
			// comando para encontrar o IPv4 no ipconfig
			comando = "cmd.exe /c ipconfig | findstr IPv4";
			
		}
		else if((a.contains("nux")) || (a.contains("mac"))) {
			
			// comando para encontrar o IPv4 no ip addr
			comando = "ip addr | findstr IPv4";	
				
		}
		else {
			
			System.out.println("Sistema operacional não suportado: "+a);
			
		}
		
		try {
		//execução do código no terminal
		Process processo = Runtime.getRuntime().exec(comando);
        BufferedReader leitor = new BufferedReader(new InputStreamReader(processo.getInputStream()));
		
        String linha;

        	// Exibe a saída do comando
        	while ((linha = leitor.readLine()) != null) {
        		System.out.println(linha);
        	}
		}
		catch(Exception e){
			
			String aviso = e.getMessage();
			System.err.println(aviso);
			
		}	
	}
	
	public void ping() {
		String comando = "";
		String a = NomeSO();
		
		if ( a.contains("Win")) {
			
			// comando para encontrar o ping no Windows
			comando = "cmd.exe /c ping -4 -n 10 www.google.com.br | findstr Média";
			
		}
		else if((a.contains("nux")) || (a.contains("mac"))) {
			
			// comando para encontrar o ping no Linux
			comando = "ip addr | findstr IPv4";	
				
		}
		else {
			
			System.out.println("Sistema operacional não suportado: "+a);	
		}
		try {
			//execução do código no terminal
			Process processo = Runtime.getRuntime().exec(comando);
	        BufferedReader leitor = new BufferedReader(new InputStreamReader(processo.getInputStream()));
			
	        String linha;

	        	// Exibe a saída do comando
	        	while ((linha = leitor.readLine()) != null) {
	        			System.out.println(linha.trim());
	        	}
			}
			catch(Exception e){
				
				String aviso = e.getMessage();
				System.err.println(aviso);
				
			}
		
	
	}	

}
