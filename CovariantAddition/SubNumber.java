package CovariantAddition;

class SubNumber extends Number {
    public SubNumber(int num) {
        super(num);
    }

    @Override
    public SubNumber add(Number other) {
        return new SubNumber(this.num + other.num);
    }
}