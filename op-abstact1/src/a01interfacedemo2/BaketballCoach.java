package a01interfacedemo2;

public class BaketballCoach extends Coach{
    public BaketballCoach() {
    }

    public BaketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练在教如何运球和投篮");
    }
}
