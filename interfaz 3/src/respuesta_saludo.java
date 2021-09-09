import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class respuesta_saludo {

	public respuesta_saludo() {
		// TODO Auto-generated constructor stub
		
	}
	public static void main2(String[] args) {
		JFrame frame2= new JFrame ("saludandote");
		frame2.setSize(500,200);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel2 = new JPanel();
		frame2.add(panel2);
		frame2.setVisible(false);
		placeComponents2(panel2);
	}
	private static void placeComponents2(JPanel panel2) {
		panel2.setLayout(null);

		JLabel userLabel = new JLabel("pon tu nombre y te saludo crack ^_~");
		userLabel.setBounds(100, 10, 700, 25);
		panel2.add(userLabel);
		JTextField userText = new JTextField(20);
		userText.setBounds(100, 40, 160, 25);
		panel2.add(userText);
		JButton userButton = new JButton ("¡Saludar!");
		userButton.setBounds(100, 70, 160, 25);
		panel2.add(userButton);
		
	}
}
