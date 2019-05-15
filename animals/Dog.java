package animals;

class Dog extends Animal {
   private int tailLength;
   private int size;
    public Dog(String name, int age, String pedigree, int tailLength, int size){
        super(name, age, pedigree);
        this.tailLength = tailLength;
        this.size = size;
    }
    public void printInfo(){
        System.out.printf("Name is " + name + "\n" +"Age is " + age + "\n"
                + "Pedigree is " + pedigree + "\n" +
                "Tail Length is " + tailLength + "\n" +
                "Size is " + size + "\n" );
        System.out.println();
    }
}
