package variable

/**
 *
 */
class variablestudy {

    def static main(def args) {
//        variableType()
//        variableDefine()
        variableDefine1()
    }

    /**
     * 变量类型
     * Groovy变量没有基本类型变量，所有的变量都是对象类型
     * @return
     */
    def static variableType() {
        int x = 10
        println x.class

        double y = 2.0
        println y.class

        Float z = 2.0
        println z.class
    }

    /**
     * 变量定义
     * 弱类型定义，根据后面的值可以自动推断变量的类型
     */
    def static variableDefine() {
        def a = 1
        println a.class
        def b = 2.0
        println b.class
        def c = 'hello'
        println c.class

    }

    /**
     * 弱类型定义的类型是Object类型
     * 后面可以根据赋值改变成任意类型
     */
    def static variableDefine1() {
        def a = 1
        println a.class
        a = 2.0
        println a.class
        a = 'hello'
        println a.class

    }

}







