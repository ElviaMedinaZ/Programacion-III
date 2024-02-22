package ventanaEjemplo;

import javax.swing.JFrame;

//import ventana.JFrame;

public class ventanaEjemplo {

	public static void main(String[] args) 
	{

	// TODO Auto-generated method stub
			JFrame ventana = new JFrame("Example");
			ventana.setVisible(false);
			ventana.setSize(100,100);
			ventana.setLocation(100,100);
			
			
			ventana.setLocationRelativeTo(null);
			
			ventana.setResizable(false);
			
			ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			System.out.println("Hola");
	}

}
