package meujogo;

import javax.swing.JFrame;

import meujogo.modelo.Fase;

public class Conteiner extends JFrame {

	public Conteiner () {
		add(new Fase ());
		setTitle("Meu Jogo");
		setSize(1024,680);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);
	}
	
	public static void main(String []args) {
		new Conteiner();
	}

}
