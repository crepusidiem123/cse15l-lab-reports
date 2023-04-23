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
