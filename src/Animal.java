public class Animal {
    private int age;
    private Martin martin;
    private BirdType birdType;
    private Aviary aviary;

    public Animal(int age, Martin martin, BirdType birdType) {
        this.age = age;
        this.martin = martin;
        this.birdType = birdType;
    }

    public int getAge() {

        return age;
    }

    public Martin getMartin() {

        return martin;
    }

    public BirdType getBirdType() {

        return birdType;
    }

    public String getInfo() {
        return "age: " + age +
                "\nBirdType: " + birdType +
                "\nAviary address: " + aviary.getAddress() +
                "\nAviary name: " + aviary.getName();
    }
}
