package com.galvanize;
import java.util.*;

public class Business implements Addressable {
  private final List<Address> addresses = new ArrayList<Address>();
  private final String name;

  public Business(final String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public List<Address> getAddresses() {
    return this.addresses;
  }

  public void addAddress(Address address) {
    addresses.add(address);
  }
}
