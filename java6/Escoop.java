package java6;

public class Escoop {
    class Student {
        // data member variables =? store data: name , gender, age, address
        // access modifier: public, private, protected, default
        private String name, address, password;
        private int age;
        private char gender;

        //constructor => Special Method: name the class name  [Optinal]

        //simpple method => activity: login, getInfo, getName, getAge, getAddress
        public String Name(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }
        
        public void Login(String name, String password){
            this.name = "Srun Kimheng";
            this.password = "usea#2006";
            if(this.name.equals(name) && this.password.equals(password)){

            }
        }
    }
    public class EcasOpp{
        public static void main(String[] args){

        }
    }
}
