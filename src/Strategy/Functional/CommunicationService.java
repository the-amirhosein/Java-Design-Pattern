package Strategy.Functional;

import java.util.function.Function;

public class CommunicationService {

    private Function<String, String> communcationMeans;

    public void setCommuncationMeans(Function<String, String> communcationMeans) {
        this.communcationMeans = communcationMeans;
    }

    public void communicate(String destination) {
        System.out.println(this.communcationMeans.apply(destination));
    }
}
