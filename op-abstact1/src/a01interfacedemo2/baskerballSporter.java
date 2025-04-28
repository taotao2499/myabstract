package a01interfacedemo2;

public class baskerballSporter extends Sporter {
    public baskerballSporter() {
    }

    public baskerballSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习如何打篮球");
    }
}
