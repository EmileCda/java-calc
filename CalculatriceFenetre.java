import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
;

 
public class CalculatriceFenetre extends JFrame implements ActionListener{
	private JButton bouton ;
	private JButton bouton2 ;
  
	public CalculatriceFenetre(){
		super();
 
		build();//On initialise notre fenêtre
	}
 
	private void build(){
		setTitle("Calculatrice"); //On donne un titre à l'application
		setSize(400,200); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		setContentPane(buildContentPane());
	}

	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.white);
 
		JLabel label = new JLabel("Résultat : Pas encore calculé");
 
		panel.add(label);

		bouton = new JButton("bouton");
		bouton.addActionListener(this);
		panel.add(bouton);
 		bouton2 = new JButton("bouton 2");
		bouton2.addActionListener(this);
		panel.add(bouton2);
 
		return panel;
	}


	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		

		if(source == bouton){
			System.out.println("Vous avez cliqué bouton.");
		} else if(source == bouton2){
			System.out.println("Vous avez cliqué bouton2.");	
		}

		// switch (source){

		// 	case bouton :  System.out.println("Vous avez cliqué bouton."); break;
		// 	case bouton2 : System.out.println("Vous avez cliqué bouton2."); break;
		// 	default: break;
		// }
		System.out.println("Clic");
	}
}
