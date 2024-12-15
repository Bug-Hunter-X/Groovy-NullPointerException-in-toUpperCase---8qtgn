```groovy
class MyClass {
    def myMethod(param) {
        if (param == null) {
            return "Null Parameter"
        }
        return param.toUpperCase()
    }
    def myMethodSafe(param) {
        return param?.toUpperCase() ?: "Null Parameter"
    }
}

assert new MyClass().myMethod(null) == "Null Parameter"
assert new MyClass().myMethod("hello") == "HELLO"
assert new MyClass().myMethodSafe(null) == "Null Parameter"
assert new MyClass().myMethodSafe("hello") == "HELLO"
```