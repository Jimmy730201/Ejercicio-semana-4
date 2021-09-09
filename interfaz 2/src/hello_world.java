import javax.swing.*;
public class hello_world {

	public hello_world() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame ();
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);

	}
	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel userLabel = new JLabel("hello world");
		userLabel.setBounds(100, 90, 80, 25);
		panel.add(userLabel);
	}
}
