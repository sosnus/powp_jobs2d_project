package edu.kis.powp.command;

//import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.MyAdapter;

public class SetPositionCommand implements DriverCommand {
    public void execute()
    {
        MyAdapter.setPosition();
    }

    private int x;
    private int y;

}
