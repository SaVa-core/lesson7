import java.util.Scanner;

public class Pipkin
{
    Scanner scanner = new Scanner(System.in);

    private int food;

    public Pipkin(int food)
    {
        this.food = food;
    }

    public void info()
    {
        System.out.println("Еды осталось: " + food);
    }

    public void decreaseFood(int animalHunger)
    {

        if (food < animalHunger)
        {
            System.out.println("Добавьте еды, кошечке нечего есть. Сколько добавить? ");
            int add = scanner.nextInt();
            food = add + food;
        }

          else
        {
            food = food - animalHunger;

        }
    }

    public int getFood()
    {
        return food;
    }
}