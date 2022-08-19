package clouser

/**
 * Groovy闭包高级
 */
class clouserhigh {

    def static main(def args) {
//        test1()
//        test2()
//        test3()
//        test4()
//        test5()
//        test6()
//        test7()
        test8()
    }

    /**
     * 闭包三个重要变量this，owner和delegate关键字
     */
    def static test1() {
        testClouser.call()
    }

    def static testClouser = {
        println "testClouser this:" + this
        println "testClouser owner:" + owner
        println "testClouser delegate:" + delegate
    }

    /**
     * 类中定义闭包
     */
    def static test2() {
        Person.classClouser.call()
        Person.say()
    }

    /**
     * 把代码中的static去掉
     */
    def static test3() {
        Person1 p = new Person1()
        p.classClouser.call()
        p.say()
    }

    /**
     * 在闭包中定义闭包
     */
    def static test4() {
        def nestClouser = {
            def innerClouser = {
                println "innerClouser this:" + this
                println "innerClouser owner:" + owner
                println "innerClouser delegate:" + delegate
            }
            innerClouser.call()
        }
        nestClouser.call()

    }

    /**
     * 手动修改delegate的值
     */
    def static test5() {
        Person p = new Person()

        def nestClouser = {
            def innerClouser = {
                println "innerClouser this:" + this
                println "innerClouser owner:" + owner
                println "innerClouser delegate:" + delegate
            }
            innerClouser.delegate = p
            innerClouser.call()
        }
        nestClouser.call()

    }

    /**
     * 闭包委托策略
     */
    def static test6() {
        def stu = new Student(name : 'Sarash')
        def tea = new Teacher(name : 'Teacher')
        println stu.toString()
    }

    /**
     * 闭包委托策略
     */
    def static test7() {
        def stu = new Student(name : 'Sarash')
        def tea = new Teacher(name : 'Teacher')
        stu.pretty.delegate = tea
        println stu.toString()
    }

    /**
     * 闭包委托策略
     */
    def static test8() {
        def stu = new Student(name : 'Sarash')
        def tea = new Teacher(name : 'Teacher')
        stu.pretty.delegate = tea
        stu.pretty.resolveStrategy = Closure.DELEGATE_FIRST
        println stu.toString()
    }


}