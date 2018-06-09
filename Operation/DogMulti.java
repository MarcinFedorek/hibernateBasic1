package App.Operation;

import App.Dog;
import App.DogDao;

import java.util.List;

public class DogMulti {

  public static void main(String[] args) {
    List<Dog> dogs = DogDao.readAll();
    for (Dog dog:dogs){
      System.out.println(dog);
    }
  }
}
