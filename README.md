# Android basics in Kotlin
> Disclaimer: Some of the contents of this file are referenced from the course: [Android Basics in Kotlin](https://developer.android.com/courses/android-basics-kotlin/course)
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

**What I learned:**

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

## 3. Affirmation
This app displays a list of landscape pictures using `RecycleView`

**What I learned:**

- There are two types of lists in Kotlin: `List` and `MutableList`.
- A List is read-only and cannot be modified once it has been initialized. However, I can apply operations such as `sorted()` and `reversed()` which return a new list without changing the original.
- A `MutableList` can be modified after creation such as adding, removing, or modifying elements.
- I can add a list of items to a **mutable list** using `addAll()`.
---
> I believe displaying a list in Flutter is easier than it in Android :)) bruh

- `RecyclerView` widget helps you display a list of data.
- `RecyclerView` uses the adapter pattern to adapt and display the data.
- `ViewHolder` creates and holds the views for `RecyclerView`.
- `RecyclerView` comes with built in `LayoutManagers`. `RecyclerView` delegates how items are laid out to `LayoutManagers`.

To implement the adapter:

- Create a new class for the adapter, for example, `ItemAdapter`.
- Create a custom `ViewHolder` class that represents a single list item view. Extend from `RecyclerView.ViewHolder` class.
- Modify the `ItemAdapter` class to extend from the `RecyclerView.Adapter` class with the custom `ViewHolder` class.
- Implement these methods within the adapter: `getItemsCount()`, `onCreateViewHolder()`, and `onBindViewHolder()`.
---
- To display additional content in a RecyclerView, modify the underlying data model class and data source. Then update the list item layout and adapter to set that data onto the views.
- Use resource annotations (`@StringRes val stringResourceId: Int`, `@DrawableRes val imageResourceId: Int`) to help ensure that the right type of resource ID is passed into a class constructor.
- Use `MaterialCardView` to display content in a Material card.

https://user-images.githubusercontent.com/78266241/132078854-4bbc30e7-e146-4877-98ed-2418af7785e9.mp4

## 4. Words App
Words Appp is a dictionary app so that it uses multiple activities, uses intents to navigate between them, and passes data to other apps.

**What I learned:**
- A collection is a group of related items
- Collections can be mutable or immutable
- Collections can be ordered or unordered
- Collections can require unique items or allow duplicates
- Kotlin supports different kinds of collections including `lists`, `sets`, and `maps`
- Kotlin provides many functions for processing and transforming collections, including `forEach`, `map`, `filter`, `sorted`, and more.
- A **_lambda_** is a function without a name that can be passed as an expression immediately. An example would be `{ a: Int -> a * 3 }`.
- A higher-order function means passing a function to another function, or returning a function from another function.
---
- Explicit intents are used to navigate to specific activities in your app.
- Implicit intents correspond to specific actions (like opening a link, or sharing an image) and let the system determine how to fulfill the intent.
- Menu options allow you to add buttons and menus to the app bar.
- `Companion` objects provide a way to associate reusable constants with a type, rather than an instance of that type.

To perform an intent:

