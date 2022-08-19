package objectoriented

/**
 * 1.groovy中默认都是public
 * 2.所有的groovy类都默认集成了一个GroovyObject类
 * 这是groovy和java中类的区别
 */
class Person1 implements Action{

    String name

    Integer age

    def increaseAge(Integer years) {
        this.name += years
    }

    @Override
    void eat() {

    }

    @Override
    void drink() {

    }

    @Override
    void play() {

    }
}


