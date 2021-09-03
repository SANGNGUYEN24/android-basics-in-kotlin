# Android basics in Kotlin
## 0. Birthday Card App
This app shows a birthday card created with ConstraitLayout.

**What I learned:**

- The app helps me to build a basic layout with some elements (TextView, ImageView)


![Screenshot 2021-09-03 222910](https://user-images.githubusercontent.com/78266241/132030893-b081c9f6-9db9-4532-a43e-ce8d50b575f5.png)

## 1. Dice Roller App

In this app, you built a Dice Roller Android app. When the user "rolls the dice," a random result will be generated. The result takes into account the number of sides of the dice. For example, only values from 1-6 can be rolled from a 6-sided dice.

**What I learned:**

- Call the `random()` function on an IntRange to generate a random number: `(1..6).random()`
- Classes are like a blueprint of an object. They can have properties and behaviors, implemented as variables and functions.
- An instance of a class represents an object, often a physical object, such as a dice. I can call the actions on the object and change its attributes.
- I can supply values to a class when you create an instance. For example: `class Dice(val numSides: Int)` and then create an instance with `Dice(6)`.
- Functions can return something. Specify the data type to be returned in the function definition, and use a return statement in the function body to return something. For example: `fun example(): Int { return 5 }`
- Use `setImageResource()` to change the image that's displayed in an ImageView
- Use control flow statements like `if / else` expressions or `when` expressions to handle different cases in your app, for example, showing different images under different circumstances.

![image](https://user-images.githubusercontent.com/78266241/132031773-fd6eaa5c-fd6d-42c1-acc8-cfa6dc8d36bf.png)
![image](https://user-images.githubusercontent.com/78266241/132031843-a388a02e-3fb4-47d4-b219-7313b10050b4.png)

## 2. Tip Time App

**What I learned**

- Create a class hierarchy, that is a tree of classes where children inherit functionality from parent classes. Properties and functions are inherited by subclasses.
- Create an `abstract` class where some functionality is left to be implemented by its subclasses. An `abstract` class can therefore not be instantiated.
- Create subclasses of an `abstract` class.
- Use `override` keyword to override properties and functions in subclasses.
- Use the `super` keyword to reference functions and properties in the parent class.
- Make a class open so that it can be subclassed.
- Make a property private, so it can only be used inside the class.
- Use the `with` construct to make multiple calls on the same object instance.
- Import functionality from the `kotlin.math` library





