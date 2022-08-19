package clouser

/**
 * Groovy闭包应用
 */
class userclouser {

    def static main(def args) {
        test1()
        test2()
        test3()
        test4()
        test5()
        test6()
        test7()
        test8()
        test9()
        test10()
        test11()
    }

    /**
     * 求指定number的阶乘
     */
    def static test1() {
        int x = fab(5)
        println x
    }

    // 求指定number的阶乘
    static int fab(int number) {
        int result = 1
        1.upto(number, { num -> result *= num})
        return result
    }


    /**
     * 求指定number的阶乘
     */
    def static test2() {
        int y = fab2(5)
        println y
    }

    static int fab2(int number) {
        int result = 1
        number.downto(1) {
            num -> result *= num
        }
        return result
    }


    /**
     * n.times()方法, 表示循环n次，循环变量it从0开始到n结束
     */
    def static test3() {
        int x = cal(5)
        println x
    }

    /**
     * times 循环从0开始
     * @param number
     * @return
     */
    static int cal(int number) {
        int result = 0
        number.times {
            num ->
                result += num
        }
        return  result
    }

    /**
     * Groovy字符串提供了each()方法来对字符串进行遍历
     * 字符串里面的字符都输出2次
     */
    def static test4() {
        String str = 'the 2 and 3 is 5'
        str.each {
            String temp -> print temp.multiply(2)
        }
        println ""
    }

    /**
     * Groovy字符串提供了each()方法来对字符串进行遍历
     * 字符串里面的字符都输出1次
     */
    def static test5() {
        String str = 'the 2 and 3 is 5'
        str.each {
            String temp -> print temp
        }
        println ""
    }

    /**
     * each的返回值是字符串本身
     */
    def static test6() {
        String str = 'the 2 and 3 is 5'
        println str.each {
        }
        println ""
    }

    /**
     * 通过find()方法进行查找
     */
    def static test7() {
        String str = 'the 2 and 3 is 5'
        println str.find {
            String s -> s.isNumber()
        }
        println ""
    }

    /**
     * findAll()方法，查找所有满足条件的字符
     */
    def static test8() {
        String str = 'the 2 and 3 is 5'
        def list = str.findAll {
            String s -> s.isNumber()
        }
        println list.toListString()
    }

    /**
     * any()方法表示字符串是否含有满足条件的字符
     */
    def static test9() {
        String str = 'the 2 and 3 is 5'
        def result = str.any {
            String s -> s.isNumber()
        }
        println result
    }

    /**
     * every()方法表示字符串中是否每个字符都满足条件
     */
    def static test10() {
        String str = 'the 2 and 3 is 5'
        def result = str.every {
            String s -> s.isNumber()
        }
        println result
    }

    /**
     * collect()方法，表示将字符串每个元素都应用于闭包，闭包会产生一个新的结果，然后将结果添加到List中进行返回
     */
    def static test11() {
        String str = 'the 2 and 3 is 5'
        def list = str.collect {
            it.toUpperCase()
        }
        println list
    }

}