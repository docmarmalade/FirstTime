package timedisplay;

import java.util.Date;

	public class TimeShow{
	
		public static void main(String[] args)
		{
    
			try {
				while (true) {
					System.out.println(new Date());
					Thread.sleep(10 * 1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //end catch

		} //end main
	
	} //end class