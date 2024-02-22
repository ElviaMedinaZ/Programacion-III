package ventanaEjemplo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
	//Atributos base
	public Ventana() {
		
		this.setSize(1000, 500);//Tamaño de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar
		this.setTitle("Mi ventana"); //Titulo
		
		//tamaños
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,270));
		this.setResizable(true);
		
		//ubicacion
		this.setLocation(200,200);
		this.setLayout(null);
		this.setLocationRelativeTo(null);//centrar
		this.setLayout(null);//Quitar el molde
		this.setLocationRelativeTo(null);
		
		this.iniciarComponentes();//Agrega los componentes
		this.setVisible(true);
	}
	
	public void iniciarComponentes()
	{
		this.login();
		//size
		//Location
		//background -opaque
		//String constructor
		
		JPanel registro = new JPanel();//crear otro panel
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setBackground(Color.DARK_GRAY);//color al panel
		registro.setLocation(500,0);//el panel aparece en la otra mitad del frame
		registro.setLayout(null);
		
		JLabel registroTag = new JLabel("REGISTRO",0);// SwingConstants.CENTER sirve tambien para centrar
		registro.setSize(250,80);//Tamaño del boton
		registro.setFont (new Font ("Microsoft Uighur",Font.BOLD,50));//Cambiar la fuente
		registro.setForeground(Color.white);//Cambiar el color de letra
		registro.setLocation(630,20);
		registro.setOpaque(true);
		registro.setBackground(Color.pink);//Poner el color de fondo
		registro.add(registroTag);
		
		JTextField userField = new JTextField();
		userField.setBounds(50,160,400,40);
		userField.setHorizontalAlignment(0);
		userField.setFont(new Font ("Microsoft Uighur",Font.BOLD,50));
		registro.add(userField);
		
		JLabel bioTag = new JLabel("BIO",0);
		bioTag.setBounds(50,220,400,40);
		registro.add(bioTag);
		
		this.add(registro);
		
		this.repaint();
		this.validate();
		
	}
	
	public void login () {
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight()); //Panel en mitad del frame
		login.setBackground(Color.LIGHT_GRAY);
		login.setLayout(null);
		
		
		JLabel loginTag = new JLabel("ACCEDER",0);// SwingConstants.CENTER sirve tambien para centrar
		loginTag.setSize(250,80);//Tamaño del boton
		loginTag.setFont (new Font ("Microsoft Uighur",Font.BOLD,50));//Cambiar la fuente
		loginTag.setForeground(Color.white);//Cambiar el color de letra
		loginTag.setLocation(120,20);
		loginTag.setOpaque(true);
		loginTag.setBackground(Color.pink);//Poner el color de fondo
		login.add(loginTag);
		
		JLabel userTag = new JLabel("NOMBRE DE USUARIO: ");
		userTag.setBounds(10, 120, 300, 40); // Ajusta coorde y tam de contraseña
		userTag.setFont (new Font ("Microsoft Uighur",Font.BOLD,30));
		login.add(userTag);
		
		
		
		JTextField email = new JTextField();
	    email.setBounds(10, 160, 300, 40); 
	    login.add(email);
		
		JPasswordField passwordField = new JPasswordField("");
		passwordField.setBounds(10, 260, 300, 40);//X,Y,Ancho,Largo
	    login.add(passwordField);
	    
	    JLabel password = new JLabel("CONTRASEÑA: ");
	    password.setBounds(10, 220, 200, 40); // Ajusta coordenadas y tamaño de la etiqueta de contraseña
	    password.setFont(new Font("Microsoft Uighur", Font.BOLD, 30));
	    login.add(password); // Agrega la etiqueta de contraseña al panel de inicio de sesión
		
		JCheckBox remember = new JCheckBox("Recordarme");
		remember.setBounds(10, 300, 150, 40);
		remember.setOpaque(false);//vuelve opaco el fondo de la casilla
		login.add(remember);
		
		JLabel forgot = new JLabel("¿Olvidó su contraseña?"); //Añade etiquetas de texto
		forgot.setBounds(175,300,150,40);//(x,y,ancho,alto)
		login.add(forgot);//añade el componente
		
		JButton accept = new JButton("ACEPTAR");
		accept.setFont(new Font("Microsoft Uighur",Font.BOLD,40));//establece fuente del texto
		accept.setBounds(20, 340, 230, 80);
		login.add(accept);
		
		JLabel termsTag = new JLabel("TERMINO",0);// SwingConstants.CENTER sirve tambien para centrar
		termsTag.setBounds(600,400,200,50);//Tamaño del boton
		termsTag.setFont (new Font ("Microsoft Uighur",Font.BOLD,50));//Cambiar la fuente
		termsTag.setForeground(Color.white);//Cambiar el color de letra
		termsTag.setLocation(120,20);
		termsTag.setOpaque(true);
		termsTag.setBackground(Color.cyan);//Poner el color de fondo
		login.add(termsTag);
		
		
		
		this.add(login);
		
	}
	//this. repaint() esto es para recargar la pantalla
	//this.validate()
}



