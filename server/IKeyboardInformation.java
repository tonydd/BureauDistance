/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.awt.event.KeyEvent;
import java.rmi.*;

/**
 *
 * @author Thomas STOCKER
 */
public interface IKeyboardInformation {
    
    public KeyEvent getKeyEvent() throws RemoteException;
    
}
