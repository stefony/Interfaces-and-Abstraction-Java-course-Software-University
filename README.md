# Interfaces-and-Abstraction-Java-course-Software-University
Courses from my education Java OOP in @SoftUni
Courses from my education Java OOP in @SoftUni exercises: Interfaces and Abstraction Object-Oriented-Programming 01.Car Shop Build hierarchy from classes and interfaces

Interface Serializable Car Seat +TIRES:Integer +toString(): String +getModel: String

getColor():String
getHorsePower():Integer
countryProduced():String
02.Car Shop Extend Extend the previous problem Car CarImpl +CarImpl(model, color, horsePower, countryProduced) +toString(): String

Rentable Sellable +getMinRentDay():Integer + getPrice():Double

getPricePerDay():Double
Audi Seat -minRentDay: Integer - price: Double -pricePerDay: Double + toString():String +toString(): String

03.Say Hello Build hierarchy from classes and interfaces

Person

getName():String
sayHello():String
Bulgarian European Chinese

name: String - name: String - name: String
sayHello():String + sayHello():String
Say Hello Extend Build hierarchy from classes and interfaces Person + getName():String + sayHello():String Abstract BasePerson
name: String
BasePerson(name)
getName():String
setName():void
Bulgarian European Chinese

name: String - name: String - name: String
sayHello():String + sayHello():String
05.Border Control It’s the future, you’re the ruler of a totalitarian dystopian society inhabited by citizens and robots, since you’re afraid of rebellions you decide to implement strict control of who enters your city. Your soldiers check the Ids of everyone who enters and leaves. You will receive from the console an unknown amount of lines until the command "End" is received, on each line, there will be the information for either a citizen or a robot who tries to enter your city in the format "{name} {age} {id}" for citizens and "{model} {id}" for robots.
After the end command on the next line, you will receive a single number representing the last digits of fake ids, all citizens or robots whose Id ends with the specified digits must be detained. The output of your program should consist of all detained Ids each on a separate line (the order of printing doesn’t matter). <> Identifiable + getId(): String

Robot Citizen - name: String

id: String - age: int
model: String - id: String
Robot(String, String) + Citizen(String, int, String)
getId(): String + getName(): String
getModel(): String + getAge(): int + getId(): String.
Ferrari Model an application that contains a class Ferrari and an interface. Your task is simple, you have a car - Ferrari, its model is "488-Spider" and it has a driver. Your Ferrari should have the functionality to use brakes and push the gas pedal. When the brakes are pushed down print "Brakes!", and when the gas pedal is pushed down - "brum-brumbrum-brrrrr". As you may have guessed this functionality is typical for all cars, so you should implement an interface to describe it. <> Car + brakes() : String + gas() : String

        Ferrari
        -driverName: String 
        -model: String
        + Ferrari (String) 
        + brakes() : String 
        + gas() : String 
        + toString(): String
Your task is to create a Ferrari and set the driver's name to the passed one in the input. After that, print the info. Take a look at the Examples to understand the task better. Input On the single input line, you will be given the driver's name. Output On the single output line, print the model, the messages from the brakes and gas pedal methods, and the driver's name. In the following format: "{model}/{brakes}/{gas}/{driver's name}" Constraints The input will always be valid, no need to check it explicitly! The Driver's name may contain any ASCII characters

Define an Interface Person Define an interface Person with methods getName and getAge. Define a class Citizen which implements Person and has a constructor which takes a String name and an int age. <> Person
getName() : String
getAge() : int
Citizen

