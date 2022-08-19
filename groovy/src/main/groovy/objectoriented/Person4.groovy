package objectoriented

class Person4 {

    String name

    Integer age

    def increaseAge(Integer years) {
        this.name += years
    }

    def invokeMethod(String name, Object args) {
        return "the methos is ${name}, the params is ${args}"
    }

    def methodMissing(String name, Object args){
        return "the methos is ${name} is missing"
    }
}




