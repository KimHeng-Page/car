package oop;
public class inheritan {
    public static class Person{
        String name;
        int age;
        String address;
        double height;

        public  Person(){

        }

        public Person(String name, int age, String address, double height){
            this.name = name;
            this. age = age;
            this.address = address;
            this.height = height;
        }

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

        public void display(){
            System.out.println("Person Class");
        }

    }
    public static void main(String[] args){
        System.out.println("hello");
    }
}
