package Random;

public class Cat {

    private double weight;
    private String name;
    private int age;
    private String color;

    //����������� �� ���������
    public Cat() {
        this(3000, "Barsik", 0, "Blue");
    }

    //�����������, ����������� ���������
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //����� �� ��������!
        if (age > this.age)
            this.age = age;
    }

    public String getColor() {
        return color;
    }
    //����� ������ ��� ��������
    public void setColor(String color) {
        this.color = color;
        //� ��� �������
        meow(); meow(); meow();
    }
    public void meow() {
        System.out.println("Meow");
    }

    private void pee() {
        weight -= 20;
    }

    public void eat() {
        weight += 50;
        //���� �������� ���� �������, ���� ����
        if (50 / weight > .01)
            pee();
    }
}