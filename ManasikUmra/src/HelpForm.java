
import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.Image;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.plaf.Style;

public class HelpForm extends Form {
	public HelpForm() {
		// TODO Auto-generated constructor stub
		try {
			this.setTitle("Help");
			this.setLayout(new BorderLayout());
			Style helpStyle = this.getStyle();
			helpStyle.setBgImage(Image.createImage("/help.png"));
			Command back = new Command("back") {
				public void actionPerformed(ActionEvent evt) {
					// TODO Auto-generated method stub
					super.actionPerformed(evt);
					Lists list = new Lists(Manasik.imageArr, "/manasikUmrah.jpg",
							Manasik.arr,Manasik.miDlet);
					list.show();
				}
			};
			setBackCommand(back);
			addCommand(back);
			this.show();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
