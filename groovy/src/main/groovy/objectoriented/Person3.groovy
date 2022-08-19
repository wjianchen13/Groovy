package objectoriented

class Person3 implements DefaultAction{

    String name

    Integer age

    def increaseAge(Integer years) {
        this.name += years
    }

    @Override
    void eat() {

    }

}



