# kata-1-refactoring-instanceof
Refactoring instanceof conditionals to polymorphism

In this kata, we'll take a small code sample that uses instanceof and refactor it to use polymorphism instead.

To keep the scope of our changes small, we focus on one refactoring step at a time, supported by unit tests (provided).

Each step is captured in a branch, so you can play with the code and then compare your results with ours, compare the branches to each other, etc. Each branch has an instruction file (@STEP-N.TXT) on what we're trying to accomplish for the next step.

##Instructions for Using this Repo

To use this repo, clone it locally, and use whatever development tools you prefer. You may have to add a dependency to JUnit to build and run the code, depending on your particular setup. The unit test suite is named TestGenerateFlatRecordFromShopEvent, and the main class we are refactoring is named GenerateFlatRecordForShopEvent.

This repo includes eight branches, starting with the original code and progressing through each change step. Start with the original code branch (see below) and follow the @STEP-1.TXT instructions to modify it as suggested. Then compare your results to the next branch, and so on, until the end.
 
###Example:

    1. clone the repo locally:

```
        git clone https://github.com/.../kata-1-refactoring-instanceof.git
```

    2. CD to the source directory and switch to the first branch, named STEP-1 (yes, uppercase matters)
    
```
        cd kata-1-refactoring-instanceof
        git checkout STEP-1
```

    3. make sure the code builds and the unit tests pass (JUnit is the only dependency, v4.12)
    4. read the instructions for each step (e.g. @STEP-1.TXT in this case)
    5. modify the code as instructed
    6. run the unit tests (make them pass if they fail; kudos if you refactored carefully enough to not break the tests!)
    7. OPTIONAL BUT FUN: compare your changes to the next branch
    
```
        git diff STEP-1..STEP-2
```

    8. switch to the next branch (named STEP2, STEP3, ..., STEP8) and repeat from #2 above
       NOTE: if you've made changes, git will whine at you when you try to switch branches; 
             commit or stash your changes to make it shut up
    9. PROFIT! (metaphorically)

##Goals
The technical goal of this exercise is to refactor this:

```Java
public class GenerateFlatRecordForShopEvent {

    public String generateFlatFormatRecordForShopEvent(Object obj) {
        String flatFormatRecord = null;

        if (obj instanceof ShopOpenEvent) {
            ShopOpenEvent shopOpenEvent = (ShopOpenEvent) obj;
            flatFormatRecord = getShopOpenFlatFormatGenerator().convert(shopOpenEvent);
        }
        else if (obj instanceof ShopCloseEvent) {
            ShopCloseEvent shopCloseEvent = (ShopCloseEvent) obj;
            flatFormatRecord = getShopCloseFlatFormatGenerator().convert(shopCloseEvent);
        }

        return flatFormatRecord;
    }

    public ShopOpenEventFlatFormatGenerator getShopOpenFlatFormatGenerator() {
        return new ShopOpenEventFlatFormatGenerator();
    }

    public ShopCloseEventFlatFormatGenerator getShopCloseFlatFormatGenerator() {
        return new ShopCloseEventFlatFormatGenerator();
    }

}
```

into this:

```Java
public class GenerateFlatRecordForShopEvent {

    public String generateFlatFormatRecordForShopEvent(ShopEvent shopEvent) {
        return shopEvent.convertToFlatFormat();
    }
    
}
```

The learning goals are:

  1. recognize when polymorphism may be preferred over if-else branches, 
  2. know how to refactor conditionals (especially instanceof) into polymorphism,
  3. help prevent you from writing code like this example in the first place ;)

##Roadmap

We will do this in 6 tiny, incremental steps:

    1. extract methods for if-else blocks
        To discover exactly what each block does and how they might differ

    2. eliminate unnecessary generator classes
        To reduce the number of "moving parts" required

    3. add convert method to base class
        To give us a basis for polymorphism (note: could create interface instead)

    4. wrap casting
        To eliminate as much of the class-specific casting as we can

    5. call via polymorphism
        Polymorphism achievement unlocked!

    6. change API, adjust callers
        To expose our changes to the rest of the system
    
##*Suggestions for improvements are always welcome!*

Please [take the survey](https://www.surveymonkey.com/r/DHPRTL2) when done so we can keep making this better!

--Steven

slowe@thoughtworks.com

