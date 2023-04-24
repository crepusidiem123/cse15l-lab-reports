# Lab Report 2

## Part 1

Based on the instructions, here is the code for StringServer:

```
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler{
    ArrayList<String> store = new ArrayList<>();
    String output;
    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return new String("This is a String server that allows you to add string segments to be displayed.");
        } 
        else if (url.getPath().contains("/add-message")) {
            output = "";
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                store.add(parameters[1]);
            }
            for(String i:store){
                if(i != null){
                    output += i + "\n";
                }  
            }
            return output;
        }
        else    
            return "404 Not Found!";
    }
}

class StringServer{
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }
        int port = Integer.parseInt(args[0]);
        Server.start(port, new Handler());
    }
}
```
When running this code with the port 1024, two implementation of "add-message" commands are shown as follows:
  
<img width="369" alt="image" src="https://user-images.githubusercontent.com/130092052/233869691-152f62a0-50b6-4486-9373-39fb0b228b7e.png">

<img width="381" alt="image" src="https://user-images.githubusercontent.com/130092052/233869708-8c3ed537-ef5a-4986-8bf1-f9336fb520d1.png">

For the first case:
  
* The method handleRequest is invoked with the specific subcase "else if"
* The value url is http://localhost:1024/add-message?s=CSE15L, which leads to its "getPath()" is "/add-message" and the value "getQuery()" is "s=CSE15L", and the arraylist store initially does not store any values, so does the string output.
* The values of arraylist store changes by having string "CSE15L" as its first position, and the value of output into "CSE15L\n"

For the second case:

* The method handleRequest is invoked with the specific subcase "else if"
* The value url is http://localhost:1024/add-message?s=CSE15LSP23, The value of "getPath()" is "/add-message" and the value "getQuery()" is "s=CSE15LSP23", and the arraylist store initially stores string "CSE15L" as its first position, and output initially stores "CSE15L\n".
* The values of arraylist store changes by having string "CSE15LSP23" as its second position, and the value of output into "CSE15L\nCSE15LSP23\n"

## Part 2

**Failure-inducing Input**
```
public class LengthChecker implements StringChecker{
        @Override
        public boolean checkString(String s){
            if (s.length()>3)
                return true;
            return false;
        }

    }
    
    @Test
    public void filterTest1(){
        List<String> input = new ArrayList<>();
        input.add("Hello");
        input.add("Hi");
        input.add("How are you today");
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Hello");
        expectedOutput.add("How are you today");
        assertEquals(expectedOutput, ListExamples.filter(input, new LengthChecker()));
    }
```

**Non Failure-inducing Input**
```
public class LengthChecker implements StringChecker{
        @Override
        public boolean checkString(String s){
            if (s.length()>3)
                return true;
            return false;
        }

    }
    
    @Test
    public void filterTest1(){
        List<String> input = new ArrayList<>();
        input.add("Hello");
        input.add("Hi");
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Hello");
        assertEquals(expectedOutput, ListExamples.filter(input, new LengthChecker()));
    }
```

**Sympotoms for those two inputs**

Test for failure-inducing input:
<img width="582" alt="image" src="https://user-images.githubusercontent.com/130092052/233889825-6c00d211-fb0d-4fb5-a906-88d09659173b.png">

Test for non failure-inducing input:
<img width="564" alt="image" src="https://user-images.githubusercontent.com/130092052/233890001-843a9bb0-9bc5-4d4b-9f3d-02311043d888.png">

**Fixing the bug**

*Before fixation*
```
static List<String> filter(List<String> list, StringChecker sc) {
    List<String> result = new ArrayList<>();
    for(String s: list) {
      if(sc.checkString(s)) {
        result.add(0, s);
      }
    }
    return result;
  }
```

*After fixation*
```
static List<String> filter(List<String> list, StringChecker sc) {
    List<String> result = new ArrayList<>();
    for(String s: list) {
      if(sc.checkString(s)) {
        result.add(s);
      }
    }
    return result;
  }
```

The code after fixation changes the argument of add from "0,s" to "s", which does not change the order of the arraylist after filter. The reason behind this is that the original code, after confirming that the certain element satisfies the condition, adds that certain element to the front of the returning arraylist. My fixation changes this process into adding to the end of the arraylist, prohibiting from reversing the arraylist after filter.

## Part 3

Despite my past experience on coding, I've never got a chance to have a peek at the decomposition of a website. Moreover, I've never thought about having a webpage of my own to play with. These are all valuable experiences that I have longed for a while.
