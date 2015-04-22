/**
 * Created by user on 22.04.2015.
 */
public abstract class Phone {
    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize;
    protected int countCall;
    protected int countSMS;

    public Phone() {
        //System.out.println("Phone constructor");
        this.countCall = 0;
        this.countSMS = 0;
    }

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void call(String number) {
        System.out.println("Phone class is calling " + number);
    }

    public abstract void sendSMS(String number, String message);

}
