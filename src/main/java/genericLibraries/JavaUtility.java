package genericLibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This class contains reusable methods of java
 * @author jsp
 *
 */
public class JavaUtility {
	
	/**
	 * This method generates random number within the limit
	 * @param limit
	 * @return
	 */
	public int generateRandomNum(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
	}
	
	/**
	 * This method gets system time in specified format
	 * @return
	 */
	public String getCurrentTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yy_hh_mm_sss");
		return sdf.format(date);
	}

}
