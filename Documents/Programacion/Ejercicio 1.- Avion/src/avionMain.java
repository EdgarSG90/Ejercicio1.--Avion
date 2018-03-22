import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class avionMain extends JFrame {
	
	public avionMain() {
		// TODO Auto-generated constructor stub
		super("El Avión");
		setResizable(false);
		setDefaultCloseOperation( EXIT_ON_CLOSE);
		Container contenedorPrincipal = this.getContentPane();
		GridBagConstraints restricciones = new GridBagConstraints();
		
		//Creación de los Buttons Opciones
		JButton RPButton = new JButton("Resgistrar Pasajero");
        /*restricciones.gridx = 2;
        restricciones.gridy = 0;
        restricciones.gridwidth = 4; //anchura en celdas
        restricciones.gridheight = 4; //alchura en celdas
        */
        JButton EPButton = new JButton("Eliminar Pasajero");
        JButton BPButton = new JButton("Buscar Pasajero");
        JButton POButton = new JButton("Porcentaje Ocupación");
        JButton O1Button = new JButton("Opción 1");
        JButton O2Button = new JButton("Opción 2");
        
        //Creación de Buttons asientos primera clase
        
        JButton asiento1 = new JButton("1");
        Font fuente = new Font("Arial", 3, 10);
        asiento1.setFont(fuente); 
        asiento1.setBounds(new Rectangle(210,160,10,10));
        getContentPane().add(asiento1);
        
        JButton asiento2 = new JButton("2");
        asiento2.setFont(fuente); 
        asiento2.setBounds(new Rectangle(225,160,10,10));
        getContentPane().add(asiento2);
        
        JButton asiento3 = new JButton("3");
        asiento3.setFont(fuente); 
        asiento3.setBounds(new Rectangle(245,160,10,10));
        getContentPane().add(asiento3);
        
        JButton asiento4 = new JButton("4");
        asiento4.setFont(fuente); 
        asiento4.setBounds(new Rectangle(260,160,10,10));
        getContentPane().add(asiento4);
        
        JButton asiento5 = new JButton("5");
        asiento5.setFont(fuente); 
        asiento5.setBounds(new Rectangle(210,180,10,10));
        getContentPane().add(asiento5);
        
        JButton asiento6 = new JButton("6");
        asiento6.setFont(fuente); 
        asiento6.setBounds(new Rectangle(225,180,10,10));
        getContentPane().add(asiento6);
        
        JButton asiento7 = new JButton("7");
        asiento7.setFont(fuente); 
        asiento7.setBounds(new Rectangle(245,180,10,10));
        getContentPane().add(asiento7);
        
        JButton asiento8 = new JButton("8");
        asiento8.setFont(fuente); 
        asiento8.setBounds(new Rectangle(260,180,10,10));
        getContentPane().add(asiento8);
        
        //Asientos economicos FILA 1
        
        JButton asiento9 = new JButton("9");
        asiento9.setFont(fuente); 
        asiento9.setBounds(new Rectangle(208,200,10,10));
        getContentPane().add(asiento9);
        
        JButton asiento10 = new JButton("10");
        asiento10.setFont(fuente); 
        asiento10.setBounds(new Rectangle(218,200,10,10));
        getContentPane().add(asiento10);
        
        JButton asiento11 = new JButton("11");
        asiento11.setFont(fuente); 
        asiento11.setBounds(new Rectangle(228,200,10,10));
        getContentPane().add(asiento11);
        
        JButton asiento12 = new JButton("12");
        asiento12.setFont(fuente); 
        asiento12.setBounds(new Rectangle(243,200,10,10));
        getContentPane().add(asiento12);
        
        JButton asiento13 = new JButton("13");
        asiento13.setFont(fuente); 
        asiento13.setBounds(new Rectangle(253,200,10,10));
        getContentPane().add(asiento13);
        
        JButton asiento14 = new JButton("14");
        asiento14.setFont(fuente); 
        asiento14.setBounds(new Rectangle(263,200,10,10));
        getContentPane().add(asiento14);
        
        //Asientos economicos FILA 2
        
        JButton asiento15 = new JButton("15");
        asiento15.setFont(fuente); 
        asiento15.setBounds(new Rectangle(208,220,10,10));
        getContentPane().add(asiento15);
        
        JButton asiento16 = new JButton("16");
        asiento16.setFont(fuente); 
        asiento16.setBounds(new Rectangle(218,220,10,10));
        getContentPane().add(asiento16);
        
        JButton asiento17 = new JButton("17");
        asiento17.setFont(fuente); 
        asiento17.setBounds(new Rectangle(228,220,10,10));
        getContentPane().add(asiento17);
        
        JButton asiento18 = new JButton("18");
        asiento18.setFont(fuente); 
        asiento18.setBounds(new Rectangle(243,220,10,10));
        getContentPane().add(asiento18);
        
        JButton asiento19 = new JButton("19");
        asiento19.setFont(fuente); 
        asiento19.setBounds(new Rectangle(253,220,10,10));
        getContentPane().add(asiento19);
        
        JButton asiento20 = new JButton("20");
        asiento20.setFont(fuente); 
        asiento20.setBounds(new Rectangle(263,220,10,10));
        getContentPane().add(asiento20);
        
        //Asientos economicos FILA 3
        
        JButton asiento21 = new JButton("21");
        asiento21.setFont(fuente); 
        asiento21.setBounds(new Rectangle(208,240,10,10));
        getContentPane().add(asiento21);
        
        JButton asiento22 = new JButton("22");
        asiento22.setFont(fuente); 
        asiento22.setBounds(new Rectangle(218,240,10,10));
        getContentPane().add(asiento22);
        
        JButton asiento23 = new JButton("23");
        asiento23.setFont(fuente); 
        asiento23.setBounds(new Rectangle(228,240,10,10));
        getContentPane().add(asiento23);
        
        JButton asiento24 = new JButton("24");
        asiento24.setFont(fuente); 
        asiento24.setBounds(new Rectangle(243,240,10,10));
        getContentPane().add(asiento24);
        
        JButton asiento25 = new JButton("25");
        asiento25.setFont(fuente); 
        asiento25.setBounds(new Rectangle(253,240,10,10));
        getContentPane().add(asiento25);
        
        JButton asiento26 = new JButton("26");
        asiento26.setFont(fuente); 
        asiento26.setBounds(new Rectangle(263,240,10,10));
        getContentPane().add(asiento26);
        
        //Asientos economicos FILA 4
        
        JButton asiento27 = new JButton("27");
        asiento27.setFont(fuente); 
        asiento27.setBounds(new Rectangle(208,260,10,10));
        getContentPane().add(asiento27);
        
        JButton asiento28 = new JButton("28");
        asiento28.setFont(fuente); 
        asiento28.setBounds(new Rectangle(218,260,10,10));
        getContentPane().add(asiento28);
        
        JButton asiento29 = new JButton("29");
        asiento29.setFont(fuente); 
        asiento29.setBounds(new Rectangle(228,260,10,10));
        getContentPane().add(asiento29);
        
        JButton asiento30 = new JButton("30");
        asiento30.setFont(fuente); 
        asiento30.setBounds(new Rectangle(243,260,10,10));
        getContentPane().add(asiento30);
        
        JButton asiento31 = new JButton("31");
        asiento31.setFont(fuente); 
        asiento31.setBounds(new Rectangle(253,260,10,10));
        getContentPane().add(asiento31);
        
        JButton asiento32 = new JButton("32");
        asiento32.setFont(fuente); 
        asiento32.setBounds(new Rectangle(263,260,10,10));
        getContentPane().add(asiento32);
        
        //Asientos economicos FILA 5
        
        JButton asiento33 = new JButton("33");
        asiento33.setFont(fuente); 
        asiento33.setBounds(new Rectangle(208,280,10,10));
        getContentPane().add(asiento33);
        
        JButton asiento34 = new JButton("34");
        asiento34.setFont(fuente); 
        asiento34.setBounds(new Rectangle(218,280,10,10));
        getContentPane().add(asiento34);
        
        JButton asiento35 = new JButton("35");
        asiento35.setFont(fuente); 
        asiento35.setBounds(new Rectangle(228,280,10,10));
        getContentPane().add(asiento35);
        
        JButton asiento36 = new JButton("36");
        asiento36.setFont(fuente); 
        asiento36.setBounds(new Rectangle(243,280,10,10));
        getContentPane().add(asiento36);
        
        JButton asiento37 = new JButton("37");
        asiento37.setFont(fuente); 
        asiento37.setBounds(new Rectangle(253,280,10,10));
        getContentPane().add(asiento37);
        
        JButton asiento38 = new JButton("38");
        asiento38.setFont(fuente); 
        asiento38.setBounds(new Rectangle(263,280,10,10));
        getContentPane().add(asiento38);
        
        //Asientos economicos FILA 6
        
        JButton asiento39 = new JButton("39");
        asiento39.setFont(fuente); 
        asiento39.setBounds(new Rectangle(208,300,10,10));
        getContentPane().add(asiento39);
        
        JButton asiento40 = new JButton("40");
        asiento40.setFont(fuente); 
        asiento40.setBounds(new Rectangle(218,300,10,10));
        getContentPane().add(asiento40);
        
        JButton asiento41 = new JButton("41");
        asiento41.setFont(fuente); 
        asiento41.setBounds(new Rectangle(228,300,10,10));
        getContentPane().add(asiento41);
        
        JButton asiento42 = new JButton("42");
        asiento42.setFont(fuente); 
        asiento42.setBounds(new Rectangle(243,300,10,10));
        getContentPane().add(asiento42);
        
        JButton asiento43 = new JButton("43");
        asiento43.setFont(fuente); 
        asiento43.setBounds(new Rectangle(253,300,10,10));
        getContentPane().add(asiento43);
        
        JButton asiento44 = new JButton("44");
        asiento44.setFont(fuente); 
        asiento44.setBounds(new Rectangle(263,300,10,10));
        getContentPane().add(asiento44);
        
        //Asientos economicos FILA 7
        
        JButton asiento45 = new JButton("45");
        asiento45.setFont(fuente); 
        asiento45.setBounds(new Rectangle(208,320,10,10));
        getContentPane().add(asiento45);
        
        JButton asiento46 = new JButton("46");
        asiento46.setFont(fuente); 
        asiento46.setBounds(new Rectangle(218,320,10,10));
        getContentPane().add(asiento46);
        
        JButton asiento47 = new JButton("47");
        asiento47.setFont(fuente); 
        asiento47.setBounds(new Rectangle(228,320,10,10));
        getContentPane().add(asiento47);
        
        JButton asiento48 = new JButton("48");
        asiento48.setFont(fuente); 
        asiento48.setBounds(new Rectangle(243,320,10,10));
        getContentPane().add(asiento48);
        
        JButton asiento49 = new JButton("49");
        asiento49.setFont(fuente); 
        asiento49.setBounds(new Rectangle(253,320,10,10));
        getContentPane().add(asiento49);
        
        JButton asiento50 = new JButton("50");
        asiento50.setFont(fuente); 
        asiento50.setBounds(new Rectangle(263,320,10,10));
        getContentPane().add(asiento50);
        
        ButtonGroup btnOpciones = new ButtonGroup();

        btnOpciones.add(RPButton);
        btnOpciones.add(EPButton);
        btnOpciones.add(BPButton);
        btnOpciones.add(POButton);
        btnOpciones.add(O1Button);
        btnOpciones.add(O2Button);
        
        JPanel btnPanel1 = new JPanel();
        btnPanel1.setLayout(new GridLayout(1,0));
        
        btnPanel1.add(RPButton);
        btnPanel1.add(EPButton);
        btnPanel1.add(BPButton);
        
        JPanel btnPanel2 = new JPanel();
        btnPanel2.setLayout(new GridLayout(1,0));
        
        btnPanel2.add(POButton);
        btnPanel2.add(O1Button);
        btnPanel2.add(O2Button);
        btnPanel2.setBackground(Color.RED);
        
        JLabel picture = new JLabel(new ImageIcon("src/avion.jpg"));
        
        JPanel Botones = new JPanel();
        Botones.setLayout(new BoxLayout(Botones,BoxLayout.X_AXIS));
        Botones.add(btnPanel1);
        Botones.add(btnPanel2);
        Botones.add(picture);
        getContentPane().add(picture,BorderLayout.SOUTH);
        getContentPane().add(btnPanel1,BorderLayout.NORTH);
        getContentPane().add(btnPanel2,BorderLayout.CENTER);
        getContentPane().setBackground(Color.white);
        
        
        
        
	}

	public static void main (String[] args) {
		avionMain avion = new avionMain();
        avion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        avion.pack();
        avion.setVisible(true);
    }

}