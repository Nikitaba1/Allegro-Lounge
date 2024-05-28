package com.Book_lounge.wenDriverUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Java_Utility {
	
		public int getRandomNumber() {
			Random random = new Random();
			int ranNum = random.nextInt(5000);
			return ranNum;
		}

		public String getSystemDateYYMMDD() {
			Date dObj = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(dObj);
			return date;
		}

		public String getRequiredDate(int days) {
			Date dobj = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat();
			String date = sdf.format(dobj);
			Calendar cal = sdf.getCalendar();
			System.out.println(date);
			cal.add(Calendar.DAY_OF_MONTH, days);
			String reqDate = sdf.format(cal.getTime());
			return reqDate;
		}

}
