import javax.swing.*;
import java.awt.*;
public class ChatFrame{
	public static void main(String[] args){
		//create the frame
		JFrame frame = new JFrame("Chat frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set the size of the frame
		frame.setSize(500, 500);
                //create menuBar and add components
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("File");
		JMenu m2 = new JMenu("Help");
		mb.add(m1);
		mb.add(m2);
		JMenuItem m11 = new JMenuItem("open");
		JMenuItem m22 = new JMenuItem("Save as ");
		m1.add(m11);
		m1.add(m22);
		//create a panel at bottom and add components
		//the panel is not visible in output
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Enter the text");
		//accept upto 20 characters
		JTextField tf = new JTextField(20);

		//set the send and reset button
		JButton send = new JButton("Send");
		JButton reset = new JButton("Reset");
		//components added using flow layout
		panel.add(label);
		panel.add(tf);
		panel.add(send);
		panel.add(reset);
		//set text area at the center
		JTextArea ta = new JTextArea();
		//Adding component to the frame
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.NORTH, mb);
		frame.getContentPane().add(BorderLayout.CENTER, ta);
		frame.setVisible(true);
	}
}