name: String
age: int
Citizen (String, int)
getName() : String
getAge() : int 2.Multiple Implementation Using the code from the previous task, define an interface Identifiable with a String method getId and an interface Birthable with a String method getBirthDate and implement them in the Citizen class. Rewrite the Citizen constructor to accept the new parameters. Add the following code to your main method and submit it to Judge. <> <> <> Identifiable Birthable Person + getId(): String + getBirthDate(): String + getName(): String + getAge(): int Citizen
name: String
age: int
id: String
birthDate: String
Citizen(String, int, String, String)
getName(): String
getAge(): int
getId(): String
getBirthDate(): String
toString(): String
Birthday Celebrations It is a well-known fact that people celebrate birthdays, it is also known that some people also celebrate their pet's birthdays. Extend the program from your last task to add birthdates to citizens and include a class Pet, pets have a name and a birthdate. Also, create a class Robot that has an id and model. Encompass repeated functionality into interfaces and implement them in your classes. You will receive from the console an unknown amount of lines until the command "End" is received, each line will contain information in one of the following formats "Citizen {name} {age} {id} {birthdate}" for citizens, "Robot {model} {id}" for robots or "Pet {name} {birthdate}" for pets. After the end command on the next line, you will receive a single number representing a specific year, your task is to print all birthdates (of both citizens and pets) in that year in the format "{day}/{month}/{year}" (the order of printing doesn’t matter).
<> <> Identifiable Birthable

getId(): String + getBirthDate(): String
Citizen Robot Pet

name: String - id: String - name: String
age: int - model: String - birthDate: String id: String + Robot(String, String) + Pet(String, String) birthDate: String + getId(): String + getName(): String
Citizen(String, int, String, String) + getModel(): String + getBirthDate(): String
getName(): String
getAge(): int
getId(): String
4.Food Shortage Your totalitarian dystopian society suffers a shortage of food, so many rebels appear. Extend the code from your previous (Problem 2. Multiple Implementation) tasks with new functionality to solve this task. Define a class Rebel which has a name, age, and group (String), names are unique - there will never be 2 Rebels/Citizens or a Rebel and Citizen with the same name. Define an interface Buyer which defines the methods buyFood() and a getFood(). Implement the Buyer interface in the Citizen and Rebel class, both Rebels and Citizens start with 0 food, when a Rebel buys food his food increases by 5, when a Citizen buys food his food increases by 10. On the first line of the input you will receive an integer N - the number of people, on each of the next N lines you will receive information in one of the following formats "{name} {age} {id} {birthdate}" for a Citizen or "{name} {age}{group}" for a Rebel. After the N lines, until the command "End" is received, you will receive names of people who bought food, each on a new line. Note that not all names may be valid, in the case of an incorrect name - nothing should happen. On the only line of output, you should print the total amount of food purchased.

<> <> <> Buyer Identifiable Person

buyFood(): void + getId(): String + getName(): String
getFood(): int + getAge(): int
Citizen Rebel

name: String - name: String
age: int - age: int
id: String - group: String
birthDate: String - food: int
food: int
Citizen(String, int, String, String) + Rebel(String, int, String)
getName(): String + getName(): String
getAge(): int + getAge(): int
getId(): String + getGroup(): String
getFood(): int + getFood(): int
buyFood(): void + buyFood(): void
5.Telephony You have a business - manufacturing cell phones. But you have no software developers, so you call your friends and ask them to help you create cell phone software. They agree and you start working on the project. The project consists of one main model - a Smartphone. Each of your smartphones should have functionalities of calling other phones and browsing on the world wide web. Your friends are very busy, so you decide to write the code on your own. Here is the mandatory assignment: You should have a model - Smartphone and two separate functionalities which your smartphone has - to call other phones and to browse the world wide web. You should end up with one class and two interfaces.

      <<Interface>>                 <<Interface>> 
		      Callable			          		Browsable
			  + call(): String					+ browse(): String

					          	Smartphone
				  	   -	numbers: List<String> 
              -	urls: List<String>
					      + Smartphone(List<String>, List<String>) 
              + call(): String 
             + browse(): String
Input The input comes from the console. It will hold two lines: • First line: phone numbers to call (String), separated by spaces. • Second line: sites to visit (String), separated by spaces. Output • First, call all numbers in the order of input then browse all sites in order of input. • The functionality of calling phones is printing on the console the number which is being called in the format: "Calling... {number}". • The functionality of the browser should print on the console the site in the format: "Browsing: {site}!" (pay attention to the exclamation mark when printing URLs). • If there is a number in the input of the URLs, print: "Invalid URL!" and continue printing the rest of the URLs. • If there is a character different from a digit in a number, print: "Invalid number!" and continue to the next number.
