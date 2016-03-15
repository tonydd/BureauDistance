/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.awt.event.MouseEvent;
import java.rmi.*;

/**
 *
 * @author Thomas STOCKER
 */
public interface IMouseInformation {
    
    public MouseEvent getMouseEvent() throws RemoteException;
}
