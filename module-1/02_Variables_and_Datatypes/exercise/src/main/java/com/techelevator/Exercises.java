package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

		System.out.println("1. Number of birds remaining = " + birdsRemaining);
		System.out.println();

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

		System.out.println("2. Number of extra birds = " + numberOfExtraBirds);
		System.out.println();

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRacoonsPlayingAtStart = 3;
		int numberOfRacoonsStoppedPlaying = 2;
		int numberOfRacoonsStillPlaying = numberOfRacoonsPlayingAtStart - numberOfRacoonsStoppedPlaying;

		System.out.println("3. Number of racoons left playing in woods after some leave = " + numberOfRacoonsStillPlaying);
		System.out.println();


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int howManyLessBeesThanFlowers = numberOfFlowers - numberOfBees;

		System.out.println("4. How many less bees than flowers = " + howManyLessBeesThanFlowers);
		System.out.println();

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int numberOfPigeonsAtStart = 1;
		int numberOfPigeonsJoined = 1;
		int totalNumberOfPigeons = numberOfPigeonsAtStart + numberOfPigeonsJoined;

		System.out.println("5. Total number of pigeons eating breadcrumbs = " + totalNumberOfPigeons);
		System.out.println();


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int numberOfOwlsAtStart = 3;
		int numberOfOwlsJoined = 2;
		int totalNumberOfOwls = numberOfOwlsAtStart + numberOfOwlsJoined;

		System.out.println("6. Total number of owls on fence = " + totalNumberOfOwls);
		System.out.println();


        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int numberOfBeaversWorking = 2;
		int numberOfBeaversGoneToSwim = 1;
		int totalNumberOfBeaversLeftWorking = numberOfBeaversWorking - numberOfBeaversGoneToSwim;

		System.out.println("7. Total number of beavers left working = " + totalNumberOfBeaversLeftWorking);
		System.out.println();


        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int numberOfToucansSitting = 2;
		int numberOfToucansJoined = 1;
		int newNumberOfToucansSitting = numberOfToucansSitting + numberOfToucansJoined;

		System.out.println("8. Total number of toucans sitting on a tree branch = " + newNumberOfToucansSitting);
		System.out.println();


        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int numberOfSquirrels = 4;
		int numberOfNuts = 2;
		int howManyMoreSquirrelsThanNuts = numberOfSquirrels - numberOfNuts;

		System.out.println("9. How many more squirrels than nuts = " + howManyMoreSquirrelsThanNuts);
		System.out.println();

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int numberOfQuartersFound = 1;
		int numberOfDimesFound = 1;
		int numberOfNickelsFound = 2;
		double valueOfQuartersFound = numberOfQuartersFound * 0.25;
		double valueOfDimesFound = numberOfDimesFound * 0.10;
		double valueOfNickelsFound = numberOfNickelsFound * 0.05;
		double totalValueOfMoneyFound = valueOfQuartersFound + valueOfDimesFound+ valueOfNickelsFound;

		System.out.println("10. Value of money Mrs. Hilt found = " + totalValueOfMoneyFound);
		System.out.println();

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int numberOfMuffinsFromBriersClass = 18;
		int numberOfMuffinsFromMacAdamsClass = 20;
		int numberOfMuffinsFromFlannerysClass = 17;
		int totalNumberOfMuffinsFromFirstGradeClasses = numberOfMuffinsFromBriersClass + numberOfMuffinsFromMacAdamsClass + numberOfMuffinsFromFlannerysClass;

		System.out.println("11. Total number of muffins baked by first grade classes = " + totalNumberOfMuffinsFromFirstGradeClasses);
		System.out.println();

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double priceOfYoyo = 0.24;
		double priceOfWhistle = 0.14;
		double totalPriceOfToys = priceOfYoyo + priceOfWhistle;

		System.out.println("12. Total amount Mrs. Hilt spent on toys = " + totalPriceOfToys);
		System.out.println();


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int numberOfLargeMarshmallowsUsed= 8;
		int numberOfMiniMarshmallowsUsed= 10;
		int totalNumberOfMarshmallowsUsed = numberOfLargeMarshmallowsUsed + numberOfMiniMarshmallowsUsed;

		System.out.println("13. Total number of marshmallows used in baking = " + totalNumberOfMarshmallowsUsed);
		System.out.println();

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int inchesOfSnowAtHiltsHouse = 29;
		int inchesOfSnowAtBrecknockElementary = 17;
		int totalInchesOfSnowDifference = inchesOfSnowAtHiltsHouse - inchesOfSnowAtBrecknockElementary;

		System.out.println("14. The difference of snowfall between Mrs. Hilt's house and Brecknock Elementary School (in inches) = " + totalInchesOfSnowDifference);
		System.out.println();


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double moneyAtStart = 10.00;
		double moneySpentOnToyTruck = 3.00;
		double moneySpentOnPencilCase = 2.00;
		double moneyLeftAfterShopping = moneyAtStart - moneySpentOnToyTruck - moneySpentOnPencilCase;

		System.out.println("15. Amount of money Mrs. Hilt has left after shopping = " + moneyLeftAfterShopping);
		System.out.println();


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int numberOfMarblesInCollectionAtStart = 16;
		int numberOfMarblesLost = 7;
		int numberOfMarblesLeftInCollection = numberOfMarblesInCollectionAtStart - numberOfMarblesLost;

		System.out.println("16. Number of marbles left in Josh's collection = " + numberOfMarblesLeftInCollection);
		System.out.println();


        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int numberOfSeashellsInMegansCollection = 19;
		int numberOfSeashellsThatMeganWants = 25;
		int numberOfSeashellsToFind = numberOfSeashellsThatMeganWants - numberOfSeashellsInMegansCollection;

		System.out.println("17. Number of seashells left to find = " + numberOfSeashellsToFind);
		System.out.println();

        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalNumberOfBalloons = 17;
		int numberOfRedBalloons = 8;
		int numberOfGreenBalloons = totalNumberOfBalloons - numberOfRedBalloons;

		System.out.println("18. Number of green balloons = " + numberOfGreenBalloons);
		System.out.println();


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int numberOfBooksOnShelfAtStart = 38;
		int numberOfBooksAddedToShelf = 10;
		int numberOfBooksOnShelfAtEnd = numberOfBooksOnShelfAtStart + numberOfBooksAddedToShelf;

		System.out.println("19. Number of books on shelf = " + numberOfBooksOnShelfAtEnd);
		System.out.println();


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int numberOfLegsOnABee = 6;
		int numberOfBeesWithLegs = 8;
		int totalNumberOfBeeLegs = numberOfLegsOnABee * numberOfBeesWithLegs;

		System.out.println("20. Total number of bee legs = " + totalNumberOfBeeLegs);
		System.out.println();


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double costOfIceCreamCone = 0.99;
		int numberOfCones = 2;
		double totalCostOfIceCreamCones = costOfIceCreamCone * numberOfCones;

		System.out.println("21. Total cost of ice cream cones = " + totalCostOfIceCreamCones);
		System.out.println();


        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int totalNumberOfRocksNeededForBorder = 125;
		int currentNumberOfRocks = 64;
		int numberOfRocksNeededToCompleteProject = totalNumberOfRocksNeededForBorder - currentNumberOfRocks;

		System.out.println("22. Number of rocks needed to complete garden border = " + numberOfRocksNeededToCompleteProject);
		System.out.println();


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int numberOfMarblesMrsHiltHadAtStart = 38;
		int numberOfMarblesMrsHiltLost = 15;
		int numberOfMarblesMrsHillHasAtEnd = numberOfMarblesMrsHiltHadAtStart - numberOfMarblesMrsHiltLost;

		System.out.println("23. Number of marbles Mrs. Hilt has left = " + numberOfMarblesMrsHillHasAtEnd);
		System.out.println();


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalNumberOfMiles = 78;
		int numberOfMilesDriven = 32;
		int numberOfMilesLeft = totalNumberOfMiles - numberOfMilesDriven;

		System.out.println("24. Number of miles left to drive = " + numberOfMilesLeft);
		System.out.println();


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int minutesSpentShovelingSnowInMorning = 90;
		int minutesSpentShovelingSnowInAfternoon = 45;
		int totalNumberOfMinutesSpentShovelingSnow = minutesSpentShovelingSnowInMorning + minutesSpentShovelingSnowInAfternoon;

		System.out.println("25. Time (in minutes) spent shoveling snow = " + totalNumberOfMinutesSpentShovelingSnow);
		System.out.println();


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int totalNumberOfHotDogs = 6;
		double costPerHotDog = 0.50;
		double totalCostOfHotDogs = totalNumberOfHotDogs * costPerHotDog;

		System.out.println("26. Total cost of hot dogs = " + totalCostOfHotDogs);
		System.out.println();


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double totalAmountAvailable = 0.50;
		double costPerPencil = 0.07;
		int numberOfPencilsPurchasable = (int)(totalAmountAvailable/costPerPencil);

		System.out.println("27. Total number of pencils Mrs. Hilt can buy = " + numberOfPencilsPurchasable);
		System.out.println();


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalNumberOfButterflies = 33;
		int numberOfOrangeButterflies = 20;
		int numberOfRedButterflies = totalNumberOfButterflies - numberOfOrangeButterflies;

		System.out.println("28. Number of red butterflies = " + numberOfRedButterflies);
		System.out.println();


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double moneyPaid = 1.00;
		double costOfCandyPurchase = 0.54;
		double changeOwed = moneyPaid - costOfCandyPurchase;

		System.out.println("How much change is owed = " + changeOwed);
		System.out.println();


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int numberOfTreesInBackyard = 13;
		int numberOfTreesToPlant = 12;
		int numberOfTreesInBackyardAfterPlanting = numberOfTreesInBackyard + numberOfTreesToPlant;

		System.out.println("30. New number of trees in backyard after planting = " + numberOfTreesInBackyardAfterPlanting);
		System.out.println();


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int numberOfDaysLeftToWait = 2;
		int numberOfHoursPerDay = 24;
		int numberOfHoursLeftToWait = numberOfDaysLeftToWait * numberOfHoursPerDay;

		System.out.println("31. Number of hours until Joy sees her grandma = " + numberOfHoursLeftToWait);
		System.out.println();


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numberOfCousins = 4;
		int piecesOfGumPerCousin = 5;
		int totalAmountOfGumNeeded = numberOfCousins * piecesOfGumPerCousin;

		System.out.println("32. Amount of gum needed (in pieces) = " + totalAmountOfGumNeeded);
		System.out.println();


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double amountDanHasAtStart = 3.00;
		double amountDanSpentOnCandy = 1.00;
		double amountDanHasLeft = amountDanHasAtStart - amountDanSpentOnCandy;

		System.out.println("33. Amount of money Dan has left = " + amountDanHasLeft);
		System.out.println();


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int numberOfBoatsOnLake = 5;
		int numberOfPeoplePerBoat = 3;
		int numberOfPeopleOnLake = numberOfBoatsOnLake * numberOfPeoplePerBoat;

		System.out.println("34. Number of people on the lake in boats = " + numberOfPeopleOnLake);
		System.out.println();


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int numberOfLegosAtStart = 380;
		int numberOfLegosLost = 57;
		int numberOfLegosLeftAtEnd = numberOfLegosAtStart - numberOfLegosLost;

		System.out.println("35. Number of legos Ellen has left = " + numberOfLegosLeftAtEnd);
		System.out.println();


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int numberOfMuffinsAlreadyBaked = 35;
		int totalNumberOfMuffinsNeeded = 83;
		int numberOfMuffinsLeftToBake = totalNumberOfMuffinsNeeded - numberOfMuffinsAlreadyBaked;

		System.out.println("36. Number of muffins Arthur still needs to bake = " + numberOfMuffinsLeftToBake);
		System.out.println();


        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int numberOfCrayonsWillyHas = 1400;
		int numberOfCrayonsLucyHas = 290;
		int differenceBetweenAmountOfCrayons = numberOfCrayonsWillyHas - numberOfCrayonsLucyHas;

		System.out.println("37. Number of crayons Willy has more than Lucy = " + differenceBetweenAmountOfCrayons);
		System.out.println();


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int numberOfStickersPerPage = 10;
		int numberOfStickerPages = 22;
		int totalNumberOfStickers = numberOfStickersPerPage * numberOfStickerPages;

		System.out.println("38. Total number of stickers = " + totalNumberOfStickers);
		System.out.println();

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int numberOfCupcakesAvailable = 100;
		int numberOfChildren = 8;
		double numberOfCupcakesPerChild = (double)numberOfCupcakesAvailable/(double)numberOfChildren;

		System.out.println("39. Number of cupcakes per child = " + numberOfCupcakesPerChild);
		System.out.println();

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int numberOfGingerbreadCookies = 47;
		int numberOfCookiesPerJar = 6;
		int numberOfCookiesLeftOver = numberOfGingerbreadCookies % numberOfCookiesPerJar;

		System.out.println("40. Number of leftover cookies = " + numberOfCookiesLeftOver);
		System.out.println();


        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates, 
	    and then divide the total number of rooms to be painted by the combined rate.
	    */
     

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */

	}

}
