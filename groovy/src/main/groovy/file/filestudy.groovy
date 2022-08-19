package file

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

class filestudy {

    static void main(def args) {
//        test1()
//        test2()
//        test3()
        test4()

    }

    /**
     * 转换成json输出
     */
    def static test1() {
        def list = [new Person(name: 'John', age: 25),
                    new Person(name: 'Major', age: 26)]
        println JsonOutput.toJson(list)
    }

    /**
     * 输出带格式的json字符串
     */
    def static test2() {
        def list = [new Person(name: 'John', age: 25),
                    new Person(name: 'Major', age: 26)]
        def json = JsonOutput.toJson(list)
        println JsonOutput.prettyPrint(json)
    }

    /**
     * 使用JsonSlurper类可以进行Json解析
     */
    def static test3() {
        def jsonSlpuer = new JsonSlurper()
        def json = "[{\"age\":25,\"name\":\"John\"},{\"age\":26,\"name\":\"Major\"}]";
        List<Person> list = jsonSlpuer.parseText(json)
        println list.toListString()
        list.each {def person ->
            println "name: " + person.name + " age: " + person.age
        }
        println list.getClass()
    }

    /**
     * 使用gson
     */
    def static test4() {
        def reponse =
                getNetworkData(
                        'http://baike.baidu.com/api/openapi/BaikeLemmaCardApi?scope=103&format=json&appid=379020&bk_key=%E5%85%B3%E9%94%AE%E5%AD%97&bk_length=600')
        println reponse.url
        println "=============>  " + reponse.toString()
    }

    def static getNetworkData(String url) {
        //发送http请求
        def connection = new URL(url).openConnection()
        connection.setRequestMethod('GET')
        connection.connect()
        def response = connection.content.text
        println "===========> json: " + JsonOutput.prettyPrint(response)
        //将json转化为实体对象
        def jsonSluper = new JsonSlurper()
        return jsonSluper.parseText(response)
    }
}