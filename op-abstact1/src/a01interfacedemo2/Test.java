package a01interfacedemo2;

public class Test {
    public static void main(String[] args) {
        PingPangSorter pps = new PingPangSorter("张三", 20);
        System.out.println(pps.getName() + " " + pps.getAge());
        pps.speakEnglish();
        pps.study();
    }
}
