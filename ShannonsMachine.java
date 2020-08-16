package shannon;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

//https://docs.oracle.com/javase/tutorial/uiswing/layout/using.html

public class ShannonsMachine {

	public static void main(String[] args) {
		JFrame frm = new JFrame("Shannon's Ultimate Machine");
		JPanel pnl = new JPanel();
		JButton btn = new JButton("Exit");
		JLabel lbl0 = new JLabel("<html><div style='text-align:center;'>The Ultimate Machine <br>conceptualized by Claude Shannon <br>is a machine whose sole purpose <br>is to switch itself off.</div></html>", SwingConstants.CENTER);
		//introduce on off switch
		pnl.setLayout(new BorderLayout());
		pnl.add(btn, BorderLayout.NORTH); 
		btn.setBounds(110, 100, 65, 30);
		pnl.add(lbl0, BorderLayout.CENTER);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frm.setLocation(dim.width/4, dim.height/4);
		frm.add(pnl);
		frm.setSize(300, 200);
		frm.setVisible(true);
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		MoveClick mover = new MoveClick();
		mover.mover(dim.width/4 +150, dim.height/4 +50, InputEvent.BUTTON1_MASK);
	}
	public void paint(Graphics g){
		//on off switch
	}
}
