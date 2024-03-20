package CameraApp.Share;

public class ShareByEmail implements SharingBehavior{
    @Override
    public void share() {
        System.out.println("Sharing by email");
    }
}
