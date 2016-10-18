
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class InvestmentFrame extends JFrame 
{
	private static final int FRAME_WIDTH = 450;
	private static final int FRAME_HEIGHT = 100;
	private static final double DEFAULT_RATE = 5;
	private static final double INITIAL_BALANCE = 1000;
	private JLabel rateLabel;
	private JTextField rateField;
	private JButton button;
	private JLabel resultLabel;
	private JPanel panel;
	private BankAccount account;
}

