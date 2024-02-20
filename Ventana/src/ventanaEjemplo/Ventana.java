package ventanaEjemplo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{

	public Ventana() {
		this.setTitle("ASd");
		this.setVisible(true);
		this.setSize(1000, 500);
		
		//cerrar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//titulo
		this.setTitle("Mi ventana");
		
		//tamaños
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,750));
		this.setResizable(true);
		
		//ubicacion
		this.setLocation(200,200);
		//this.setOpaque(true);
		
		//centrar
		this.setLocationRelativeTo(null);
		
		//Quitar el molde
		this.setLayout(null);
		
		this.iniciarComponentes();
	}
	
	public void iniciarComponentes()
	{
		//size
		//Location
		//background -opaque
		//String constructor
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight());
		
		login.setBackground(Color.pink);
		
		
		JLabel loginTag = new JLabel("Acceder");
		
		//Tamaño del boton
		loginTag.setSize(300,30);
		
		//Cambiar la fuente
		loginTag.setFont (new Font ("corbel",Font.BOLD,50));
		
		//Cambiar el color de letra
		loginTag.setForeground(Color.white);
		
		loginTag.setLocation(100,200);
		loginTag.setOpaque(true);
		
		//Poner el color de fondo
		loginTag.setBackground(Color.lightGray);
		login.add(loginTag);
		
		JPanel registro = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight());
		registro.setLocation(500,0);
		login.setBackground(Color.GRAY);
		
		JLabel userTag = new JLabel("Nombre de Usuario: ");
		userTag.setBounds(10,120,20,40);
		userTag.setFont (new Font ("corbel",Font.BOLD,50));
		
		this.add(login);
		//this.add(registro);
		
		/*JCheckBox remember =new JCheckBox("Recordarme");
		remember.setBounds(10,300,150,40);
		login.add(remember);
		
		//JLabel forgotTag = new Label
		
		this.add(login);
		//this.add(registro);
		*/
	}
}