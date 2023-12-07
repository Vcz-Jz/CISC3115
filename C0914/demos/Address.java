class Address {
  private String streetAddress;
  
  public Address(String streetAddress) {
    this.streetAddress = streetAddress;
  }
  
  public Address(Address address) {
    streetAddress = address.streetAddress;
  }
  
  public String infoToString() {
    return streetAddress;
  }
  
  // setter make it mutable
  public void setAddress(String address) {
    streetAddress = address;
  }
}
