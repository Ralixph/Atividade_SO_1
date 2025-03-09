package viwer;

import javax.swing.JOptionPane;
import Controller.RedesController;
public class Principal_SO1 {

	public static void main(String[] args) {
	RedesController r = new RedesController();	
		int menu = 0;
		
		while (menu != 9) {
			
			menu = Integer.parseInt(JOptionPane.showInputDialog("""
					1 - IP do sistema Operacional 
					2 - Ping médio do Sistema Operacional baseado no google.com 
					9 - Encerra o programa
					"""));
			
			switch (menu){

			case 1:
				
			r.IP();
				
			break;
				
			case 2:
				
			r.ping();
				
			break;
				
			case 9: System.out.println("\nEncerrando...");

			}	
		}
	}
}
