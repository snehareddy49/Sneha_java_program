package java_project;
class Animal_1 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog_ extends Animal_1 {
    void sound() {
        System.out.println("Dog barks");
    }
    
public class task15 {
  
 public static void main(String[] args) {
         Animal_1 a = new Dog_();
         a.sound();
     }
 }

} 