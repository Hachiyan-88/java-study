package text.section_17;

public class Prctice_animal {
    private String name;
    private int age;

    public Prctice_animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Prctice_animal() {}

    // getter / setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 共通メソッド
    public void makeSound() {
        System.out.println("動物が鳴いています");
    }

    public void showInfo() {
        System.out.println("名前：" + name + "（年齢：" + age + "歳）");
    }
}
