import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Gui_user extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_user frame = new Gui_user();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui_user() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 220, 213);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton Button1 = new JButton("攻擊");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				User.g=1;
			}
		});
		GridBagConstraints gbc_Button1 = new GridBagConstraints();
		gbc_Button1.insets = new Insets(0, 0, 5, 5);
		gbc_Button1.gridx = 0;
		gbc_Button1.gridy = 0;
		contentPane.add(Button1, gbc_Button1);
		
		JButton Button2 = new JButton("上");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.g=2;
			}
		});
		GridBagConstraints gbc_Button2 = new GridBagConstraints();
		gbc_Button2.insets = new Insets(0, 0, 5, 5);
		gbc_Button2.gridx = 1;
		gbc_Button2.gridy = 0;
		contentPane.add(Button2, gbc_Button2);
		
		JButton Button3 = new JButton("道具");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.g=3;
			}
		});
		GridBagConstraints gbc_Button3 = new GridBagConstraints();
		gbc_Button3.insets = new Insets(0, 0, 5, 0);
		gbc_Button3.gridx = 2;
		gbc_Button3.gridy = 0;
		contentPane.add(Button3, gbc_Button3);
		
		JButton Button4 = new JButton("左");
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.g=4;
			}
		});
		GridBagConstraints gbc_Button4 = new GridBagConstraints();
		gbc_Button4.insets = new Insets(0, 0, 5, 5);
		gbc_Button4.gridx = 0;
		gbc_Button4.gridy = 2;
		contentPane.add(Button4, gbc_Button4);
		
		JButton Button5 = new JButton("確定");
		Button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.g=5;
			}
		});
		GridBagConstraints gbc_Button5 = new GridBagConstraints();
		gbc_Button5.insets = new Insets(0, 0, 5, 5);
		gbc_Button5.gridx = 1;
		gbc_Button5.gridy = 2;
		contentPane.add(Button5, gbc_Button5);
		
		JButton Button6 = new JButton("右");
		Button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.g=6;
			}
		});
		GridBagConstraints gbc_Button6 = new GridBagConstraints();
		gbc_Button6.insets = new Insets(0, 0, 5, 0);
		gbc_Button6.gridx = 2;
		gbc_Button6.gridy = 2;
		contentPane.add(Button6, gbc_Button6);
		
		JButton Button7 = new JButton("狀態");
		Button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.g=7;
			}
		});
		GridBagConstraints gbc_Button7 = new GridBagConstraints();
		gbc_Button7.insets = new Insets(0, 0, 0, 5);
		gbc_Button7.gridx = 0;
		gbc_Button7.gridy = 4;
		contentPane.add(Button7, gbc_Button7);
		
		JButton Button8 = new JButton("下");
		Button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.g=8;
			}
		});
		GridBagConstraints gbc_Button8 = new GridBagConstraints();
		gbc_Button8.insets = new Insets(0, 0, 0, 5);
		gbc_Button8.gridx = 1;
		gbc_Button8.gridy = 4;
		contentPane.add(Button8, gbc_Button8);
		
		JButton Button9 = new JButton("設定");
		Button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.g=9;
			}
		});
		GridBagConstraints gbc_Button9 = new GridBagConstraints();
		gbc_Button9.gridx = 2;
		gbc_Button9.gridy = 4;
		contentPane.add(Button9, gbc_Button9);
		
	
	}

}
