package com.sun.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 单位是毫秒
 * 
 * @author google
 *
 */
public class TimerLearn {
	public static void main(String[] args) {

		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println(1);
			}
		}, 5000);

		new Timer().schedule(new TimerTask() {

			@Override
			public void run() {

				System.out.println("23");
			}
		}, 4000, 5000);
	}
}
