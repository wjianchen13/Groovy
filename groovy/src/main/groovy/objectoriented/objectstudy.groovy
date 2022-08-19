package objectoriented

/**
 * groovy逻辑控制
 */
class objectstudy {

    def static main(def args) {
//        test1()
//        test2()
//        test3()
//        test4()
//        test5()
//        test6()
        test7()
    }

    /**
     * 类的简单用法
     */
    def static test1() {
        def person = new Person(name: 'android', age: 26)
        person.increaseAge(10)
        println "this name is ${person.name}, " +
                "thi age is ${person.age}"
    }

    /**
     * 接口使用，没有代码，看Action
     */
    def static test2() {

    }

    /**
     * trait的使用
     */
    def static test3() {
        def person = new Person3(name: 'android', age: 26)
        person.play()

    }

    /**
     * 元编程
     */
    def static test4() {
        def person = new Person4(name: 'android', age: 26)
        println person.cry()
    }

    /**
     * 为类动态添加一个属性
     */
    def static test5() {
        Person.metaClass.sex = 'male'
        def person = new Person(name: 'android', age: 26)
        println person.sex
        person.sex = 'female'
        println "the new sex is: " + person.sex
    }

    /**
     *
     * 为类动态添加方法
     */
    def static test6() {
        Person.metaClass.sex = 'male'
        Person.metaClass.sexUpperCase = { -> sex.toUpperCase()}
        def person = new Person(name: 'android', age: 26)
        println person.sexUpperCase()
    }

    /**
     * 为类添加静态方法
     */
    def static test7() {
        Person.metaClass.static.createPerson = {String name, int age ->
            new Person(name: name, age: age)
        }
        def person3 = Person.createPerson("androidtest", 30)
        println person3.name + " and " + person3.age
    }

}