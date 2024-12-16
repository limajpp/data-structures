package list.exceptions;

public class ListFullException extends RuntimeException {
  public ListFullException(String message) {
    super(message);
  }
}