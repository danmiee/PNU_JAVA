
package com.ruby.java.ch02.date_221004;

public class FreeFall {

	int height;
	double g;

	public FreeFall() {

	}

	public FreeFall(int i) {
		// TODO Auto-generated constructor stub
		height = i;	
	}


	public void setheight(int i) {
		height = i;
	}

	public void setG(double g) {
		this.g = g;
	}

	public int getPosition(int t) {
		return (int)(height-g*t*t/2.0);
	}
}
