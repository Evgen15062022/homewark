package allAnimals.birds;

public abstract class Animals {


    protected String name;
    protected int age;
    protected int weight;
    protected String color;

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
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say(){
        System.out.println("Я говорю");
    }

    public void go(){
        System.out.println("Я иду");
    }

    public void drink(){
        System.out.println("Я пью");
    }

    public void eat(){
        System.out.println("Я ем");
    }

    public String toString (){

    if (age == 1 || age == 2 || age == 3 || age == 4){
        return "Привет! Меня зовут " + name + ", мне " + age +
                " года, я вешу - " + weight + " кг, мой цвет - " + color;}
    else {return "Привет! Меня зовут " + name + ", мне " + age + " лет, " +
            "я вешу - " + weight + " кг, мой цвет - " + color;}

    }

}
