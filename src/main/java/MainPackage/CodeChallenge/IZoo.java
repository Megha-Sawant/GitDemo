package MainPackage.CodeChallenge;

import java.util.List;

public interface IZoo
{
     void addAnimal(IAnimal animal);

     void removeAnimal(int id);

     int countAnimals();

     List<IAnimal> getAnimalsBySpecies(String species);

     void getAanimalByAge(int age);

}
