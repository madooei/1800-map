package demo;

import map.LinkedMap;
import map.Map;

/** A demo of LinkedMap: a website storing each username with its password. */
public final class LinkedMapDemo {

  private LinkedMapDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    Map<String, String> passwords = new LinkedMap<>();

    // Each username is new, so each put returns true.
    System.out.println("register alice: " + passwords.put("alice", "wonderland"));
    System.out.println("register bob: " + passwords.put("bob", "builder123"));
    System.out.println("register carol: " + passwords.put("carol", "swift99"));

    // Expect 3.
    System.out.println("users registered: " + passwords.size());

    // Expect wonderland.
    System.out.println("alice's password: " + passwords.get("alice"));

    // bob is already present, so put replaces the password and returns false.
    System.out.println("bob changes the password: " + passwords.put("bob", "fixerUpper"));

    // Expect fixerUpper, and still 3 users.
    System.out.println("bob's password: " + passwords.get("bob"));
    System.out.println("users registered: " + passwords.size());

    // Expect true.
    System.out.println("is carol registered? " + passwords.containsKey("carol"));

    // carol is present, so remove returns true.
    System.out.println("carol deletes the account: " + passwords.remove("carol"));

    // Expect alice and bob, in no particular order.
    System.out.print("all usernames:");
    for (String username : passwords) {
      System.out.print(" " + username);
    }
    System.out.println();

    // Expect alice -> wonderland and bob -> fixerUpper, in no particular order.
    System.out.println("all usernames with passwords:");
    for (Map.Entry<String, String> entry : passwords.entries()) {
      System.out.println("  " + entry.key() + " -> " + entry.value());
    }
  }
}
