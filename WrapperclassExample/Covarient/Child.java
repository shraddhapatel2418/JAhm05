package Covarient;

class Child extends Parent {
    @Override
    public Child getInstance() {
        return new Child();
    }

    public void childMethod() {
        System.out.println("This is a method specific to Child");
    }
}
