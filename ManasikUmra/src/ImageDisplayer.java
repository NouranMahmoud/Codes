import java.io.IOException;

import javax.microedition.midlet.MIDlet;

import com.sun.lwuit.Command;
import com.sun.lwuit.Component;
import com.sun.lwuit.Form;
import com.sun.lwuit.Image;
import com.sun.lwuit.Label;
import com.sun.lwuit.List;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.layouts.CoordinateLayout;
import com.sun.lwuit.list.ListCellRenderer;

public class ImageDisplayer extends Form implements ListCellRenderer {
	Label label;
	String cond;

	public ImageDisplayer(String[] str, String condition, final MIDlet miDlet) {
		// TODO Auto-generated constructor stub
		this.cond = condition;
		this.setTitle("Manasik");
		setLayout(new CoordinateLayout(getWidth(), getHeight()));
		int y = 0;
		for (int i = 0; i < str.length; i++) {
			try {
				label = new Label(Image.createImage(str[i]));
				addComponent(label);
				label.getStyle().setBgTransparency(100);
				label.setX(0);
				label.setY(y);
				y += 342;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Command back = new Command("back") {
			public void actionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				super.actionPerformed(evt);
					Lists list = new Lists(Manasik.imageArr, "/manasikUmrah.jpg",
							Manasik.arr, miDlet);
					list.show();
				
			}
		};
		Manasik.commands(miDlet, this);
		setBackCommand(back);
		addCommand(back);

	}

	public Component getListCellRendererComponent(List list, Object value,
			int index, boolean isSelected) {
		// TODO Auto-generated method stub
		System.out.println(value);

		label.setIcon((Image) value);

		return label;
	}

	public Component getListFocusComponent(List arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
