package com.pjects.dbcp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pjects.dbcp.frames.DemoFrame;

@Component
public class Runner implements CommandLineRunner {

    /**
     * Pull in the JFrame to be displayed.
     */
    @Autowired
    private DemoFrame frame;

    @Override
    public void run(String... args) throws Exception {
        /* display the form using the AWT EventQueue */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                frame.setVisible(true);
            }
        });
    }

}