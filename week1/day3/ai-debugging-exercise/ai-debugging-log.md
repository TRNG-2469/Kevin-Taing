## Roster App
To Copilot AI:

My Java program crashes with this stack trace:
```
"C:\Program Files\Java\jdk-26.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2026.2\lib\idea_rt.jar=55443" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Kevin\Desktop\job\revature\Kevin-Taing\week1\day3\ai-debugging-exercise\target\classes RosterApp
Student: Alice
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.startsWith(String)" because "studentNames[i]" is null
at RosterApp.main(RosterApp.java:9)

Process finished with exit code 1
```
Here is my code: 
```java
public class RosterApp {
public static void main(String[] args) {
String[] studentNames = new String[5];
studentNames[0] = "Alice";
studentNames[1] = "Bob";

        for (int i = 0; i < studentNames.length; i++) {
            // Triggers NullPointerException when reaching index 2
            if (studentNames[i].startsWith("A")) {
                System.out.println("Student: " + studentNames[i]);
            }
        }
    }
}
```
Explain the root cause of the error and provide a clean fix that enforces boundary validation checks instead of catching the exception.

Copilot AI Response:
```
Root Cause
The NullPointerException occurs because:
1.
Array initialization mismatch: A String[5] array is created but only 2 elements are initialized
2.
Uninitialized elements are null: Java initializes remaining elements (indices 2, 3, 4) to null by default
3.
Unsafe method call: The loop iterates through all 5 positions without null checks
4.
NPE at index 2: When the loop reaches index 2, calling .startsWith("A") on a null value crashes
```
Copilot AI Code Output:
```java
public class RosterApp {
    public static void main(String[] args) {
        String[] studentNames = new String[5];
        studentNames[0] = "Alice";
        studentNames[1] = "Bob";

        for (int i = 0; i < studentNames.length; i++) {
            if (studentNames[i] != null && studentNames[i].startsWith("A")) {
                System.out.println("Student: " + studentNames[i]);
            }
        }
    }
}
```
Conclusion: 
The fix adds a null check before calling the startsWith method, preventing the NullPointerException and ensuring that only initialized elements are processed.
## Airport App
To Copilot AI:

My Java program crashes with this stack trace:
```
"C:\Program Files\Java\jdk-26.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2026.2\lib\idea_rt.jar=60649" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Kevin\Desktop\job\revature\Kevin-Taing\week1\day3\ai-debugging-exercise\target\classes AirportApp
Exception in thread "main" java.lang.ClassCastException: class Airplane cannot be cast to class Car (Airplane and Car are in unnamed module of loader 'app')
	at AirportApp.main(AirportApp.java:10)

Process finished with exit code 1
```
Here is my code:
```java
class Vehicle {}
class Car extends Vehicle {}
class Airplane extends Vehicle {}

public class AirportApp {
    public static void main(String[] args) {
        Vehicle myVehicle = new Airplane();
        
        // Triggers ClassCastException at runtime
        Car myCar = (Car) myVehicle; 
        System.out.println("Vehicle downcasted successfully.");
    }
}
```
Explain the root cause of the error and provide a clean fix that enforces boundary validation checks instead of catching the exception.

Copilot AI Response:
```
Root Cause
The ClassCastException occurs because:
1. Type mismatch: myVehicle holds an Airplane instance, not a Car
2. Sibling classes: Both Car and Airplane extend Vehicle, but they're not related to each other
3. Invalid cast: Attempting to downcast an Airplane to Car is type-unsafe and fails at runtime
4. No validation: The code assumes the cast is valid without checking the actual runtime type
```
Copilot AI Code Output:
```java
class Vehicle {}
class Car extends Vehicle {}
class Airplane extends Vehicle {}

public class AirportApp {
    public static void main(String[] args) {
        Vehicle myVehicle = new Airplane();

        // Safely check type before casting
        if (myVehicle instanceof Car) {
            Car myCar = (Car) myVehicle;
            System.out.println("Vehicle downcasted successfully.");
        } else {
            System.out.println("Vehicle is not a Car. It is an " + myVehicle.getClass().getSimpleName());
        }
    }
}
```
Conclusion:
The fix uses the instanceof operator to check the actual type of myVehicle before attempting the cast.
## Financial App
To Copilot AI:

My Java program crashes with this stack trace: 
```
"C:\Program Files\Java\jdk-26.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2026.2\lib\idea_rt.jar=56056" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Kevin\Desktop\job\revature\Kevin-Taing\week1\day3\ai-debugging-exercise\target\classes FinancialApp
Processing report...
Exception in thread "main" java.lang.ArithmeticException: / by zero
at FinancialApp.computeScore(FinancialApp.java:3)
at FinancialApp.main(FinancialApp.java:8)

Process finished with exit code 1
```
Here is my code: 
```java
public class FinancialApp {
public static double computeScore(int totalScore, int divisor) {
return totalScore / divisor; // Triggers ArithmeticException if divisor is 0
}

    public static void main(String[] args) {
        System.out.println("Processing report...");
        double value = computeScore(100, 0);
        System.out.println("Calculated Value: " + value);
    }
}
```
Explain the root cause of the error and provide a clean fix that enforces boundary validation checks instead of catching the exception

Copilot AI Response:
```
Root Cause
The ArithmeticException occurs because:
1. Division by zero: computeScore() is called with divisor = 0
2. Invalid arithmetic: Division by zero is mathematically undefined and illegal in Java
3. No validation: The code performs the division without checking if the divisor is valid
4. Runtime crash: Java throws ArithmeticException when it encounters division by zero
```
Copilot AI Code Output:
```java
public class FinancialApp {
    public static double computeScore(int totalScore, int divisor) {
        if (divisor == 0) {
            System.err.println("Error: divisor cannot be zero.");
            return 0.0; // Return default value for invalid input
        }
        return totalScore / divisor;
    }

    public static void main(String[] args) {
        System.out.println("Processing report...");
        double value = computeScore(100, 0);
        System.out.println("Calculated Value: " + value);
    }
}
```
Conclusion:
The fix adds a boundary validation check for the divisor before performing the division, preventing the ArithmeticException and ensuring that the program handles invalid input gracefully.