- Get a reference to the context.
- Create an `Intent` object providing either an activity or intent type (depending on whether it's explicit or implicit).
- Pass any needed data by calling `putExtra()`.
- Call `startActivity()` passing in the intent object.
---
### Activity lifecycle
- The activity lifecycle is a set of states through which an activity migrates. The activity lifecycle begins when the activity is first created and ends when the activity is destroyed.
- As the user navigates between activities and inside and outside of my app, each activity moves between states in the activity lifecycle.
- Each state in the activity lifecycle has a corresponding callback method you can override in my `Activity` class. The core set of lifecycle methods are: `onCreate()`, `onStart()`, `onPause()`, `onRestart()`, `onResume()`, `onStop()`, `onDestroy()`.
- To add behavior that occurs when my activity transitions into a lifecycle state, override the state's callback method.
### Logging with Log
- The Android logging API, and specifically the Log class, enables me to write short messages that are displayed in the Logcat within Android Studio.
- Use Log.d() to write a debug message. This method takes two arguments: the **_log tag_**, typically the name of the class, and the **_log message_**, a short string.
### Preserving activity state
- When my app goes into the background, just after `onStop()` is called, app data can be saved to a `bundle`. Some app data, such as the contents of an EditText, is automatically saved for me.
- The `bundle` is an instance of `Bundle`, which is a collection of keys and values. The keys are always strings.
- Use the `onSaveInstanceState()` callback to save other data to the bundle that you want to retain, even if the app was automatically shut down. To put data into the bundle, use the bundle methods that start with put, such as `putInt()`.
- You can get data back out of the bundle in the `onRestoreInstanceState()` method, or more commonly in `onCreate()`. The `onCreate()` method has a `savedInstanceState` parameter that holds the bundle.
- If the `savedInstanceState` variable is null, the activity was started without a state bundle and there is no state data to retrieve.
- To retrieve data from the `bundle` with a key, use the `Bundle` methods that start with get, such as `getInt()`.
### Configuration changes
- A configuration change happens when the state of the device changes so radically that the easiest way for the system to resolve the change is to destroy and rebuild the activity.
- The most common example of a configuration change is when the user rotates the device from portrait to landscape mode, or from landscape to portrait mode. A configuration change can also occur when the device language changes or a hardware keyboard is plugged in.
- When a configuration change occurs, Android invokes all the activity lifecycle's shutdown callbacks. Then Android restarts the activity from scratch, running all the lifecycle startup callbacks.
- When Android shuts down an app because of a configuration change, it restarts the activity with the state bundle that is available to `onCreate()`.
As with process shutdown, save your app's state to the bundle in `onSaveInstanceState()`.
---
- Fragments are reusable pieces of UI that can be embedded in activities.
- The lifecycle of a fragment differs from the lifecycle of an activity, with view setup occurring in `onViewCreated()`, rather than `onCreateView()`.
- A `FragmentContainerView` is used to embed fragments in other activities and can manage navigation between fragments.

Using the **Navigation Component**

- Setting the `navGraph` attribute of a `FragmentContainerView` allows you to navigate between fragments within an activity.
- The `NavGraph` editor allows you to add navigation actions and specify arguments between different destinations.
- While navigating using intents requires you to pass in extras, the Navigation component uses SafeArgs to auto-generate classes and methods for your navigation actions, ensuring type safety with arguments.

Use cases for fragments.

- Using the Navigation component, many apps can manage their entire layout within a single activity, with all navigation occurring between fragments.
- Fragments make common layout patterns possible, such as master-detail layouts on tablets, or multiple tabs within the same activity.

https://user-images.githubusercontent.com/78266241/132082708-423c762c-bb31-4652-83d8-b197e2c259b1.mp4

## 5. Unscramble App
This game is hard and I hate it :((

The Unscramble app is a single player word scrambler game. The app displays one scrambled word at a time, and the player has to guess the word using all the letters from the scrambled word. The player scores points if the word is correct, otherwise the player can try any number of times. The app also has an option to skip the current word. In the left top corner, the app displays the word count, which is the number of words played in this current game. There are 10 words per game.

**What I learned:**

- The Android app architecture guidelines recommend separating classes that have different responsibilities and driving the UI from a model.
- A UI controller is a UI-based class like `Activity` or `Fragment`. UI controllers should only contain **logic** that handles UI and operating system interactions; they shouldn't be the source of data to be displayed in the UI. Put that data and any related logic in a `ViewModel`.
- The `ViewModel` class stores and manages UI-related data. The `ViewModel` class allows data to survive configuration changes such as screen rotations.
- `ViewModel` is one of the recommended Android Architecture Components.
---
- `LiveData` holds data; `LiveData` is a wrapper that can be used with any data
- `LiveData` is observable, which means that an observer is notified when the data held by the `LiveData` object changes.
- `LiveData` is lifecycle-aware. When you attach an observer to the `LiveData`, the observer is associated with a `LifecycleOwner` (usually an Activity or Fragment). The `LiveData` only updates observers that are in an active lifecycle state such as `STARTED` or `RESUMED`. [More about LiveData](https://developer.android.com/topic/libraries/architecture/livedata.html#work_livedata).
- Apps can listen to the `LiveData` changes from the layout using `Data Binding` and `binding` expressions.
- `Binding` expressions are written within the layout in the attribute properties (such as `android:text`) referencing the layout properties.

https://user-images.githubusercontent.com/78266241/132083713-fe86d0cc-b33d-4a31-a26f-1a40679ad03c.mp4

## 6. Cupcake App
The cupcake app demonstrates how to design and implement an online ordering app.

**What I learned:**

- The `ViewModel` is a part of the [Android Architecture Components](https://developer.android.com/topic/architecture) and the app data saved within the ViewModel is retained during configuration changes. To add a `ViewModel` to your app, you create a new class and extend it from the `ViewModel` class.
- [Shared ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel.html#sharing) is used to save the app's data from multiple fragments in a single ViewModel. Multiple fragments in the app will access the shared ViewModel using their activity scope.
- [LifecycleOwner] is a class that has an Android lifecycle, such as an activity or a fragment.
- `LiveData observer` observes the changes to the app's data only if the lifecycle owner is in active states (`STARTED` or `RESUMED`).
- `Listener bindings` are lambda expressions that run when an event happens such as an `onClick` event. They are similar to method references such as `textview.setOnClickListener(clickListener)` but listener bindings let you run arbitrary data binding expressions.
- The `LiveData` transformation method(s) provides a way to perform data manipulations on the source `LiveData` and return a resulting `LiveData` object.
- Android frameworks provides a class called `SimpleDateFormat`, a class for formatting and parsing dates in a locale-sensitive manner. It allows for formatting **(date → text)** and parsing **(text → date)** dates.
---
- Android keeps a back stack of all the destinations I've visited, with each new destination being pushed onto the stack.
- By tapping the **Up** or **Back** button, I can pop destinations off the back stack.
- Using the **Jetpack Navigation component** helps me push and pop fragment destinations off the back stack, so that the default Back button behavior comes for free.
- Specify the `app:popUpTo` attribute on an action in the navigation graph, in order to pop destinations off the back stack until the specified one in the attribute value.
- Specify `app:popUpToInclusive="true"` on an action when the destination specified in app:popUpTo should also be popped off the back stack.
- I can create an implicit intent to share content to an email app, using `Intent.ACTION_SEND` and populating intent extras such as `Intent.EXTRA_EMAIL`, `Intent.EXTRA_SUBJECT`, and `Intent.EXTRA_TEXT` to name a few.
- Use a `plurals` resource if you want to use different string resources based on quantity, such as the singular or plural case.

https://user-images.githubusercontent.com/78266241/132084351-abe3973b-9ea1-4655-ae02-5ce65259791a.mp4

## 7. MarsPhotoApp
This app show a list of Mars pictures from an API

**What I learned:**

- The requirement of **concurrency** control arose to ensure correctness when shared data item is updated by multiple transactions at the same time
- What a thread is, and why threads are important for concurrency
- How to write concurrent code in Kotlin using coroutines: [Concurrency with coroutines](https://kotlinlang.org/docs/mobile/concurrency-overview.html#immutable-and-frozen-state)
- When and when not to mark a function as "suspend": [see](https://proandroiddev.com/how-do-coroutines-work-under-the-hood-803e6e9da8bb)
- The roles of a CoroutineScope, Job, and Dispatcher: [see](https://developer.android.com/kotlin/coroutines/coroutines-adv)
- The difference between Deferred and Await: [see](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-deferred/await.html)
---
### REST web services
- A web service is software-based functionality offered over the internet that enables your app to make requests and get data back.
- Common web services use a [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) architecture. Web services that offer REST architecture are known as RESTful services. RESTful web services are built using standard web components and protocols.
- I make a request to a REST web service in a standardized way, via URIs.
- To use a web service, an app must establish a network connection and communicate with the service. Then the app must receive and parse response data into a format the app can use.
- The [Retrofit](https://square.github.io/retrofit/) library is a client library that enables my app to make requests to a REST web service.
- Use converters to tell `Retrofit` what to do with data it sends to the web service and gets back from the web service. For example, the `ScalarsConverter` converter treats the web service data as a String or other primitive.
- To enable your app to make connections to the internet, add the `android.permission.INTERNET` permission in the Android manifest.
### JSON parsing
- The response from a web service is often formatted in [JSON](https://www.json.org/json-en.html), a common format for representing structured data.
- A JSON object is a collection of key-value pairs.
- A collection of JSON objects is a JSON array. You get a JSON array as a response from a web service.
- The keys in a key-value pair are surrounded by quotes. The values can be numbers or strings.
- The [Moshi](https://github.com/square/moshi) library is an Android JSON parser that converts a JSON string into Kotlin objects. Retrofit has a converter that works with Moshi.
Moshi matches the keys in a JSON response with properties in a data object that have the same name.
- To use a different property name for a key, annotate that property with the `@Json` annotation and the JSON key name.For example, `@Json(name = "img_src") val imgSrcUrl: String` 
---
- The [Coil](https://coil-kt.github.io/coil/) library simplifies the process of managing images, such as download, buffer, decode, and cache images in your app.
- [Binding adapters](https://developer.android.com/topic/libraries/data-binding/binding-adapters) are extension methods that sit between a view and that view's bound data. Binding adapters provide custom behavior when the data changes, for example, to call Coil to load an image from a URL into an ImageView.
- Binding adapters are extension methods annotated with the `@BindingAdapter` annotation.
- To display a grid of images, use a `RecyclerView` with a `GridLayoutManager`.
- To update the list of properties when it changes, use a binding adapter between the  `RecyclerView` and the layout.

https://user-images.githubusercontent.com/78266241/132085494-51f446d8-251c-404a-9d84-fd1c870670a8.mp4

## 8. ParksDatabase App & BusScheduling App

**What I learned**

- Relational databases allow you to store data, organized into tables, columns, and rows.
- I can retrieve data from a database using the SQL `SELECT` statement.
- I can use a variety of clauses in a `SELECT` statement including `WHERE`, `GROUP BY`, `ORDER BY`, and `LIMIT` to make your queries more specific.
- I can use [aggregate functions](https://cloud.google.com/bigquery/docs/reference/standard-sql/aggregate_functions) to combine data from multiple rows into a single column. [Other reference](https://www.codecademy.com/learn/learn-sql/modules/learn-sql-aggregate-functions/cheatsheet).
- I can add, update, and delete rows in a database using the SQL `INSERT`, `UPDATE`, and `DELETE` statements respectively.
---
- Tables in a SQL database are represented in `Room` by Kotlin classes called entities.
- The `DAO` provides methods corresponding to SQL commands that interact with the database.
- `ViewModel` is a lifecycle aware component used to separate your app's data from its view.
- The `AppDatabase` class tells `Room` which entities to use, provides access to the `DAO`, and performs any setup when creating the database.
- `ListAdapter` is an adapter used with `RecyclerView` that is ideal for handling dynamically updated lists.
- `Flow` is a Kotlin feature for returning a stream of data and can be used with Room to ensure the UI and database are in sync.

https://user-images.githubusercontent.com/78266241/132086779-3044b013-caae-49ad-b867-270ebe734afd.mp4

## 9. Inventory App
This app displays a list of bus scheduling time 

**What I learned**

- Define your tables as data classes annotated with `@Entity`. Define properties annotated with `@ColumnInfo` as columns in the tables.
- Define a data access object `DAO` as an interface annotated with `@Dao`. The `DAO` maps Kotlin functions to database queries.
- Use annotations to define `@Insert`, `@Delete`, and `@Update` functions.
- Use the `@Query` annotation with an SQLite query string as a parameter for any other queries.
- Use `Database Inspector` or `App Inspector` to view the data saved in the Android SQLite database.
---
- Kotlin provides an ability to extend a class with new functionality without having to inherit from the class or modify the existing definition of the class. This is done via special declarations called [extensions](https://kotlinlang.org/docs/extensions.html).
- To consume the `Flow` data as a `LiveData` value, use the `asLiveData()` function.
- The `copy()` function is provided by default to all the instances of data classes. It lets you copy an object and change some of its properties, while keeping the rest of its properties unchanged.

https://user-images.githubusercontent.com/78266241/132087390-f0c6fe8f-b282-4ae4-b8c0-013b92ed865d.mp4












