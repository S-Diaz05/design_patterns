package Zone;

public class ZoneFactory {
    public Zone CreateZone(String zoneId){
        if(zoneId.equals("Central")){
            return new ZoneUSCentral();
        } else if (zoneId.equals("Eastern")) {
            return new ZoneUSEastern();
        } else if (zoneId.equals("Mountain")) {
            return new ZoneUSMountain();
        } else if (zoneId.equals("Pacific")) {
            return new ZoneUSPacific();
        }
        return null;
    }
}
