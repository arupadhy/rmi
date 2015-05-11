package com.home.arvind.rmi;

import java.rmi.RemoteException;

import com.arvind.homw.AddService;
public class AddServiceImpl implements AddService{

	@Override
	public int add(int a, int b) throws RemoteException {
		
		System.out.println("inside the service implemntation to add two numbers...");
		return a+b;
	}

}
