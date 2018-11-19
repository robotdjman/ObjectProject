package object.controller;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import object.model.VideoGameStats;

public class ObjectController
{
	public void start() {
		VideoGameStats[] Games = new VideoGameStats[5];
		ImageIcon[] icons = new ImageIcon[3];
		//Setup
		icons[0] = new ImageIcon(getClass().getResource("/object/view/diamond.png"));
		icons[1] = new ImageIcon(getClass().getResource("/object/view/butt.png"));
		icons[2] = new ImageIcon(getClass().getResource("/object/view/diamond.png"));
		for(int i = 0; i < Games.length; i++) {
			Games[i] = new VideoGameStats();
			
		}
		JOptionPane.showMessageDialog(null, "Memes", "Arrays", JOptionPane.INFORMATION_MESSAGE, icons[0]);
	}
}
