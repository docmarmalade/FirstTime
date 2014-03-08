package timedisplay;

import java.util.*;
import java.text.*;

public class TimeShow {

	public static void main(String[] args) {

		Date tshow = new Date();
		SimpleDateFormat timer = new SimpleDateFormat("hh:mm:ss a zzz");
		
		System.out.println(timer.format(tshow));
		
	} //end main

} //end class
