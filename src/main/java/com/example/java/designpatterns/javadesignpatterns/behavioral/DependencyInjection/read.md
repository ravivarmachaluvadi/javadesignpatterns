# Java Dependency Injection

Java Dependency Injection design pattern allows us to remove the hard-coded dependencies and make our application loosely 
coupled, extendable and maintainable. We can implement dependency injection in java to move the dependency resolution 
from compile-time to runtime.

Java Dependency injection seems hard to grasp with theory, so I would take a simple example and then we will see how to 
use dependency injection pattern to achieve loose coupling and extendability in the application.

Let’s say we have an application where we consume EmailService to send emails. Normally we would implement this like below.

One of the best example of setter dependency injection is Struts2 Servlet API Aware interfaces.

Whether to use Constructor based dependency injection or setter based is a design decision and depends on your requirements. 
For example, if my application can’t work at all without the service class then I would prefer constructor based DI or else 
I would go for setter method based DI to use it only when it’s really needed.

Dependency Injection in Java is a way to achieve Inversion of control (IoC) in our application by moving objects binding 
from compile time to runtime. We can achieve IoC through Factory Pattern, Template Method Design Pattern, Strategy Pattern 
and Service Locator pattern too.

Spring Dependency Injection, Google Guice and Java EE CDI frameworks facilitate the process of dependency injection 
through use of Java Reflection API and java annotations. All we need is to annotate the field, constructor or setter 
method and configure them in configuration xml files or classes.

# Benefits of Java Dependency Injection

Some of the benefits of using Dependency Injection in Java are:

Separation of Concerns
Boilerplate Code reduction in application classes because all work to initialize dependencies is handled by the injector 
component

Configurable components makes application easily extendable

Unit testing is easy with mock objects

# Disadvantages of Java Dependency Injection

Java Dependency injection has some disadvantages too:

If overused, it can lead to maintenance issues because the effect of changes are known at runtime.

Dependency injection in java hides the service class dependencies that can lead to runtime errors that would have been 
caught at compile time.

