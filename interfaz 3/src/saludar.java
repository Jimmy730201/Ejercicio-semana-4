import javax.swing.*;
public class saludar  {
	public static void main(String[] args) {
		JFrame frame = new JFrame ("Saludar");
		frame.setSize(500,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
		
		
	}
	private static void placeComponents(JPanel panel) {
		panel.setLayout(null);

		JLabel userLabel = new JLabel("pon tu nombre y te saludo crack ^_~");
		userLabel.setBounds(100, 10, 700, 25);
		panel.add(userLabel);
		JTextField userText = new JTextField(20);
		userText.setBounds(100, 40, 160, 25);
		panel.add(userText);
		JButton userButton = new JButton ("¡Saludar!");
		userButton.setBounds(100, 70, 160, 25);
		panel.add(userButton);
		
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
