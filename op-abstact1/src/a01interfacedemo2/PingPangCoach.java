package a01interfacedemo2;

public class PingPangCoach extends Coach implements English{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练正在教乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在学习说英语");
    }
}
