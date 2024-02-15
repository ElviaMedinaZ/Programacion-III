
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{

	public Ventana() {
		this.setTitle("ASd");
		
		this.setVisible(true);
		
		
		this.setSize(200, 200);
		
		//cerrar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//titulo
		this.setTitle("Mi ventana");
		
		//tamaños
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(270,270));
		this.setResizable(true);
		
		//ubicacion
		this.setLocation(200,200);
		
		//centrar
		this.setLocationRelativeTo(null);
		
		this.iniciarComponentes();
	}
	
	public void iniciarComponentes()
	{
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth(), this.getHeight());
		login.setBackground(Color.pink);
		this.add(login);
		
	}
}