# Android basics in Kotlin
## 0. Birthday Card App
This app shows a birthday card created with ConstraitLayout.

**What I learned:**

- The app helps me to build a basic layout with some elements (TextView, ImageView)


![Screenshot 2021-09-03 222910](https://user-images.githubusercontent.com/78266241/132030893-b081c9f6-9db9-4532-a43e-ce8d50b575f5.png)

## 1. Dice Roller App

In this app, you built a Dice Roller Android app. When the user "rolls the dice," a random result will be generated. The result takes into account the number of sides of the dice. For example, only values from 1-6 can be rolled from a 6-sided dice.

**What I learned:**

- Call the `random()` function on an `IntRange` to generate a random number: `(1..6).random()`
- Classes are like a blueprint of an object. They can have properties and behaviors, implemented as variables and functions.
- An instance of a class represents an object, often a physical object, such as a dice. I can call the actions on the object and change its attributes.
- I can supply values to a class when you create an instance. For example: `class Dice(val numSides: Int)` and then create an instance with `Dice(6)`.
- Functions can return something. Specify the data type to be returned in the function definition, and use a return statement in the function body to return something. For example: `fun example(): Int { return 5 }`
- Use `setImageResource()` to change the image that's displayed in an ImageView
- Use control flow statements like `if / else` expressions or `when` expressions to handle different cases in your app, for example, showing different images under different circumstances.


https://user-images.githubusercontent.com/78266241/132077666-b6efb419-8035-4221-8d3b-77ce541403f2.mp4


## 2. Tip Time App
This app calculates tip based on the amount of money and the percentage of the tip

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
---
- Specify the `android:inputType` attribute to limit what type of text the user can input into an `EditText` field.
- Make a list of exclusive options with `RadioButtons`, grouped with a `RadioGroup`.
- A `RadioGroup` can be vertical or horizontal, and I can specify which `RadioButton` should be selected initially.
- I can add a label to a `Switch` without using a separate `TextView`.
- Each child of a `ConstraintLayout` needs to have vertical and horizontal constraints.
- Use `start` and `end` constraints to handle both Left to Right (LTR) and Right to Left (RTL) languages.
- Names of the constraint attributes follow the form `layout_constraint<Source>_to<Target>Of`.
- [View binding](https://developer.android.com/topic/libraries/view-binding) lets me more easily write code that interacts with the UI elements in my app
- Use the `checkedRadioButtonId` attribute of a **RadioGroup** to find which **RadioButton** is selected.
- Use `NumberFormat.getCurrencyInstance()` to get a formatter to use for formatting numbers as currency.
- I can use string parameters like `%s` to create dynamic strings that can still be easily translated into other languages.
- A **stack trace** shows a list of methods that were called. This can be useful if the code generates an exception.
---
- Use the [Material Color](https://material.io/resources/color/#!/?view.left=0&view.right=0) or [Material palette generator](https://material.io/design/color/the-color-system.html#tools-for-picking-colors) to select colors,color palette for your app theme. 
- Declare color resources in the `colors.xml` file to make it easier to reuse them.
- Place app icon files in the `mipmap` resource directories.
- Provide different versions of an app icon bitmap image in each density bucket (`mdpi`, `hdpi`, `xhdpi`, `xxhdpi`, `xxxhdpi`) for backwards compatibility with older versions of Android.
- Add [resource qualifiers](https://colabug.gitbooks.io/intro-to-android/content/resource_system/qualifiers.html) onto resource directories to specify resources that should be used on devices with a certain configuration (e.g. v26).
- Vector drawables are Android's implementation of vector graphics. They are defined in XML as a set of points, lines, and curves along with associated color information. Vector drawables can be scaled for any density without loss of quality.
- Adaptive icons were introduced to the Android platform in API 26. They are made up of a foreground and background layer that follow specific requirements, so that my app icon looks high-quality on a range of devices with different OEM masks.

https://user-images.githubusercontent.com/78266241/132077626-691beafc-4559-4780-ae85-1fa36bddd3e3.mp4

##










