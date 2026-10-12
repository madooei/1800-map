# Map

The `Map` ADT and two implementations of it, one backed by linked nodes and one backed by an array of entries. A map is iterable over its keys, and its `entries()` method gives a second iteration over the key-value pairs. A JUnit suite checks both implementations against the same contract, both iterations included.

## Prerequisites

- JDK 17+
- The JUnit jar is already vendored in `lib/`; there is nothing to download.

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  lib/
    junit-platform-console-standalone-6.1.0.jar
  src/
    main/
      map/
        Map.java                        # the Map ADT contract, with the nested Map.Entry
        LinkedMap.java                  # node-backed Map
        ArrayMap.java                   # array-backed Map
        Main.java                       # demo entry point (the password example)
    test/
      map/
        MapTest.java                    # abstract: the Map contract suite
        LinkedMapTest.java              # runs the suite against LinkedMap
        ArrayMapTest.java               # runs the suite against ArrayMap
  scripts/
    run.sh                              # compile and run the Map demo (map.Main)
    test.sh                             # compile and run every JUnit test
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite.
- `scripts/test.sh map.ArrayMapTest` — compiles everything and runs only that test class. Use this while you are working on one class and the other is still empty.
- `scripts/run.sh` — compiles everything and runs the `Main` demo.

## What's here

- `map.Map<K, V>` — the Map contract: `put`, `get`, `remove`, `containsKey`, and `size`. It extends `Iterable<K>`, so every map also has `iterator()`, which visits the keys. Its `entries()` method returns an `Iterable<Map.Entry<K, V>>` that visits the key-value pairs. `Map.Entry<K, V>` is a read-only view of one pair, with `key()` and `value()`.
- `map.LinkedMap<K, V>` — the node-backed implementation. Each node holds a key and a value, and it is also the `Map.Entry` that `entries()` hands back.
- `map.ArrayMap<K, V>` — the array-backed implementation. Each slot of the array holds an entry with a key and a value, and that entry is the `Map.Entry` that `entries()` hands back.
- `map.Main` — a runnable demo of the password example, run on both implementations. It lists the usernames with an enhanced `for` loop, then lists each username with its password through `entries()`.
- `map.MapTest` — the abstract contract suite. It checks `put`, `get`, `remove`, `containsKey`, `size`, and both iterations. The iteration tests check which keys and pairs come out, not their order, because a map has no order.
- `map.LinkedMapTest`, `map.ArrayMapTest` — each runs the contract suite against one implementation.
