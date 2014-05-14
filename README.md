Example project with a bug I can't figure out. 

Short version: When the specification written in Spock pass, everything is ok and I see the result. But when I make it fail, the specification is skipped (or the result is not reported).

## Steps to reproduce

Clone and run:
```
mvn test -Dtest=HelloSpockSpec
```

The result will be: 

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running cz.rozumim.HelloSpockSpec
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.066 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
```

This is OK.

Now change `/src/test/groovy/cz/rozumim/HelloSpockSpec.groovy`. Comment out line 12:

```
"Spock" | 5    // result: Running cz.rozumim.HelloSpockSpec -> Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
```
and remove the comment from line 13:

```
// "Spock" | 3    // result: Running cz.rozumim.HelloSpockSpec -> There are no tests to run.
```

It will make the spec fail. Run again:

```
mvn test -Dtest=HelloSpockSpec
```

and the result will be:

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running cz.rozumim.HelloSpockSpec
@SLRunning cz.rozumim.HelloSpockSpec

There are no tests to run.

Results :

Tests run: 0, Failures: 0, Errors: 0, Skipped: 0
```

There are no tests to run. What is going on? 

Thx.
