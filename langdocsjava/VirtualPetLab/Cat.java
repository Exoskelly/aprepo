package VirtualPetLab;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomCatImg());
    }

    @Override
    public void feed() {
        super.setEnergy(super.getEnergy() + 20);
        super.setHappiness(super.getHappiness() + 20);
        super.setHunger(super.getHunger() - 20);

        if (super.getEnergy() < 0)
            super.setEnergy(0);
        else if (super.getEnergy() > 100)
            super.setEnergy(100);
        if (super.getHappiness() < 0)
            super.setHappiness(0);
        else if (super.getHappiness() > 100)
            super.setHappiness(100);
        if (super.getHunger() < 0)
            super.setHunger(0);
        else if (super.getHunger() > 100)
            super.setHunger(100);
    }

    @Override
    public void play() {
        super.setHappiness(super.getHappiness() + 30);
        super.setEnergy(super.getEnergy() - 20);
        super.setHunger(super.getHunger() + 20);

        if (super.getEnergy() < 0)
            super.setEnergy(0);
        else if (super.getEnergy() > 100)
            super.setEnergy(100);
        if (super.getHappiness() < 0)
            super.setHappiness(0);
        else if (super.getHappiness() > 100)
            super.setHappiness(100);
        if (super.getHunger() < 0)
            super.setHunger(0);
        else if (super.getHunger() > 100)
            super.setHunger(100);
    }

    @Override
    public void sleep() {
        super.setHappiness(super.getHappiness() + 20);
        super.setEnergy(super.getEnergy() + 20);
        super.setHunger(super.getHunger() + 20);

        if (super.getEnergy() < 0)
            super.setEnergy(0);
        else if (super.getEnergy() > 100)
            super.setEnergy(100);
        if (super.getHappiness() < 0)
            super.setHappiness(0);
        else if (super.getHappiness() > 100)
            super.setHappiness(100);
        if (super.getHunger() < 0)
            super.setHunger(0);
        else if (super.getHunger() > 100)
            super.setHunger(100);
    }
}
