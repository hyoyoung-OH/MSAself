public class RemoteControlExample {
    public static void main(String[] args) {

//인터체이스 변수 선언
        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
    }
}
