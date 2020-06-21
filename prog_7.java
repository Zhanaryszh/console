import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class prog_7 {
	public static Robot rob = null;

	public static void main(String[] args) {
		try {
			rob = new Robot();
		}
		catch (Exception e) {}
			
			JFrame wnd = new JFrame();
			wnd.setUndecorated(true);
			wnd.setAlwaysOnTop(true);
			wnd.setLocation(0, 0);
			wnd.setLayout(new FlowLayout());
			
			JButton[] btn = new JButton[5];
			for (int i = 0; i < 5; i++) {
				btn[i] = new JButton();
				btn[i].setName("b"+i);
				btn[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton b = (JButton)e.getSource();
	 					String name = b.getName();
	 					
	 					if (name.equals("b0")) {
	 						try {
	 							ProcessBuilder proc = new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","https://repl.it/");
	 									proc.start();
	 						}
	 						catch (Exception ex) {}
	 					}
	 					else if (name.contentEquals("b1")) {
	 						for (int i = 500; i>=0; i--) {     //C:\\Program Files (x86)\\Google
	 							rob.mouseMove(i, i);
	 							rob.delay(5);
	 						}
	 						rob.mouseMove(50, 30);
	 					}
	 					else if (name.equals("b2")) {
	 						try {
	 							ProcessBuilder proc = new ProcessBuilder("calc");
	 							proc.start();
	 						}
	 						catch (Exception ex) {}
	 						rob.delay(5000);
	 						
	 						rob.keyPress(KeyEvent.VK_ALT);
	 						rob.delay(100);
	 						rob.keyPress(KeyEvent.VK_F4);
	 						rob.delay(100);
	 						rob.keyPress(KeyEvent.VK_F4);
	 						rob.delay(100);
	 						rob.keyPress(KeyEvent.VK_ALT);
	 						rob.delay(100);
	 					
	 					}else if (name.equals("b3")) {
	 						for (int i = 0; i < 10; i++) {
	 							rob.keyPress(KeyEvent.VK_CAPS_LOCK);
	 							rob.delay(500);
	 							rob.keyRelease(KeyEvent.VK_CAPS_LOCK);
	 							rob.keyPress(KeyEvent.VK_NUM_LOCK);
	 							rob.delay(500);
	 							rob.keyRelease(KeyEvent.VK_NUM_LOCK);
	 							rob.keyPress(KeyEvent.VK_SCROLL_LOCK);
	 							rob.delay(500);
	 							rob.keyRelease(KeyEvent.VK_SCROLL_LOCK);
	 						}
	 					}else if (name.contentEquals("b4")) {
	 						System.exit(0);
	 					}
	 						
						
					}
				});
				wnd.add(btn[i]);
						
			}
			btn[0].setText("Browser");
			btn[1].setText("Mouse");
			btn[2].setText("Calcculator");
			btn[3].setText("Blinking");
			btn[4].setText("Exit");
			
			wnd.pack();
			wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			wnd.setVisible(true);
					
		}
		

	}


