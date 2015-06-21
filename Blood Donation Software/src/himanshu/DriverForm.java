package himanshu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class DriverForm extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private JLabel first_name;
	private JLabel middle_name;
	private JLabel last_name;
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
	
	private JTextField text_first_name;
	private JTextField text_middle_name;
	private JTextField text_last_name;
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
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DriverForm frame = new DriverForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public DriverForm() throws Exception {
		
		populateGUI();
		
		dao = new DriverDAO();
		
		saveButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					saveDriver(dao);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				dispose();
			}
		});
	}
	
	private void populateGUI(){
		
		setBounds(100, 100, 450, 300);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setTitle("Registration form for Java");
		contentPanel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				/*ColumnSpec.decode("default:grow"),*/
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				/*ColumnSpec.decode("default:grow"),*/
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				}));
		{
			first_name = new JLabel("First Name");
			contentPanel.add(first_name, "2, 2, center, default");
		}
		{
			text_first_name = new JTextField(10);
			contentPanel.add(text_first_name, "4, 2, fill, default");
		}
		{
			middle_name = new JLabel("Middle Name");
			contentPanel.add(middle_name, "2, 4, center , default");
		}
		{
			text_middle_name = new JTextField(10);
			contentPanel.add(text_middle_name, "4, 4, fill, default");
		}
		{
			last_name = new JLabel("Last Name");
			contentPanel.add(last_name, "2, 6, center, default");
		}
		{
			text_last_name = new JTextField(10);
			contentPanel.add(text_last_name, "4, 6, fill, default");
		}
		{
			sex = new JLabel("Sex");
			contentPanel.add(sex, "2, 8, center, default");
		}
		{
			text_sex = new JTextField(10);
			contentPanel.add(text_sex, "4, 8, fill, default");
		}
		{
			mobile_no = new JLabel("Mobile No");
			contentPanel.add(mobile_no, "2, 10, center, default");
		}
		{
			text_mobile_no = new JTextField(10);
			contentPanel.add(text_mobile_no, "4, 10, fill, default");
		}
		{
			email = new JLabel("E-mail");
			contentPanel.add(email, "2, 12, center, default");
		}
		{
			text_email = new JTextField(10);
			contentPanel.add(text_email, "4, 12, fill, default");
		}
		{
			dob = new JLabel("Date of Birth");
			contentPanel.add(dob, "2, 14, center, default");
		}
		{
			text_dob = new JTextField(10);
			contentPanel.add(text_dob, "4, 14, fill, default");
		}
		{
			dl_no = new JLabel("Driving License No.");
			contentPanel.add(dl_no, "2, 16, center, default");
		}
		{
			text_dl_no = new JTextField(10);
			contentPanel.add(text_dl_no, "4, 16, fill, default");
		}
		{
			add = new JLabel("Address");
			contentPanel.add(add, "2, 18, center, default");
			
		}
		{
			text_add = new JTextField(10);
			contentPanel.add(text_add, "4, 18, fill, default");
		}
		{
			state = new JLabel("State");
			contentPanel.add(state, "2, 20, center, default");
		}
		{
			text_state = new JTextField(10);
			contentPanel.add(text_state, "4, 20, fill, default");
		}
		{
			country = new JLabel("Country");
			contentPanel.add(country, "2, 22, center, default");
		}
		{
			text_country = new JTextField(10);
			contentPanel.add(text_country, "4, 22, fill, default");
		}
		{
			pincode = new JLabel("Pincode");
			contentPanel.add(pincode, "2, 24, center, default");
		}
		{
			text_pincode = new JTextField(10);
			contentPanel.add(text_pincode, "4, 24, fill, default");
		}
		{
			password = new JLabel("Password");
			contentPanel.add(password, "2, 26, center, default");
		}
		{
			text_password = new JPasswordField(10);
			contentPanel.add(text_password, "4, 26, fill, default");
		}
		{
			con_password = new JLabel("Confirm Password");
			contentPanel.add(con_password, "2, 28, center, default");
		}
		{
			text_conf_password = new JPasswordField(10);
			contentPanel.add(text_conf_password, "4, 28, fill, default");
		}
		{
			city = new JLabel("City");
			contentPanel.add(city, "2, 30, center, default");
		}
		{
			text_city = new JTextField(10);
			contentPanel.add(text_city, "4, 30, fill, default");
		}
		{
			buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				saveButton = new JButton("Save");
				saveButton.setHorizontalAlignment(SwingConstants.LEADING);
				saveButton.setActionCommand("Save");
				buttonPane.add(saveButton);
				getRootPane().setDefaultButton(saveButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	private void saveDriver(DriverDAO dao) throws SQLException{
		
		String error = "";
		boolean flag = false;
		
		if(text_first_name.getText().toString() == null){
			error += "First Name, ";
			flag = true;
		}
		
		if(text_middle_name.getText().toString() == null){
			error += "Middle Name, ";
			flag = true;
		}
		
		if(text_last_name.getText().toString() == null){
			error += "Last name, ";
			flag = true;
		}
		
		if(text_sex.getText().toString() == null){
			error += "Sex, ";
			flag = true;
		}
		
		if(text_mobile_no.getText().toString() == null){
			error += "Mobile No, ";
			flag = true;
		}
		
		if(text_add.getText().toString() == null){
			error += "Address, ";
			flag = true;
		}
		
		if(text_city.getText().toString() == null){
			error += "City, ";
			flag = true;
		}
		
		if(text_state.getText().toString() == null){
			error += "State, ";
			flag = true;
		}
		
		if(text_country.getText().toString() == null){
			error += "Country, ";
			flag = true;
		}
		
		if(text_pincode.getText().toString() == null){
			error += "Pincode, ";
			flag = true;
		}
		
		if(text_email.getText().toString() == null){
			error += "E-mail, ";
			flag = true;
		}
		
		if(text_dob.getText().toString() == null){
			error += "Date Of Bith, ";
			flag = true;
		}
		
		if(text_dl_no.getText().toString() == null){
			error += "Driving License No, ";
			flag = true;
		}
		
		error += "are empty";
		
		if(flag){
			JOptionPane.showMessageDialog(DriverForm.this, error, "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		Driver driver = new Driver(text_first_name.getText().toString(), text_middle_name.getText().toString(), text_last_name.getText().toString(), 
				text_mobile_no.getText().toString(), text_sex.getText().toString(), text_add.getText().toString(), 
				text_city.getText().toString(), text_state.getText().toString(), text_country.getText().toString(), 
				text_pincode.getText().toString(), text_email.getText().toString(), text_dl_no.getText().toString(), text_dob.getText().toString());
	
		dao.insertData(driver);
	}
}
