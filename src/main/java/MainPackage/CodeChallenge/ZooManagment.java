package MainPackage.CodeChallenge;

public class ZooManagment
{
    public static void main(String [] args)
    {
       Zoo zoo =new Zoo();
       IAnimal tiger = new Animal(1,"Mammals", "Tiger", "6");
        IAnimal whale = new Animal(2,"Mammals", "Whale", "8");
        IAnimal cat = new Animal(3,"Mammals", "Cat", "3");
       zoo.addAnimal(tiger);
        zoo.addAnimal(whale);
        zoo.addAnimal(cat);

        System.out.println("There are " + zoo.countAnimals() + " animals in the Zoo.");

        zoo.removeAnimal(1);
        System.out.println("There are " + zoo.countAnimals() + " animals in the Zoo after removal.");

    }
}
