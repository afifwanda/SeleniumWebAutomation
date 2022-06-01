package webAutomation.portofolio;

public class Utils {
	public static void hardWait(int second) {
		try {
			Thread.sleep(second*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
