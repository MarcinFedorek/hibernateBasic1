package App.Operation;

import App.DogDao;

public class removeDog {
  public static void main(String[] args) {
    DogDao.deleteDog(2L);
  }
}
