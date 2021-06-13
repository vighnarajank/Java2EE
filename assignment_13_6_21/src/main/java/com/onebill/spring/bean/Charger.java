package com.onebill.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

class Percentage{
	int percentage=0;
	String state;


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public synchronized void subPercentage() {
//		System.out.println("\nSubPercentage : " + state);
		if(state.contains("yes")) {
//			System.out.println("The plug state is "+ state +" from subPercentage");
			try {
//				System.out.println("Waiting to Un plug....");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
		this.percentage -= 1;
		if(percentage == 10) {
			System.out.println("Charge less than 10! Plug to charger...");
		}
		if(percentage == 0) {
			System.out.println("Phone Dead...");
			System.exit(0);
		}
//		System.out.println("Before sub Notify");
		notify();
//		System.out.println("After sub Notify");
	}
	}

	public synchronized void addPercentage() {
//		System.out.println("addPercentage : " + state);
		if(state.contains("no")) {
//			System.out.println("The plug state is "+ state +" from addPercentage()");
			try {
//				System.out.println("Waiting to Plug in....");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
		this.percentage += 1;
		if(percentage == 80) {
			System.out.println("You can unplug if needed. Charge above 80%");
		}
		else if(percentage == 100) {
			System.out.println("100% charged. You can unplug now");
		}
//		System.out.println("before add Notify");
		notify();
//		System.out.println("After add Notify");
	}
	}
	
}

class Charging implements Runnable{

	Percentage p;
	String state;

	public Charging(Percentage p, String state) {
		super();
		this.p = p;
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public void run() {
//		System.out.println("Entering Charging State");
		p.setState(state);
		while(p.percentage < 100) {
			p.setState(state);
			p.addPercentage();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public int getPercentage() {
		return p.percentage;
	}

	public void setPercentage(int percentage) {
		this.p.percentage = percentage;
	}

}

class NoCharging implements Runnable{

	Percentage p;
	String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public NoCharging(Percentage p, String state) {
		super();
		this.p = p;
		this.state = state;
	}

	@Override
	public void run() {
//		System.out.println("Entering Un Charging State");
		p.setState(state);
		while(true) {
			p.setState(state);
			p.subPercentage();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

@Component
@Qualifier("charger")
public class Charger {

	private String state;

	Percentage percent = new Percentage();
	Charging charg = new Charging(percent,state);
	NoCharging nocharg = new NoCharging(percent,state);
	Thread t1 = new Thread(charg);
	Thread t2 = new Thread(nocharg);

	public int getPercent() {
		System.out.println("Your Charge is " + percent.percentage + "%");
		return percent.percentage;
	}

	public void setPercent(Percentage percent) {
		this.percent = percent;
	}

	public Charging getCharg() {
		return charg;
	}

	public void setCharg(Charging charg) {
		this.charg = charg;
	}

	public NoCharging getNocharg() {
		return nocharg;
	}

	public void setNocharg(NoCharging nocharg) {
		this.nocharg = nocharg;
	}

	public void charging() {
		System.out.println("Charging State :" + getState());
		t1.start();
		t2.start();
		//		if(getState() == "yes") {
		//			
		//			if(!t1.isAlive()){
		//				System.out.println("t1 is alive : " + t1.isAlive());
		//				System.out.println("t2 is alive : " + t2.isAlive());
		//				t1.start();
		//			}
		//			percent.state = "yes";
		//		}
		//		else if(getState() == "no") {
		//			
		//			if(!t2.isAlive()) {
		//				System.out.println("t1 is alive : " + t1.isAlive());
		//				System.out.println("t2 is alive : " + t2.isAlive());
		//				t2.start();
		//			}
		//			percent.state = "no";
		//		}
	}

	public Charger(String state) {
		super();
		this.state = state;
	}

	public Charger() {
		super();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		charg.setState(getState());
		nocharg.setState(getState());
	}

	@Override
	public String toString() {
		return "Charger [state=" + state + "]";
	}

}
