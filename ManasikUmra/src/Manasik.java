import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

import com.sun.lwuit.Command;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Image;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.plaf.Style;

public class Manasik extends MIDlet {

	
	static MIDlet miDlet;

	static String[] imageArr = { "/btn1_list1.png", "/btn2_list1.png",
			"/btn3_list1.png", "/btn4_list1.png", "/btn5_list1.png" };
	static String[][] arr = {
			{ "/elMadenaMekat.png", "/MekatElShamt.png", "/MekartElErak.png",
					"/mekatNagd.png", "/mekatElYman.png", "/maka.png",
					"/planeMekat.png" },
			{ "/person_man_woman.png", "/moba7at.png", "/ma7zorat.png",
					"/doaaEhram.png" },
			{ "/ka3ba.png", "/ka3ba2.png", "/tawaf.png", "/tawaf_ka3ba.png",
					"/ka3ba_sala.png", "/doaa2_ka3ba.png", "/doaa1_haram.png" },
			{ "/elsa3y.png" }, { "/el7alkWelTakser.png" }

	};

		public Manasik() {
		// TODO Auto-generated constructor stub

	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() throws MIDletStateChangeException {
		// TODO Auto-generated method stub
		Display.init(this);
		final Style st = new Style();
		st.setBgTransparency(1);
		try {
			new Lists(imageArr, "/manasikUmrah.jpg", arr, Manasik.this).show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void commands(final MIDlet miDlet, Form f) {
		try {
			Image aboutIcon = Image.createImage("/about.png");
			final Command EXIT_COMMAND = new Command("Exit");
			final Command HELP_COMMAND = new Command("Help");
			final Command ABOUT_COMMAND = new Command("About", aboutIcon);

			f.addCommandListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {
					if (ae.getCommand().equals((Command) EXIT_COMMAND)) {
						miDlet.notifyDestroyed();
					} else if (ae.getCommand().equals((Command) ABOUT_COMMAND)) {
						new AboutForm();
					} else if (ae.getCommand().equals((Command) HELP_COMMAND)) {
						new HelpForm();
					}
				}
			});

			f.addCommand(EXIT_COMMAND);
			f.addCommand(HELP_COMMAND);
			f.addCommand(ABOUT_COMMAND);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
