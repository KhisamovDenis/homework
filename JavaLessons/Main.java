package JavaLessons;

import JavaLessons.lesson2.Bus;
import JavaLessons.lesson2.Dogs;
public class Main {
    public static void main(String[] args){

        Bus ourBus = new Bus();
        Bus firstBus = new Bus();
        Bus secondBus = new Bus();

        ourBus.color = "Green";
        firstBus.color = "Red";
        secondBus.color = "Black";

        ourBus.model = "BMW";
        firstBus.model = "Audi";
        secondBus.model = "Wolkswagen";

        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();

        Dogs myDog = new Dogs();
        Dogs herDog = new Dogs();
        Dogs hisDog = new Dogs();

      myDog.breed =  "Shiba";
      herDog.breed = "Huski";
      hisDog.breed = "Colly";

      myDog.cost =  " - 3400 rmb";
      herDog.cost = " - 3300 rmb";
      hisDog.cost = " - 2300 rmb";

      myDog.age =  " - 2 month";
      herDog.age = " - 1 year";
      hisDog.age = " - 9 month";

      myDog.showbreed();
      herDog.showbreed();
      hisDog.showbreed();




    }
}
