# Composite

##### Make sure that the core model of your app can be represented as a tree structure.
 - **Use the Composite pattern when you have to implement a tree-like object structure.**
 
      The Composite pattern provides you with two basic element types that share a common interface: simple leaves and complex containers. A container can be composed of both leaves and other containers. This lets you construct a nested recursive object structure that resembles a tree.
 
 - **Use the pattern when you want the client code to treat both simple and complex elements uniformly.**
    All elements defined by the Composite pattern share a common interface. Using this interface, the client doesn’t have to worry about the concrete class of the objects it works with.
    
[Good tutorial for composite pattern](https://refactoring.guru/design-patterns/composite)