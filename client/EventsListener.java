/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;

/**
 *
 * @author Thomas STOCKER
 */
public class EventsListener {
    private KeyAdapter keyAdapter;
    private MouseAdapter mouseAdapter;
    private MouseWheelListener mouseWheelListener;
    private MouseMotionAdapter mouseMotionAdapter;
    
    private ArrayList<KeyEvent> keyEvents = new ArrayList<KeyEvent>();
    private ArrayList<MouseEvent> mouseEvents = new ArrayList<MouseEvent>();
    
    public EventsListener () {
        //player = recorder.screenPlayer;

        keyAdapter = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                keyEvents.add(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                keyEvents.add(e);
            }
        };

        mouseWheelListener = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                mouseEvents.add(e);
            }
        };

        mouseMotionAdapter = new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                mouseEvents.add(e);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                 /*if (player.isSelecting) {
                    player.destx = e.getX ();
                    player.desty = e.getY ();
                 }*/
                 //else
                    mouseEvents.add(e);
            }
        };

        mouseAdapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                /*if (player.isSelecting) {
                    player.destx = player.srcx = e.getX ();
                    player.desty = player.srcy = e.getY ();
                }*/
                //else
                    mouseEvents.add(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                 //player.doneSelecting();
                 mouseEvents.add(e);
            }
        };
    }
}
