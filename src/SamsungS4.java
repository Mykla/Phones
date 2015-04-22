/**
 * Написать класс наследник SamsungS4 с диагональю
 * экрана 5 дюймов, поддержкой Wifi и методом отправки
 * SMS, который будет дописывать к сообщению слово “Hello”.
 * Created by user on 22.04.2015.
 */
public class SamsungS4 extends Phone {

    public SamsungS4(){
//        System.out.println("SamsungS4 constructor");

        touch = false;
        hasWifi = true;
        screenSize = 5;

    }

    @Override
    final public void call(String number){
        super.call(number);
        System.out.println("SamsungS4 class is calling " + number);
        countCall++;
    }

    @Override
    public void sendSMS(String number, String message){
        System.out.println("SamsungS4 sending SMS: " + "Hello, " + number + " from " + message);
        countSMS++;
    }


}
