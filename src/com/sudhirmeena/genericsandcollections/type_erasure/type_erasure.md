**Type Erasure**

1. Java uses type erasure to implement generics - this is how generic code is handled
2. It replaces all generic type parameters with their bounds or Object for unbounded type parameters.
3. It is true for wildcards as well.

``So the final bytecode will contain plain java classes and objects``

- It may happen that type erasure uses <b>type casting</b>.
- Sometimes it is needed to generate addition methods.
- These are called <b>bridge methods</b> to maintain polymorphism with generic types as well.
