package App.Operation;

import App.Dog;
import App.DogDao;

public class DogUpdater {

  public static void main(String[] args) {

    Dog dog = new Dog();
    dog.setAge(1);
    dog.setName("Reksio");
    DogDao.updateDog(3L,dog);

  }
}
