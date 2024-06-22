package entities;

public class Person {

    // Attributes
    private String name;
    private int age;
    private double height;

    // Constructor
    public Person(String name, int age, double height){
        this.name= name;
        this.age = age;
        this.height = height;
    }

    // Getters e Setters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }

    // Methods
    public static double calculateAverageHeight(Person[] person) {
        double sum = 0.0;
        for(int i=0; i<person.length; i++) {
            sum += person[i].getHeight();
        }
        return sum/person.length;
    }
    public static double calculatePercentageUnder16(Person[] person) {
        int count = 0;
        for(int i=0; i<person.length; i++) {
            if(person[i].getAge() < 16) {
                count++;
            }
        }
        return count * 100.0 / person.length;
    }

}
