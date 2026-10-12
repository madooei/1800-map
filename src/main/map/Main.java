package map;

/** A demo of the Map ADT: a website storing each username with its password. */
public final class Main {

  private Main() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    System.out.println("LinkedMap:");
    storePasswords(new LinkedMap<>());
    System.out.println("ArrayMap:");
    storePasswords(new ArrayMap<>());
  }

  // Registers a few users, changes one password, then deletes one account.
  private static void storePasswords(Map<String, String> passwords) {
    System.out.println("  register alice: " + passwords.put("alice", "wonderland"));
    System.out.println("  register bob: " + passwords.put("bob", "builder123"));
    System.out.println("  register carol: " + passwords.put("carol", "swift99"));
    System.out.println("  users registered: " + passwords.size());
    System.out.println("  alice's password: " + passwords.get("alice"));
    System.out.println("  bob changes the password: " + passwords.put("bob", "fixerUpper"));
    System.out.println("  bob's password: " + passwords.get("bob"));
    System.out.println("  users registered: " + passwords.size());
    System.out.println("  dave's password: " + passwords.get("dave"));
    System.out.println("  is carol registered? " + passwords.containsKey("carol"));
    System.out.println("  is dave registered? " + passwords.containsKey("dave"));
    System.out.println("  carol deletes the account: " + passwords.remove("carol"));
    System.out.println("  dave deletes the account: " + passwords.remove("dave"));
    System.out.print("  all usernames:");
    for (String username : passwords) {
      System.out.print(" " + username);
    }
    System.out.println();
    System.out.println("  all usernames with passwords:");
    for (Map.Entry<String, String> entry : passwords.entries()) {
      System.out.println("    " + entry.key() + " -> " + entry.value());
    }
  }
}
