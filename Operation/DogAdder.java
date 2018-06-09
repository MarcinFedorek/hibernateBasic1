package App.Operation;

import App.Dog;
import App.DogDao;

public class DogAdder {

  public static void main(String[] args) {



    Dog dog = new Dog();
    dog.setAge(2);
    dog.setName("Azor");

    DogDao.addDog(dog);


  }
}
