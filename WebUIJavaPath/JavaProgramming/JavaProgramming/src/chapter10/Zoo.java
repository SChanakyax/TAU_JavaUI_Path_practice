package chapter10;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();


        Animal sa = new Dog();
        sa.makeSound();

        //change its type
     //   sa = new Cat(); //legal as cat is animal
     //   sa.makeSound();

        //sa is type animal not cat no access to scratch
       // ((Cat) sa).scratch();


        feed(sa);

    }
    public static void feed(Animal animal){
        if(animal instanceof Dog)
            System.out.println("here's ur dog food");
        else if (animal instanceof Cat) {
            System.out.println("here's cat food");
        }
    }


}
