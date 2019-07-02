package com.opendevup;

import java.io.IOException;
import java.util.Timer;

import com.opendevup.config.Configuration;

public class SchedulerCall {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Configuration conf = new Configuration();
		
		int freq = conf.getFrequence();

		Timer timer = new Timer();
		SchedulerMain scMain = new SchedulerMain();
		
		timer.scheduleAtFixedRate(scMain, 0, freq);
		
	}

}
