package file

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import groovy.xml.MarkupBuilder

class xmlstudy {

    static void main(def args) {
//        test1()
//        test2()
//        test3()
//        test4()
//        test5()
        test6()
    }

    def static final String xml = '''
            <response version-api="2.0">
                <value>
                    <books id="1" classification="android">
                        <book available="20" id="1">
                            <title>疯狂Android讲义</title>
                            <author id="1">李刚</author>
                        </book>
                        <book available="14" id="2">
                           <title>第一行代码</title>
                           <author id="2">郭林</author>
                       </book>
                       <book available="13" id="3">
                           <title>Android开发艺术探索</title>
                           <author id="3">任玉刚</author>
                       </book>
                       <book available="5" id="4">
                           <title>Android源码设计模式</title>
                           <author id="4">何红辉</author>
                       </book>
                   </books>
                   <books id="2" classification="web">
                       <book available="10" id="1">
                           <title>Vue从入门到精通</title>
                           <author id="4">李刚</author>
                       </book>
                   </books>
               </value>
            </response>
        '''

    /**
     * 转换成json输出
     */
    def static test1() {

        //开始解析此xml数据
        def xmlSluper = new XmlSlurper()
        def response = xmlSluper.parseText(xml)

        println response.value.books[0].book[0].title.text()
        println response.value.books[0].book[0].author.text()
        println response.value.books[1].book[0].@available
        println response.value.books[1].book[0].@id
    }

    /**
     * 查询所有作者是李刚的书名
     */
    def static test2() {
        def xmlSluper = new XmlSlurper()
        def response = xmlSluper.parseText(xml)

        def list = []
        response.value.books.each { books ->
            //下面开始对书结点进行遍历
            books.book.each { book ->
                def author = book.author.text()
                if (author.equals('李刚')) {
                    list.add(book.title.text())
                }
            }
        }
        println list.toListString()
    }

    /**
     * 深度遍历xml数据
     */
    def static test3() {
        def xmlSluper = new XmlSlurper()
        def response = xmlSluper.parseText(xml)
        //深度遍历xml数据
        def titles = response.depthFirst().findAll { book ->
            return book.author.text() == '李刚' ? true : false
        }
        println titles.toListString()

    }

    /**
     * 广度遍历xml数据
     */
    def static test4() {
        def xmlSluper = new XmlSlurper()
        def response = xmlSluper.parseText(xml)

        // 广度遍历xml数据
        def name = response.value.books.children().findAll { node ->
            node.name() == 'book' && node.@id == '2'
        }.collect { node ->
            return node.title.text()
        }
        println name
    }

    /**
     * 使用MarkupBuilder类生成xml的例子
     * <langs type='current' count='3' mainstream='true'>
     *   <language flavor='static' version='1.5'>java
     *     <age>16</age>
     *   </language>
     *   <language flavor='dynamic' version='1.6'>
     *     <age>10</age>
     *   </language>
     *   <language flavor='dynamic' version='1.9'>JavaScript</language>
     * </langs>
     */
    def static test5() {
        def sw = new StringWriter()
        def xmlBuilder = new MarkupBuilder(sw) //用来生成xml数据的核心类
        //根结点langs创建成功
        xmlBuilder.langs(type: 'current', count: '3',
                mainstream: 'true') {
            //第一个language结点
            language(flavor: 'static', version: '1.5', 'java') {
                age('16')
            }
            language(flavor: 'dynamic', version: '1.6') {
                age('10')
            }
            language(flavor: 'dynamic', version: '1.9', 'JavaScript')
        }

        println sw

    }

    /**
     * 将实体类数据转换成xml格式数据
     */
    def static test6() {
        def sw = new StringWriter()
        def xmlBuilder = new MarkupBuilder(sw) // 用来生成xml数据的核心类
        def langs = new Langs()
        xmlBuilder.langs(type: langs.type, count: langs.count,
                mainstream: langs.mainstream) {
            // 遍历所有的子结点
            langs.languages.each { lang ->
                language(flavor: lang.flavor,
                        version: lang.version, lang.value)
            }
        }
        println sw

    }

}