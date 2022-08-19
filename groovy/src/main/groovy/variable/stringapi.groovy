package variable

/**
 * String常用API
 */
class stringapi {

    def static main(def args) {
        center()
        padLeft()
        compareTo()
        getAt()
        minus()
        reverse()
        capitalize()
        isNumber()
    }

    /**
     * 对已有字符串为中心向2边填充
     * @return
     */
    def static center() {
        def str = "groovy"
        println str.center(10, 'a')
    }

    /**
     * 对已有字符串的左边进行填充。
     * @return
     */
    def static padLeft() {
        def str = "groovy"
        println str.padLeft(10, 'a')
    }

    /**
     * Grvooy除了可以使用java的compareTo方法对字符串进行比较，还可以使用==，>，<比较操作符对字符串进行比较
     * @return
     */
    def static compareTo() {
        def str = "groovy"
        def str2 = 'hello'
        println str == str2
    }

    /**
     * Groovy除了可以通过java方法getAt方法获取索引下的字符，还可以通过[下标]的方式进行获取
     * @return
     */
    def static getAt() {
        def str = "groovy"
        println str[3..5]
    }

    /**
     * 字符串差运算，表示把字符串包含另外字符串的内容去除
     * 可以对字符串进行减法运算，相当于minus（）的功能
     * @return
     */
    def static minus() {
        def str = "hello groovy"
        def str2 = "hello"
        println str.minus(str2)
        println str - str2
    }

    /**
     * 对字符串进行倒序
     * @return
     */
    def static reverse() {
        def str = "hello groovy"
        println str.reverse()

    }

    /**
     * 对字符串首字母大写
     * @return
     */
    def static capitalize() {
        def str = "hello groovy"
        println str.capitalize()
    }

    /**
     * 判断是否是数字类型的字符串
     * @return
     */
    def static isNumber() {
        def str = "hello groovy"
        def str2 = '123456'
        println str.isNumber()
        println str2.isNumber()
    }

}