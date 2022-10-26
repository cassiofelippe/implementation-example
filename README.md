# Implementation Example

For now, this project has only a small example of the best way to make a resource available on a controller.

### Example

Let's imagine that we have a json file that our application has to provide to other APIs, via HTTP request.  
Below I'm gonna show three different ways to make this resource available.


### I. The "Dependent" implementation

[DependentImplementationController.java](https://github.com/cassiofelippe/implementation-example/blob/master/src/main/java/io/github/cassio/parameter/implementation/controller/DependentImplementationController.java)

I decided to call this solution as *dependent* because it depends on the resource availability in order to return it's content to the API.  
Although this implementation doesn't require your application to be restarted in order to update the resource value, the moment the resource is not present, it can no longer provide anything to who requested it.


### II. The "Fixed" implementation

[FixedImplementationController.java](https://github.com/cassiofelippe/implementation-example/blob/master/src/main/java/io/github/cassio/parameter/implementation/controller/FixedImplementationController.java)

Here, once the app is running, it always provide the resource's content, whether the resource is available or not.  
The problem here is that since it stores the content when the app is starting, a restart would be required to update it's content.


### III. The "Complete" implementation

[CompleteImplementationController.java](https://github.com/cassiofelippe/implementation-example/blob/master/src/main/java/io/github/cassio/parameter/implementation/controller/CompleteImplementationController.java)

This time, we decided to get the best from the implementations above in a single controller.  
Once the app is booting up, it stores the resource's content in a variable, thus making the resource always available.  
But how do we update it? Well... just the way we want!  
Using a scheduled task, from user interaction, or even each time it is requested. But only if the resource is available.  
I've implemented the update as the resource is requested, but you got the idea.




