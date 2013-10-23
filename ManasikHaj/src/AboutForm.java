
import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.Image;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.plaf.Style;

public class AboutForm extends Form {

	AboutForm() {
		try {
			this.setTitle("About");
			Style formStyle = this.getStyle();
			formStyle.setBgImage(Image.createImage("/About_.jpg"));
			Command back = new Command("back") {
				public void actionPerformed(ActionEvent evt) {
					// TODO Auto-generated method stub
					super.actionPerformed(evt);
					Lists list = new Lists(Manasik.imageArr2, "/manasikHaj.jpg",
							Manasik.arr2,Manasik.miDlet);
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
