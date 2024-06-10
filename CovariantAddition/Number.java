package CovariantAddition;

class Number {
    int num;

    public Number(int num) {
        this.num = num;
    }

    public Number add(Number other) {
        return new Number(this.num + other.num);
    }

    public void display() {
        System.out.println("Number: " + num);
    }
}
