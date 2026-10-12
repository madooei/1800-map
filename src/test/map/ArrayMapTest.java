package map;

/** Runs the Map contract suite against ArrayMap. */
public class ArrayMapTest extends MapTest {

  @Override
  protected Map<String, Integer> createMap() {
    return new ArrayMap<>();
  }
}
