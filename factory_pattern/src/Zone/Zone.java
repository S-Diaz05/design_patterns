package Zone;

public abstract class Zone {
    private String displayName;
    private String offset;
    private String id;

    public String getDisplayName(){
        return  displayName;
    }
    public  String getOffset(){
        return offset;
    }

    public String getId() {
        return id;
    }

    public void setId(String id1){
        id = id1;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }
}
