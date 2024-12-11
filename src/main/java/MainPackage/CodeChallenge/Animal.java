package MainPackage.CodeChallenge;

public class Animal implements IAnimal
{
    int id ;
    String species;
    String name;
    String age;

    Animal(int id,String species,String name,String age)
    {
        this.id=id;
        this.species=species;
        this.name=name;
        this.age=age;
    }


    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAge() {
        return age;
    }
}
