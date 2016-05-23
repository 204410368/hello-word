import java.awt.BorderLayout;

import javax.swing.JFrame;

public class DrawFrame extends JFrame{

	public DrawFrame(){
		super();
		DrawPanel drawPanel = new DrawPanel();
		add(drawPanel, BorderLayout.CENTER);
	}
}
