package datastructure

/**
 * Groovy list使用
 */
class liststudy {

    def static main(def args) {
//        test1()
//        test2()
//        test3()
//        test4()
//        test5()
//        test6()
//        test7()
//        test8()
//        test9()
//        test10()
//        test11()
//        test12()
//        test13()
//        test14()
        test15()
        test16()
    }

    /**
     * list定义
     */
    def static test1() {
        def list = [1, 2, 3, 4, 5]
        println list.class
        println list.size()
    }

    /**
     * 数组定义
     */
    def static test2() {
        def list = [1, 2, 3, 4, 5] as int[]
        int [] array = [1, 2, 3, 4, 5]
        println list.class
        println list.size()
        println array.class
        println array.size()
    }

    /**
     * 数组排序
     */
    def static test3() {
        def sortList = [6, -3, 9, 2, -7, 1, 5]
        sortList.sort()
        println sortList
    }

    /**
     * 自定义排序规则 小到大输出
     */
    def static test4() {
        def sortList = [6, -3, 9, 2, -7, 1, 5]
        Comparator mc = {a, b ->
            a == b ? 0:
                    Math.abs(a) < Math.abs(b) ? -1 : 1
        }
        Collections.sort(sortList, mc)
        println sortList
    }

    /**
     * groovy中有可以直接调用sort()方法进行排序
     */
    def static test5() {
        def sortList = [6, -3, 9, 2, -7, 1, 5]
        sortList.sort()
        println sortList
    }

    /**
     * 在sort方法中传入一个闭包，自定义排序规则
     */
    def static test6() {
        def sortList = [6, -3, 9, 2, -7, 1, 5]
        sortList.sort{a, b ->
            a == b ? 0:
                    Math.abs(a) < Math.abs(b) ? 1 : -1
        }
        println sortList

    }

    /**
     *  对象排序
     */
    def static test7() {
        def sortList = ['abc', 'z', 'Hello', 'groovy', 'java']
        sortList.sort{
            return it.size()
        }
        println sortList

    }

    /**
     * 查找列表中第一个偶数
     */
    def static test8() {
        def findList = [6, -3, 9, 2, -7, 1, 5]
        int result = findList.find {
            return it % 2 == 0
        }
        println result
    }

    /**
     * 查找所有满足条件的元素
     */
    def static test9() {
        def findList = [6, -3, 9, 2, -7, 1, 5]
        def result = findList.findAll {
            return it % 2 != 0
        }
        println result.toListString()

    }

    /**
     * 判断列表中是否有一个满足条件的元素
     */
    def static test10() {
        def findList = [6, -3, 9, 2, -7, 1, 5]
        def result = findList.any {
            return it % 2 != 0
        }
        println result

    }

    /**
     * 判断列表中所有的元素是否满足条件
     */
    def static test11() {
        def findList = [6, -3, 9, 2, -7, 1, 5]
        def result = findList.every {
            return it % 2 == 0
        }
        println result

    }

    /**
     * 查找列表中最小值和最大值
     */
    def static test12() {
        def findList = [6, -3, 9, 2, -7, 1, 5]
        println findList.min()
        println findList.max()

    }

    /**
     * min()和max()方法也能够传入闭包，查找绝对值最小和最大的例子
     */
    def static test13() {
        def findList = [6, -3, 9, 2, -7, 1, 5]
        println findList.min{return Math.abs(it)}
        println findList.max{return Math.abs(it)}

    }

    /**
     * 通过count对列表中的元素进行统计
     */
    def static test14() {
        def findList = [6, -3, 9, 2, -7, 1, 5]
        int num = findList.count {return it % 2 == 0}
        println num

    }

    /**
     * 增加
     */
    def static test15() {
        def list = [1, 2, 3, 4, 5]
        list.add(6)
        list.leftShift(7)
        list << 8
        println list.toListString()
        def plusList = list + 9
        println plusList.toListString()
    }

    /**
     * 删除
     */
    def static test16() {
        def list = [1, 2, 3, 4, 5]
        list.remove(7)
        list.remove((Object) 7)
        list.removeAt(7)
        list.removeElement(6)
        list.removeAll { return it % 2 == 0 }
        println list - [6, 7]
        println list.toListString()
    }

}

