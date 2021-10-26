package td3.e2.exceptions;

public class MonException extends Throwable {
    private String exp;

    public MonException(String exp) {
        this.exp = exp;
    }

    public String getExp() {
        return exp;
    }
}
