import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class GUILearning {
	public static void main(String[] args) {
		JLabel label1=new JLabel();
		Border borda=BorderFactory.createLineBorder(Color.red,5);
		ImageIcon image=new ImageIcon("Screenshot 2024-06-02 015241.png");
		
		label1.setText("Ahhhh?????????");
		//or JLabel label=new Jlabel("Pass in Parameters of text here");
		label1.setIcon(image);
		//set icon for the app
		label1.setHorizontalTextPosition(JLabel.CENTER);
		//self explanatory
		label1.setVerticalTextPosition(JLabel.TOP);
		//self explanatory
		label1.setForeground(new Color(113,118,221));
		//set color of text
		label1.setFont(new Font("MV Boli",Font.BOLD,40));
		//set font style, font properties(Bold,Italic etc
		label1.setIconTextGap(50);
		//set the gap between text and image
		label1.setBackground(Color.black);
		//self explanatory
		label1.setOpaque(true);
		//display background color if true 透明度
		label1.setBorder(borda);
		//self explanatory
		label1.setVerticalAlignment(JLabel.CENTER);
		//self explanatory
		label1.setHorizontalAlignment(JLabel.CENTER);
		//self explanatory
		//label1.setBounds(100,100,350,350);
		//the (x,y,length,width)
		
		
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("First World App");
		frame.setResizable(true);
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.add(label1);
		//frame.setLayout(null);
		ImageIcon icon=new ImageIcon("Screenshot 2024-06-02 015241.png");
		frame.setIconImage(icon.getImage());
		frame.pack();
		frame.getContentPane().setBackground(new Color(178,173,171));
		
//		GUILearning2 theFrame=new GUILearning2();
		
		
		
	}
	
}
