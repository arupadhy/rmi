package com.home.arvind.rmi;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import com.arvind.homw.AddService;

public class RMIDemoServer {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		
		AddService rmiServer = new AddServiceImpl();
		
		AddService stub = (AddService)UnicastRemoteObject.exportObject(rmiServer, 8888);
		LocateRegistry.getRegistry().rebind("addService", stub);
		System.out.println("Rmi server object is ready for use now....");

	}

}
