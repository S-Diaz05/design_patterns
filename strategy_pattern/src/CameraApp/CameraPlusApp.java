package CameraApp;

import CameraApp.Share.ShareByText;
import CameraApp.Share.SharingBehavior;

public class CameraPlusApp extends PhoneCameraApp{
    @Override
    public void edit() {

    }
    
    public void setSharingBehavior() {
        super.setSharingBehavior(new ShareByText());
    }
}
