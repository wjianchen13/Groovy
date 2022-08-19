package clouser

/**
 * Groovy闭包
 */
class clouser {

    def static main(def args) {
        define()
        define1()
        define2()
        define3()
        returenTest()
        returenTest1()
    }

    /**
     * 简单闭包定义
     */
    def static define() {
        def clouser = {println 'hello groovy'}
        clouser.call()
//        clouser()
    }

    /**
     * 闭包参数
     */
    def static define1() {
        def clouser = {String name ->println "hello ${name}"}
        //clouser.call('groovy')
        clouser('groovy')
    }

    /**
     * 多个闭包参数
     */
    def static define2() {
        def clouser = {String name, int age ->
            println "hello ${name}, age is ${age}"}
        clouser('groovy', 4)
    }

    /**
     * 闭包默认参数
     * 如果不想闭包中有it这个隐式参数，只需要定义一个显示参数，这样闭包就没有it这个隐式参数了
     */
    def static define3() {
        def clouser = {
            println "hello ${it}"}
        clouser('groovy')
    }

    /**
     * 闭包返回值
     */
    def static returenTest() {
        def clouser = {
            return  "hello ${it}"
        }
        def result = clouser('groovy')
        println result;
    }

    /**
     * 闭包一定会有返回值，默认返回最后一句代码的结果
     */
    def static returenTest1() {
        def clouser = {
            println "hello ${it}"
        }
        def result = clouser('groovy')
        println result
    }

}