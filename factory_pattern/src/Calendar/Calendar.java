package Calendar;

import Zone.Zone;

public abstract class Calendar {
    private Zone zone;

    public void print(){
        System.out.println("Zone");
    }
    public abstract void createCalendar();
}
