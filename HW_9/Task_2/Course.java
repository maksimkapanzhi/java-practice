package HW_9.Task_2;

public enum Course {
    USA(2.06), EUR(2.38);
double count;
Course(double count) {
    this.count = count;
}
    public double getCount(){
    return count;
    }
}
