# Dice - ***Java Console App to roll dice and flip coins***
   
## Controller - DiceApp 
Users can choose to roll one or multiple dice, of types D4, D6, D8, D10, D12, D20, & D100.   
(*If rolling multiple, the sum total of all rolls is displayed.*)   
```java
if (numberOfTimesToRollDice == 1) Dice.rollOne(diceSelection);
if (numberOfTimesToRollDice > 1) Dice.rollMany(diceSelection, numberOfTimesToRollDice);
```   

Users can also choose to flip one or multiple coins.   
(*If flipping multiple, a results total for heads and tails is displayed.*)   
```java
if (coinFlips == 1) Dice.flipOne();
if (coinFlips > 1) Dice.flipMany(coinFlips);
```   
   
## Model - Dice
### Rolling Dice
Uses Java's `ThreadLocalRandom` to get a random number between 1 and given value for dice type.   
```java
public static int getRoll(int diceType){
      return ThreadLocalRandom.current().nextInt(1, diceType + 1);
}
```   
If only rolling a single dice, the result is displayed.
```java 
public static void rollOne(int dice){
      // ... validation for entered dice type
      UserOutput.printRoll(getRoll(dice));
}
```   
If rolling multiple dice, each roll is printed on a new line, and then the sum total of all rolls is displayed. 
```java
public static void rollMany(int dice, int increment){
      // ... validation for entered dice type and number of times to roll dice
      int total = 0;
      for (int i = 1; i <= increment; i++) {
            int roll = getRoll(dice);
            UserOutput.printRoll(roll, i);
            total += roll;
      }
      UserOutput.printRollTotal(total);
}
```

### Flipping Coin
Calls the `getRoll` function to get a random number between 1 and 2 and assigns 'Heads' or 'Tails' based on the return.
```java
static final int COIN = 2;
public static String flipCoin( ){
      int randomNum = Dice.getRoll(COIN);
      return (randomNum == 1) ? "Heads" : "Tails";
}
```
