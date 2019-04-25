package edu.kis.powp.command;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class OperateToCommand  implements DriverCommand {
    public void execute()
    {
        DriverManager test = new DriverManager();
        test.setCurrentDriver(this.x,this.y); //replace xy to Driver
    }

    private int x;
    private int y;

}
