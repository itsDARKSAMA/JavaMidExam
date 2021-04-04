
// Mid Exam java 2
// Abdelrahman Almajayda
// ucas ID = 120190071

public class Main {
    public static void main(String[] args) {

        // Objects && Variables
        Horse horse1 = new Horse();
        Horse horse2 = new Horse("Horse 2", 1000.5, 1500);
        Cow cow1 = new Cow();
        Cow cow2 = new Cow("Cow 2 ", 4300.32, 2500.5);
        Sheep sheep1 = new Sheep("Sheep 1", 530.23, 150.8);
        Sheep sheep2 = new Sheep();
        Animal [] animalsArray = new Animal[6]; // Array of Objects

        //Horse1 setting
        horse1.setAnimalName("Horse 1");
        horse1.setAnimalWeight(950);
        horse1.setAnimalPrice(1450);

        //Cow1 Setting
        cow1.setAnimalName("Cow 1");
        cow1.setAnimalWeight(4389.3);
        cow1.setAnimalPrice(2580);

        //Sheep2 Setting
        sheep2.setAnimalName("Sheep 2");
        sheep2.setAnimalWeight(500.20);
        sheep2.setAnimalPrice(130.6);

        animalsArray[0] = horse1;
        animalsArray[1] = horse2;
        animalsArray[2] = cow1;
        animalsArray[3] = cow2;
        animalsArray[4] = sheep1;
        animalsArray[5] = sheep2;

        //Printing
        for (Animal animalPrint : animalsArray){
            System.out.println(animalPrint.getAnimalName());
            System.out.println(animalPrint.getAnimalWeight() + " Pounds");
            System.out.println(animalPrint.getAnimalPrice() + " $");
            System.out.println("---------");
        }

    }
}
