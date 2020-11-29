package Strategy.Functional;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<String, String> communicateViaEmail =
                destination -> "communicating " + destination + " via Email..";
        Function<String, String> communicateViaPhone =
                destination -> "communicating " + destination + " via Phone..";
        Function<String, String> communicateViaVideo =
                destination -> "communicating " + destination + " via Video..";


        CommunicationService communicationService = new CommunicationService();

        communicationService.setCommuncationMeans(communicateViaPhone);
        communicationService.communicate("1234567");

        communicationService.setCommuncationMeans(communicateViaEmail);
        communicationService.communicate("hi@me.com");
    }
}
