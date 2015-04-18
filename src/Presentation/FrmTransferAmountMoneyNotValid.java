package Presentation;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JMenu;
import java.awt.Rectangle;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import java.awt.Point;

import javax.swing.JButton;

import Bussiness.TransferHistoryBIZ;
import Commons.UIMessage;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FrmTransferAmountMoneyNotValid extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu mnfile = null;
	private JMenuItem mnLogin = null;
	private JMenuItem mnExit = null;
	private JMenu help = null;
	private JMenuItem mnAbout = null;
	private JButton btnEnter = null;
	private JButton btnExit = null;
	private JButton btn2 = null;
	private JButton btn3 = null;
	private JButton btn4 = null;

	private JButton btn1 = null;
	private JButton btnClear = null;
	private JButton btn5 = null;
	private JButton btn6 = null;
	private JButton btn7 = null;
	private JButton btn8 = null;
	private JButton btn9 = null;
	private JButton btn0 = null;
	private JButton btnInsert = null;
	private JButton btnPrint = null;
	private JPanel jPanel1 = null;
	private JButton btnSelect1 = null;
	private JButton btnSelect2 = null;
	private JButton btnSelect3 = null;
	private JButton btnSelect4 = null;
	private JButton btnSelect5 = null;
	private JButton btnSelect6 = null;
	private JLabel lblMessage = null;
	private JLabel lblContinue = null;
	private JLabel lblCancel = null;
	private JLabel lblAsk = null;

	/**
	 * This is the default constructor
	 */
	public FrmTransferAmountMoneyNotValid(String message, String cardID) {
		super();
		initialize();
		this.cardID = cardID;
		this.message = message;
		lblMessage.setText(message);
	}

	String cardID;
	String message;

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(709, 533);
		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(getJContentPane());
		this.setTitle("TransferMoney");
	}

	String addText(String str, String btnText) {
		if (str.length() < 13)
			return str + btnText;
		else
			return str;
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getBtnReset(), null);
			jContentPane.add(getBtnExit(), null);
			jContentPane.add(getBtn2(), null);
			jContentPane.add(getBtn3(), null);
			jContentPane.add(getBtn4(), null);
			jContentPane.add(getBtn1(), null);
			jContentPane.add(getBtnClear(), null);
			jContentPane.add(getBtn5(), null);
			jContentPane.add(getBtn6(), null);
			jContentPane.add(getBtn7(), null);
			jContentPane.add(getBtn8(), null);
			jContentPane.add(getBtn9(), null);
			jContentPane.add(getBtn0(), null);
			jContentPane.add(getBtnInsert(), null);
			jContentPane.add(getBtnPrint(), null);
			jContentPane.add(getJPanel1(), null);
			jContentPane.add(getBtnselect1(), null);
			jContentPane.add(getBtnselect2(), null);
			jContentPane.add(getBtnselect3(), null);
			jContentPane.add(getBtnselect4(), null);
			jContentPane.add(getBtnselect5(), null);
			jContentPane.add(getBtnSelect6(), null);

		}
		return jContentPane;
	}

	/**
	 * This method initializes jJMenuBar
	 * 
	 * @return javax.swing.JMenuBar
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getMnfile());
			jJMenuBar.add(getHelp());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes mnfile
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getMnfile() {
		if (mnfile == null) {
			mnfile = new JMenu();
			mnfile.setText("File");
			mnfile.add(getMnLogin());
			mnfile.add(getMnExit());
		}
		return mnfile;
	}

	/**
	 * This method initializes mnLogin
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMnLogin() {
		if (mnLogin == null) {
			mnLogin = new JMenuItem();
			mnLogin.setText("Login");
		}
		return mnLogin;
	}

	/**
	 * This method initializes mnExit
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMnExit() {
		if (mnExit == null) {
			mnExit = new JMenuItem();
			mnExit.setText("Exit");
			mnExit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					FrmTransferAmountMoneyNotValid.this.dispose();
				}
			});
		}
		return mnExit;
	}

	/**
	 * This method initializes help
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getHelp() {
		if (help == null) {
			help = new JMenu();
			help.setText("Help");
			help.add(getMnAbout());
		}
		return help;
	}

	/**
	 * This method initializes mnAbout
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMnAbout() {
		if (mnAbout == null) {
			mnAbout = new JMenuItem();
			mnAbout.setText("About");
		}
		return mnAbout;
	}

	/**
	 * This method initializes btnReset
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnReset() {
		if (btnEnter == null) {
			btnEnter = new JButton();
			btnEnter.setText("Enter");
			btnEnter.setSize(new Dimension(80, 57));
			btnEnter.setLocation(new Point(465, 392));
			btnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {

				}
			});
		}
		return btnEnter;
	}

	/**
	 * This method initializes btnExit
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton();
			btnExit.setLocation(new Point(463, 327));
			btnExit.setText("Cancel");
			btnExit.setSize(new Dimension(80, 57));
			btnExit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					FrmTransferAmountMoneyNotValid.this.dispose();
				}
			});
		}
		return btnExit;
	}

	/**
	 * This method initializes btn2
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtn2() {
		if (btn2 == null) {
			btn2 = new JButton();
			btn2.setLocation(new Point(289, 264));
			btn2.setText("2");
			btn2.setSize(new Dimension(70, 43));
			btn2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

				}
			});
		}
		return btn2;
	}

	/**
	 * This method initializes btn3
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtn3() {
		if (btn3 == null) {
			btn3 = new JButton();
			btn3.setLocation(new Point(370, 264));
			btn3.setText("3");
			btn3.setSize(new Dimension(70, 43));
			btn3.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

				}
			});
		}
		return btn3;
	}

	/**
	 * This method initializes btn4
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtn4() {
		if (btn4 == null) {
			btn4 = new JButton();
			btn4.setLocation(new Point(207, 315));
			btn4.setText("4");
			btn4.setSize(new Dimension(70, 43));
			btn4.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

				}
			});
		}
		return btn4;
	}

	/**
	 * This method initializes btn1
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton();
			btn1.setLocation(new Point(207, 265));
			btn1.setText("1");
			btn1.setSize(new Dimension(70, 43));
			btn1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

				}
			});
		}
		return btn1;
	}

	/**
	 * This method initializes btnClear
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton();
			btnClear.setLocation(new Point(463, 263));
			btnClear.setText("Clear");
			btnClear.setSize(new Dimension(80, 57));
			btnClear.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

				}
			});
		}
		return btnClear;
	}

	/**
	 * This method initializes btn5
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtn5() {
		if (btn5 == null) {
			btn5 = new JButton();
			btn5.setLocation(new Point(290, 315));
			btn5.setText("5");
			btn5.setSize(new Dimension(70, 43));
			btn5.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

				}
			});
		}
		return btn5;
	}

	/**
	 * This method initializes btn6
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtn6() {
		if (btn6 == null) {
			btn6 = new JButton();
			btn6.setLocation(new Point(371, 314));
			btn6.setText("6");
			btn6.setSize(new Dimension(70, 43));
			btn6.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

				}
			});
		}
		return btn6;
	}

	/**
	 * This method initializes btn7
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtn7() {
		if (btn7 == null) {
			btn7 = new JButton();
			btn7.setLocation(new Point(208, 364));
			btn7.setText("7");
			btn7.setSize(new Dimension(70, 43));
			btn7.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

				}
			});
		}
		return btn7;
	}

	/**
	 * This method initializes btn8
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtn8() {
		if (btn8 == null) {
			btn8 = new JButton();
			btn8.setLocation(new Point(290, 364));
			btn8.setText("8");
			btn8.setSize(new Dimension(70, 43));
			btn8.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

				}
			});
		}
		return btn8;
	}

	/**
	 * This method initializes btn9
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtn9() {
		if (btn9 == null) {
			btn9 = new JButton();
			btn9.setLocation(new Point(372, 364));
			btn9.setText("9");
			btn9.setSize(new Dimension(70, 43));
			btn9.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

				}
			});
		}
		return btn9;
	}

	/**
	 * This method initializes btn0
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtn0() {
		if (btn0 == null) {
			btn0 = new JButton();
			btn0.setLocation(new Point(290, 412));
			btn0.setText("0");
			btn0.setSize(new Dimension(70, 43));
			btn0.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

				}
			});
		}
		return btn0;
	}

	/**
	 * This method initializes btnInsert
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnInsert() {
		if (btnInsert == null) {
			btnInsert = new JButton();
			btnInsert.setBounds(new Rectangle(568, 415, 106, 26));
			btnInsert.setText("Insert Card");
		}
		return btnInsert;
	}

	/**
	 * This method initializes btnPrint
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnPrint() {
		if (btnPrint == null) {
			btnPrint = new JButton();
			btnPrint.setLocation(new Point(563, 45));
			btnPrint.setText("PrintBill");
			btnPrint.setSize(new Dimension(106, 26));
		}
		return btnPrint;
	}

	/**
	 * This method initializes jPanel1
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			lblMessage = new JLabel();
			lblMessage.setBounds(new Rectangle(30, 26, 260, 50));
			lblMessage.setFont(new Font("Dialog", Font.BOLD, 16));
			lblMessage.setBackground(Color.lightGray);

			lblAsk = new JLabel();
			lblAsk.setBounds(30, 30, 260, 100);
			lblAsk.setFont(new Font("Dialog", Font.BOLD, 12));
			lblAsk.setBackground(Color.lightGray);

			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.setBounds(new Rectangle(196, 50, 342, 195));
			jPanel1.setBackground(Color.lightGray);
			jPanel1.add(lblMessage, null);

			lblContinue = new JLabel();
			lblContinue.setText("Yes");
			// lblContinue.setBounds(170, 160, 100, 50);
			lblContinue.setBounds(300, 95, 260, 40);
			lblContinue.setFont(new Font("Dialog", Font.BOLD, 14));

			lblCancel = new JLabel();
			lblCancel.setText(" No");
			lblCancel.setBounds(300, 140, 260, 40);
			lblCancel.setFont(new Font("Dialog", Font.BOLD, 14));
			// lblCancel.setLocation(new Point(250, 100));
			jPanel1.add(lblCancel);
			jPanel1.add(lblContinue);
			jPanel1.add(lblAsk);

			
			lblAsk.setText(UIMessage.ASK);

		}
		return jPanel1;
	}

	/**
	 * This method initializes btnselect1
	 * 
	 * @return javax.swing.JButton
	 */

	private JButton getBtnselect1() {
		if (btnSelect1 == null) {
			btnSelect1 = new JButton();
			btnSelect1.setBounds(new Rectangle(84, 93, 88, 38));
			btnSelect1.setText(">>");
		}
		return btnSelect1;
	}

	/**
	 * This method initializes btnselect2
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnselect2() {
		if (btnSelect2 == null) {
			btnSelect2 = new JButton();
			btnSelect2.setLocation(new Point(84, 142));
			btnSelect2.setText(">>");
			btnSelect2.setSize(new Dimension(88, 38));
		}
		return btnSelect2;
	}

	/**
	 * This method initializes btnselect3
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnselect3() {
		if (btnSelect3 == null) {
			btnSelect3 = new JButton();
			btnSelect3.setLocation(new Point(84, 191));
			btnSelect3.setText(">>");
			btnSelect3.setSize(new Dimension(88, 38));
		}
		return btnSelect3;
	}

	/**
	 * This method initializes btnselect4
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnselect4() {
		if (btnSelect4 == null) {
			btnSelect4 = new JButton();
			btnSelect4.setLocation(new Point(560, 100));
			btnSelect4.setText("<<");
			btnSelect4.setSize(new Dimension(88, 38));
		}
		return btnSelect4;
	}

	/**
	 * This method initializes btnselect5
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnselect5() {
		if (btnSelect5 == null) {
			btnSelect5 = new JButton();
			btnSelect5.setLocation(new Point(561, 148));
			btnSelect5.setText("<<");
			btnSelect5.setSize(new Dimension(88, 38));
			btnSelect5.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {

					setVisible(false);
					ServiceATM frmMain = new ServiceATM(cardID);
					frmMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
					frmMain.setVisible(true);
				}

			});
		}
		return btnSelect5;
	}

	/**
	 * This method initializes btnselect6
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnSelect6() {
		if (btnSelect6 == null) {
			btnSelect6 = new JButton();
			btnSelect6.setLocation(new Point(561, 192));
			btnSelect6.setText("<<");
			btnSelect6.setSize(new Dimension(88, 38));
			btnSelect6.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {

					// TODO Auto-generated method stub
					lblMessage.setText(UIMessage.GET_CARD);
					lblCancel.setText("");
					lblContinue.setText("");
					lblAsk.setText("");
				}

			});
		}
		return btnSelect6;
	}

} // @jve:decl-index=0:visual-constraint="52,30"
