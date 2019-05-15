package animals;

class Cat extends Animal{
    private int mustacheSize;
    private String clawsSharpness;
    private String eyesColour;
    public Cat(String name, int age, String pedigree, int mustacheSize, String clawsSharpness, String eyesColour){
        super(name, age, pedigree);
        this.mustacheSize = mustacheSize;
        this.clawsSharpness = clawsSharpness;
        this.eyesColour = eyesColour;
    }

    public void printInfo(){
        System.out.printf("Name is" + name + "\n" +"Age is " + age + "\n"
                + "Pedigree is " + pedigree + "\n" + "Mustache Size is"  + mustacheSize + "\n"
        + "Claws Sharpness is " + clawsSharpness + "\n" + "Eyes Colours is " + eyesColour + "\n");
        System.out.println();
    }

}
