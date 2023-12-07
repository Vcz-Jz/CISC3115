class MalformedInputFileException extends RuntimeException {
  private int lineNo;
  
  public MalformedInputFileException(String fieldName, int lineNo) {
    super("Malformed field " + fieldName + " found at " + lineNo);
  }
  
  public MalformedInputFileException(String msg) {
    super(msg);
  }
}
