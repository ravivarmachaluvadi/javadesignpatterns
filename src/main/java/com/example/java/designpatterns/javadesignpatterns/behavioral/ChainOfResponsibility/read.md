# **Chain of Responsibility Design Pattern**

Chain of responsibility pattern is used to achieve loose coupling in software design where a request from client is 
passed to a chain of objects to process them. Then the object in the chain will decide themselves who will be processing 
the request and whether the request is required to be sent to the next object in the chain or not.

# Chain of Responsibility Pattern Example in JDK

Let’s see the example of chain of responsibility pattern in JDK and then we will proceed to implement a real life example 
of this pattern. We know that we can have multiple catch blocks in a try-catch block code. Here every catch block is kind 
of a processor to process that particular exception.

So when any exception occurs in the try block, its send to the first catch block to process. If the catch block is not 
able to process it, it forwards the request to next object in chain i.e next catch block. If even the last catch block is 
not able to process it, the exception is thrown outside of the chain to the calling program.

# Chain of Responsibility Design Pattern Example

One of the great example of Chain of Responsibility pattern is ATM Dispense machine. The user enters the amount to be 
dispensed and the machine dispense amount in terms of defined currency bills such as 50$, 20$, 10$ etc.

If the user enters an amount that is not multiples of 10, it throws error. We will use Chain of Responsibility pattern 
to implement this solution. The chain will process the request in the same order as below image.

Note that we can implement this solution easily in a single program itself but then the complexity will increase and the 
solution will be tightly coupled. So we will create a chain of dispense systems to dispense bills of 50$, 20$ and 10$.

# Chain of Responsibility Design Pattern Important Points

Client doesn’t know which part of the chain will be processing the request and it will send the request to the first object 
in the chain. For example, in our program ATMDispenseChain is unaware of who is processing the request to dispense the 
entered amount.

Each object in the chain will have it’s own implementation to process the request, either full or partial or to send it 
to the next object in the chain.

Every object in the chain should have reference to the next object in chain to forward the request to, its achieved by 
java composition.

Creating the chain carefully is very important otherwise there might be a case that the request will never be forwarded 
to a particular processor or there are no objects in the chain who are able to handle the request. In my implementation, 
I have added the check for the user entered amount to make sure it gets processed fully by all the processors but we might 
not check it and throw exception if the request reaches the last object and there are no further objects in the chain to 
forward the request to. This is a design decision.

Chain of Responsibility design pattern is good to achieve lose coupling but it comes with the trade-off of having a lot 
of implementation classes and maintenance problems if most of the code is common in all the implementations.

# Chain of Responsibility Pattern Examples in JDK

java.util.logging.Logger#log()

javax.servlet.Filter#doFilter()

Thats all for the Chain of Responsibility design pattern, I hope you liked it and its able to clear your understanding 
on this design pattern.
