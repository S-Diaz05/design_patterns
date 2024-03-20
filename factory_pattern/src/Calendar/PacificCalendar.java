package Calendar;

import Calendar.Calendar;
import Zone.Zone;
import Zone.ZoneFactory;

public class PacificCalendar extends Calendar {
    Zone zone;
    @Override
    public void createCalendar() {
        ZoneFactory zoneFactory = new ZoneFactory();
        this.zone = zoneFactory.CreateZone("Pacific");
        print();
    }
    public void print(){
        System.out.println("Zone: " + this.zone.getDisplayName() + " Offset: " + this.zone.getOffset());
    }



}
