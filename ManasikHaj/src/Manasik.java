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

	

	static String[] imageArr2 = { "/btn1_list1.png", "/btn2_list1.png",
			"/sa3ybtn.png", "/btn3_list2.png", "/btn4_list2.png",
			"/btn5_list2.png", "/btn6_list2.png", "/btn7_list2.png",
			"/sa3yElefadabtn.png", "/btn9_list2.png", "/btn10_list2.png" };
	static String[][] arr2 = {
			{ "/elMadenaMekat.jpg", "/MekatElShamt.jpg", "/MekartElErak.jpg",
					"/mekatNagd.jpg", "/mekatElYman.jpg", "/maka.jpg",
					"/planeMekat.jpg" },
			{ "/person_man_woman.jpg", "/moba7at.jpg", "/ma7zorat.jpg",
					"/doaaEhram.jpg" },
			{ "/ka3ba.jpg", "/ka3ba2.jpg", "/tawaf.jpg", "/tawaf_ka3ba.jpg",
					"/ka3ba_sala.jpg", "/doaa2_ka3ba.jpg", "/doaa1_haram.jpg",
					"/elsa3y.jpg" },
			{ "/mena.jpg" },
			{ "/arfat.jpg", "/arfat2.jpg" },
			{ "/mozdlfa.jpg", "/mozdlfa2.jpg" },
			{ "/rami_al_gamrat.jpg", "/rami_al_gamrat2.jpg",
					"/rami_al_gamrat3.jpg" },
			{ "/alzab7_w_al7alk.jpg", "/alzab7_w_al7alk2.jpg" },
			{ "/ka3ba.jpg", "/ka3ba2.jpg", "/tawaf.jpg", "/tawaf_ka3ba.jpg",
					"/ka3ba_sala.jpg", "/doaa2_ka3ba.jpg", "/doaa1_haram.jpg",
					"/elsa3y.jpg" },
			{ "/rami_al_talat_gamrat.jpg", "/rami_al_talat_gamrat2.jpg",
					"/rami_al_talat_gamrat3.jpg", "/rami_al_talat_gamrat4.jpg" },
			{ "/tawaf.jpg", "/tawaf_ka3ba.jpg" }

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
		new Lists(imageArr2, "/manasikHaj.jpg", arr2, Manasik.this).show();

		

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void commands(final MIDlet miDlet, Form f) {
		try {
			Image aboutIcon = Image.createImage("/about.jpg");
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
