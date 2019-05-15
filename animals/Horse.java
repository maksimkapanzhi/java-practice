package animals;

class Horse extends Animal {
    private double height;//это рост
    private boolean wearsHorseShue;
    public Horse(String name, int age, String pedigree, double height, boolean wearsHorseShue){
        super(name, age, pedigree);
        this.height = height;
        this.wearsHorseShue = wearsHorseShue;
    }
    public void printInfo(){
        System.out.printf("Name is " + name +"\n" + "Age is" + " " +age  +"\n"
                + "Pedigree is " + pedigree +"\n" +  "Height is " + height +"\n"
                + "Wears Horse Shue is " + wearsHorseShue + "\n");
        System.out.println();
    }
}
