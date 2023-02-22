public class Person {
    private int age;
    private double height;
    private double weight;
    public Person (int age,double height, double weight){
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public double BMI(){
        return (weight/(height*height));
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return  age;
    }

}
class checker {
    public static void main(String[] args) {
        Person p = new Person(19, 5,55);
        System.out.println(p.BMI());
        p.setAge(p.getAge()+1);
    }

}