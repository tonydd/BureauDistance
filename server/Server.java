/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author Tony
 */
public class Server {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);

            System.out.println("Mise en place du Security Manager ...");
            if (System.getSecurityManager() == null) {
                System.setSecurityManager(new RMISecurityManager());
            }

            //TODO : Implement our interface
            //InformationImpl informationImpl = new InformationImpl();

            String url = "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/TestRMI";
            System.out.println("Enregistrement de l'objet avec l'url : " + url);
            //TODO : Bind our Interface
            //Naming.rebind(url, informationImpl);

            System.out.println("Serveur lancé");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
