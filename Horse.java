public class Horse implements Animal {

    private String animalName = null;
    private double animalWeight = 0;
    private double animalPrice = 0;

    public Horse() {
        setAnimalName("Horse");
    }

    public Horse(String animalName, double animalWeight, double animalPrice) {
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.animalPrice = animalPrice;
    }

    // getters and setters

    @Override
    public String getAnimalName() {
        return this.animalName;
    }

    @Override
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public double getAnimalPrice() {
        return this.animalPrice;
    }

    @Override
    public double getAnimalWeight() {
        return this.animalWeight;
    }

    @Override
    public void setAnimalPrice(double animalPrice) {
        this.animalPrice = animalPrice;
    }

    @Override
    public void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }
}
