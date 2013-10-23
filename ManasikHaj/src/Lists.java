import java.io.IOException;

import javax.microedition.midlet.MIDlet;

import com.sun.lwuit.Button;
import com.sun.lwuit.Component;
import com.sun.lwuit.Form;
import com.sun.lwuit.Image;
import com.sun.lwuit.List;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.CoordinateLayout;
import com.sun.lwuit.list.ListCellRenderer;
import com.sun.lwuit.plaf.Style;

public class Lists extends Form implements ListCellRenderer {
	String bgimg;
	Button[] buttons;
	Form f;
	
	public Lists() {
		// TODO Auto-generated constructor stub
		this.show();
	}
	public Lists(String[] btns, String bg, String[][] imageviewerArr,
			final MIDlet miDlet) {
		// TODO Auto-generated constructor stub
		this.bgimg = bg;
		this.setTitle("Manasik");
		setLayout(new CoordinateLayout(getWidth(), getHeight()));
		try {
			Manasik.commands(miDlet, this);
			getStyle().setBgImage(Image.createImage(bg));

			final Style st = new Style();
			st.setBgTransparency(1);
			int y = 100;
			buttons = new Button[btns.length];
			for (int i = 0; i < btns.length; i++) {
				try {
					buttons[i] = new Button(Image.createImage(btns[i]));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				buttons[i].getStyle().setBgTransparency(0);
				buttons[i].setX(12);
				buttons[i].setY(y);
				buttons[i].setUnselectedStyle(st);
				buttons[i].setSelectedStyle(st);
				buttons[i].setPressedStyle(st);
				buttons[i].getPressedStyle().setPadding(0, 0, 0, 0);
				buttons[i].getPressedStyle().setMargin(0, 0, 0, 0);

				final String[] ImageOfBtn = new String[imageviewerArr[i].length];
				y += 65;
				for (int j = 0; j < imageviewerArr[i].length; j++) {
					String m = imageviewerArr[i][j];
					ImageOfBtn[j] = m;
				}

				buttons[i].addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						new ImageDisplayer(ImageOfBtn, bgimg, miDlet).show();
					}
				});

				addComponent(buttons[i]);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public Component getListCellRendererComponent(List list, Object value,
			int index, boolean isSelected) {
		// TODO Auto-generated method stub
		buttons[index].setIcon((Image) value);
		return this;
	}

	public Component getListFocusComponent(List arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
