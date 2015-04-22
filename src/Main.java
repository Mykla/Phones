/**
 * Created by user on 22.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        SamsungS4 mySamsung = new SamsungS4();
        Nokia3310 myNokia = new Nokia3310();

        mySamsung.call("0957945618");
        mySamsung.call("0957933618");
        mySamsung.sendSMS("0957943318","Kyiv!");
        mySamsung.sendSMS("0957943318","Dnepr!");
        mySamsung.sendSMS("0957943318","Sumy!");

        myNokia.call("123121");
        myNokia.call("123121");
        myNokia.call("123121");
        myNokia.call("123121");

        myNokia.sendSMS("Sumy!", "0957943318");
        myNokia.sendSMS("Sumy!", "0957943318");

        System.out.println("SamsungS4 send SMS: " + mySamsung.countSMS);
        System.out.println("SamsungS4 made calls: " + mySamsung.countCall);

        System.out.println("Nokia3310 send SMS: " + myNokia.countSMS);
        System.out.println("Nokia3310 made calls: " + myNokia.countCall);
    }
}
