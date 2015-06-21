package himanshu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DriverForm1 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private JLabel name;
	private JLabel mobile_no;
	private JLabel dl_no;
	private JLabel dob;
	private JLabel doj; //Date of Journey
	private JLabel sex;
	private JLabel add;
	private JLabel email;
	private JLabel city;
	private JLabel state;
	private JLabel country;
	private JLabel pincode;
	private JLabel password;
	private JLabel con_password;
	
	private JTextField text_name;
	private JTextField text_mobile_no;
	private JTextField text_dl_no;
	private JTextField text_dob;
	private JTextField text_doj;
	private JTextField text_sex;
	private JTextField text_add;
	private JTextField text_email;
	private JTextField text_city;
	private JTextField text_state;
	private JTextField text_country;
	private JTextField text_pincode;
	private JPasswordField text_password;
	private JPasswordField text_conf_password;
	
	JPanel buttonPane;
	
	JButton saveButton;
	JButton cancelButton;
	
	DriverDAO dao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DriverForm1 dialog = new DriverForm1();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DriverForm1() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel first = new JPanel();
			first.setLayout(new FlowLayout(FlowLayout.LEFT));
			getContentPane().add(first, BorderLayout.NORTH);
			{
				dl_no = new JLabel("Driving License No:");
				first.add(dl_no);
			}
			{
				text_dl_no = new JTextField(10);
				first.add(text_dl_no);
			}
			{
				doj = new JLabel("Date of Joining");
				first.add(doj);
			}
			{
				text_doj = new JTextField(10);
				first.add(text_doj);
			}
		}
		{
			JPanel second = new JPanel();
			second.setLayout(new FlowLayout(FlowLayout.LEFT));
			getContentPane().add(second, BorderLayout.CENTER);
			{
				name = new JLabel("Name:");
				second.add(name);
			}
			{
				text_name = new JTextField(30);
				second.add(text_name);
			}
			{
				sex = new JLabel("Sex");
				second.add(sex);
			}
			{
				text_doj = new JTextField(10);
				second.add(text_doj);
			}
		}
		{
			JPanel second = new JPanel();
			second.setLayout(new FlowLayout(FlowLayout.LEFT));
			getContentPane().add(second, BorderLayout.CENTER);
			{
				name = new JLabel("Name:");
				second.add(name);
			}
			{
				text_name = new JTextField(30);
				second.add(text_name);
			}
			{
				sex = new JLabel("Sex");
				second.add(sex);
			}
			{
				text_doj = new JTextField(10);
				second.add(text_doj);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
