public interface RemoteControl {
    //상수
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    //추상메소드
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    //디폴트메소드 무음처리 제공
    default void setMute(boolean mute){
        if (mute) {
            System.out.println("무음 처리합니다");
        } else {
            System.out.println("무음 해제합니다");
        }
    }
    //정적메소드 배터리 교체 기능
    static void ChangeBattery() {
        System.out.println("건전지를 교체합니다");
    }
}
