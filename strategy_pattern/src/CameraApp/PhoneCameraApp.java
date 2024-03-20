package CameraApp;

import CameraApp.Share.SharingBehavior;

public abstract class PhoneCameraApp {

    private SharingBehavior sharingBehavior;
    public void setSharingBehavior(SharingBehavior sharingBehavior){
        this.sharingBehavior = sharingBehavior;
    }

    public SharingBehavior getSharingBehavior() {
        return sharingBehavior;
    }

    public void take(){
        System.out.println("Taking a photo");
    }
    public void save(){
        System.out.println("Saving the photo");
    }

    public abstract void edit();
}
