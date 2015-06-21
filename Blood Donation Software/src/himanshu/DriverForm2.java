package himanshu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DriverForm2 extends JDialog {

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
	private JLabel age;
	private JLabel password;
	private JLabel con_password;
	
	private JTextField text_name;
	private JTextField text_mobile_no;
	private JTextField text_dl_no;
	private JTextField text_dob;
	private JTextField text_doj;
	private JTextField text_sex;
	private JTextField text_age;
	private JTextArea text_add;
	private JTextField text_email;
	private JTextField text_city;
	private JTextField text_state;
	private JTextField text_country;
	private JTextField text_pincode;
	private JPasswordField text_password;
	private JPasswordField text_conf_password;
	
	private JPanel part1;
	private JPanel part2;
	private JPanel part3;
	private JPanel part4;
	private JPanel part5;
	private JPanel part6;
	private JPanel part7;
	private JPanel part8;
	private JPanel part9;
	
	JPanel buttonPane;
	
	JButton saveButton;
	JButton cancelButton;
	
	GridBagLayout layout;
	
	DriverDAO dao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DriverForm2 dialog = new DriverForm2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DriverForm2() {
		setBounds(100, 100, 700, 500);
		layout = new GridBagLayout();
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new GridBagLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		gbc.weighty = 0.125;
		gbc.fill = GridBagConstraints.BOTH;
		
		part1 = new JPanel();
		contentPanel.add(part1, gbc);
		
		gbc = new GridBagConstraints();
		gbc.weightx = 0.25;
		dl_no = new JLabel("Driving license No:");
		part1.add(dl_no, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.PAGE_START;
		gbc.weightx = 0.25;
		text_dl_no = new JTextField(10);
		part1.add(text_dl_no, gbc);
		
		gbc = new GridBagConstraints();
		gbc.weightx = 0.25;
		doj = new JLabel("Date of Joining");
		part1.add(doj, gbc);
		
		gbc = new GridBagConstraints();
		gbc.weightx = 0.25;
		text_doj = new JTextField(10);
		part1.add(text_doj, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.LAST_LINE_END;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		gbc.weighty = 0.125;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		part2 = new JPanel();
		contentPanel.add(part2, gbc);
		
		gbc = new GridBagConstraints();
		gbc.weightx = 0.25;
		name = new JLabel("Name:");
		part2.add(name, gbc);
		
		gbc = new GridBagConstraints();
		gbc.weightx = 0.25;
		text_name = new JTextField(20);
		part2.add(text_name, gbc);
		
		gbc = new GridBagConstraints();
		gbc.weightx = 0.25;
		sex = new JLabel("Sex:");
		part2.add(sex, gbc);
		
		gbc = new GridBagConstraints();
		gbc.weightx = 0.25;
		text_sex = new JTextField(10);
		part2.add(text_sex, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.LAST_LINE_END;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		gbc.weighty = 0.125;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		part3 = new JPanel();
		contentPanel.add(part3, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		mobile_no = new JLabel("Mobile No:");
		part3.add(mobile_no, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		text_mobile_no = new JTextField(10);
		part3.add(text_mobile_no, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		email = new JLabel("E-mail:");
		part3.add(email, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		text_email = new JTextField(10);
		part3.add(text_email, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.LAST_LINE_END;
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		gbc.weighty = 0.125;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		part4 = new JPanel();
		contentPanel.add(part4, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		dob = new JLabel("Date of Birth:");
		part4.add(dob, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		text_dob = new JTextField(10);
		part4.add(text_dob, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		age = new JLabel("Age:");
		part4.add(age, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		text_age = new JTextField(10);
		part4.add(text_age, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.LAST_LINE_END;
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		gbc.weighty = 0.125;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		part5 = new JPanel();
		contentPanel.add(part5, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		add = new JLabel("Address");
		part5.add(add, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		text_add = new JTextArea(3, 20);
		part5.add(text_add, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		city = new JLabel("City:");
		part5.add(city, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		text_city = new JTextField(10);
		part5.add(text_city, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.LAST_LINE_END;
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		gbc.weighty = 0.125;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		part6 = new JPanel();
		contentPanel.add(part6, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		state = new JLabel("State:");
		part6.add(state, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		text_state = new JTextField(10);
		part6.add(text_state, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		country = new JLabel("Country:");
		part6.add(country, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		text_country = new JTextField(10);
		part6.add(text_country, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.LAST_LINE_END;
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		gbc.weighty = 0.125;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		part7 = new JPanel();
		contentPanel.add(part7, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		password = new JLabel("Password:");
		part7.add(password, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		text_password = new JPasswordField(10);
		part7.add(text_password, gbc);

		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		con_password = new JLabel("Conform Password:");
		part7.add(con_password, gbc);

		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = 0.25;
		text_conf_password = new JPasswordField(10);
		part7.add(text_conf_password, gbc);

	}
}
