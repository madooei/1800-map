package map;

/** Runs the Map contract suite against LinkedMap. */
public class LinkedMapTest extends MapTest {

  @Override
  protected Map<String, Integer> createMap() {
    return new LinkedMap<>();
  }
}
