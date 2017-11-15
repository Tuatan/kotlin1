class Greeter(val name: String) {
    fun greet() {
        println("Hello, ${name}");
    }
}

fun main(args: Array<String>) {
    Greeter("args[0]").greet()
}
// 0. define public classes
// 1. enable teamcity
// 2. create a maven package
// 3. publish a maven package
// 4. create a consumer application

// use rx.java
// create tx.java

// create web api application
