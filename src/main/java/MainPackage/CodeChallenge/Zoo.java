package MainPackage.CodeChallenge;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements IZoo
{
    private List<IAnimal>animals=new ArrayList<>();
    @Override
    public void addAnimal(IAnimal animal)
    {
        animals.add(animal);

    }

    @Override
    public void removeAnimal(int id)
    {

        animals.removeIf(animal ->animal.getID()==id);

    }

    @Override
    public int countAnimals()
    {
      return animals.size();
    }

    @Override
    public List<IAnimal> getAnimalsBySpecies(String species)
    {
        List<IAnimal> result =new ArrayList<>();
        for(IAnimal animal: animals)
        {
            if(animal.getSpecies().equalsIgnoreCase(species))
            {
                result.add(animal);
            }
        }
        return result;

    }

    @Override
    public void getAanimalByAge(int age)
    {

    }


}
