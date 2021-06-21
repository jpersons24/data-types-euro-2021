# Using Kotlin Data Types, Conditionals and Looping Iterations

## Creating an ordered list

1. First we want to declare a variable with a good name, `countries`. Since we don't expect the *value of this list to change* and we don't want the `countries` variable to *represent any other value*, we will make the decleration and assigment **immutable** using `val` and `listOf` syntax.

> `val countries = ("country name", "country name", "country name", .....)`

***


2. Next we will need to define 6 variables that represent a map Object. Each map object will contain a key of the country name and the value of their points. We use the `val` keyword to declare each variable becuase the variable name `groupA` should be *immutable*. This way it can only ever represent that specific map object. The variable itself should be declared as a *mutable* map, so we use the `mutableMapOf` syntax.

```
 val groupA = mutableMapOf<String, Int>()
 val groupB = mutableMapOf<String, Int>()
 val groupC = mutableMapOf<String, Int>()
 val groupD = mutableMapOf<String, Int>()
 val groupE = mutableMapOf<String, Int>()
 val groupF = mutableMapOf<String, Int>()
```

> Our `mutableMapOf<String, Int>()` is declaring a mutableMapOf *String* keys and *Int* values.
> This is known as explicit type decleration. It is necessary with no assignment of values is included upon decleration of the variable. However, it can be inferred by Kotlin if key and value pairs are given upon variable declaration.
> These key and value pairs will be added in a future step when we implement some looping with conditions

***


3. You can use a `for` loop with deconstructed loop variables and the function `.withIndex()` in order to print a list of all the teams and their corresponding spot on the list.

```
  for ((teamIndex, team) in countries.withIndex()) {
    println("${teamIndex + 1}: $team)
  }
```

***

4. Finally, we will use a do..while loop. This `do..while` loop will run a certain block of code as long as the `while` condition is `true`. We will be using an `if..else if` statement in order to implement logic making sure the proper team are placed in the proper groups. Our basic structure will look like this is pseudocode:

```
// do this{
    // start a counter at 1
    // for each country and its index within countries...
        // if the country index + 1 is less than or equal to 4
            // add the country to groupA
        // else if the country index + 1 > 4 and less than or equal to 8
            // add the country to groupB
        // else if the country index + 1 > 8 and less than or equal to 12
            // add the country to groupC
        // else if the country index + 1 > 12 and less than or equal to 16
            // add the country to groupD
        // else if the country index + 1 > 16 and less than or equal to 20
            // add the country to groupE
        // else if the country index + 1 > 20 and less than or equal to 24
            // add the country to groupD
    
    // after each loop increment the counter variable
// } while (the counter variable is less than or equal to the size of the countries list)
```

***

5. Final step is really up to you. Using some simple print statements, you can display the groups and their team:points key and value pair in a readable way on your console.

> I use the *Code Runner* extension within my vsCode Editor. If you use vsCode and want to use the *Code Runner* extension, simply search it in the command pallete or you can check it out [here](https://marketplace.visualstudio.com/items?itemName=formulahendry.code-runner) in the vsCode extensions marketplace. You will also need to download a JVM, which allows your local environment to run Java. I did this using home brew, but you may have a different preference.


## Conclusion

This small Kotlin project is designed to show a few different things. Mutable and immutable variable decleration. Mutable and immutable different data types, especially the difference of different collection variable types.

Moving forward, I will explore different types of number variables. More specifically, how we can write function within our program to keep track of scores, and who will be moving onto the next wound of the Euro 2021 tournament according to the number of points they have.




 