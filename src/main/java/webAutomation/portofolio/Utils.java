package webAutomation.portofolio;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class Utils {
	public static void hardWait(int second) {
		try {
			Thread.sleep(second*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String mailRandomGenerator(Long n1, Long n2) {
		Random r = new Random();
		
		char c = (char)(r.nextInt(26) + 'a');
		char a = (char)(r.nextInt(23) + 'c');
		String result = "test"+a+ThreadLocalRandom.current().nextLong(n1, n2 + 1)+c+"@mail.com";
  
		return result; 
	}
}
