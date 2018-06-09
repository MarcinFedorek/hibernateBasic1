package App;

import org.hibernate.Session;

import java.util.List;

public class DogDao {


  //Crud create, read, update, delete


  public static void addDog(Dog dog) {
    Session session = HibernateFactory.getSessionFactory().openSession();
    session.beginTransaction();
    session.save(dog);
    session.getTransaction().commit();
    session.close();
  }

  public static Dog getDog(Long id) {
    Session session = HibernateFactory.getSessionFactory().openSession();
    Dog dog = (Dog) session.get(Dog.class, id);

    session.close();
    return dog;
  }

  public static List<Dog> readAll(){
    Session session = HibernateFactory.getSessionFactory().openSession();
    List<Dog> dogs = session.createQuery("FROM Dog").list();
    session.close();
    System.out.println("Found"+" "+dogs.size()+" "+"Dogs");
    return dogs;
  }

  public static void deleteDog(Long dogId){
    Session session = HibernateFactory.getSessionFactory().openSession();
    session.beginTransaction();
    Dog dog = getDog(dogId);
    session.delete(dog);
    session.getTransaction().commit();
    session.close();
  }

  public static void updateDog(Long dogId, Dog newDog) {
    Session session = HibernateFactory.getSessionFactory().openSession();
    session.beginTransaction();
    Dog dog = getDog(dogId);
    dog.setName(newDog.getName());
    dog.setAge(newDog.getAge());
    session.update(dog);
    session.getTransaction().commit();
    session.close();
  }
}
