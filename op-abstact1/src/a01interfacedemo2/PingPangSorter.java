package a01interfacedemo2;

public class PingPangSorter extends Sporter implements English{
    public PingPangSorter() {
    }

    public PingPangSorter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {

        System.out.println("乒乓球运动员在说英语");
    }

    @Override
    public void study() {

        System.out.println("乒乓球运动员在学习如何打乒乓球");
    }
}
