package com.opendevup;

import java.util.Timer;

public class SchedulerCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Timer timer = new Timer();
		SchedulerMain scMain = new SchedulerMain();
		
		timer.scheduleAtFixedRate(scMain, 0, 5000);
	}

}
