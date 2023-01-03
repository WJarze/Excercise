package lambda.stringconnector;
@FunctionalInterface
public interface StringConnector {
    public String concat(String firstString, String secondString, String separator);
}
