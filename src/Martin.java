public class Martin extends Animal{
private String Species;
private String name;

    public Martin(int age, Martin martin, BirdType birdType, String species, String name) {
        super(age, martin, birdType);
        Species = species;
        this.name = name;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+
                "Species" +
                "\name"+ name;
    }

}


