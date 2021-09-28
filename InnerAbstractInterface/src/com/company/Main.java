package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone myPhone;
	    myPhone = new DeskPhone(1234567);
	    myPhone.powerOn();
	    myPhone.callPhone(1234567);
	    myPhone.answer();

		myPhone = new MobilePhone(7654321);
		myPhone.powerOn();
		myPhone.callPhone(7654321);
		myPhone.answer();
    }
}
