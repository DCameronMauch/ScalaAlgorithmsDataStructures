package com.github.DCameronMauch.ScalaAlgorithmsDataStructures.algorithms

import org.scalatest._

class AnagramSpec extends FlatSpec with Matchers {
  val source1 = "abcabcabc"
  val source2 = "abcdefghi"

  "given a direct substring" should "return set of indexes" in {
    Anagram.contains(source1, "abc") shouldBe Set(0, 1, 2, 3, 4, 5, 6)
    Anagram.contains(source2, "def") shouldBe Set(3)
  }

  "given an out of order substring" should "return set of indexes" in {
    Anagram.contains(source1, "cab") shouldBe Set(0, 1, 2, 3, 4, 5, 6)
    Anagram.contains(source2, "efd") shouldBe Set(3)
  }

  "given a pattern that does not exist in the source regardless of order" should "return empty set" in {
    Anagram.contains(source1, "aba") shouldBe Set.empty
    Anagram.contains(source2, "deh") shouldBe Set.empty
  }

  "given an empty source" should "return empty set" in {
    Anagram.contains("", "abc") shouldBe Set.empty
  }

  "given an empty pattern" should "return empty set" in {
    Anagram.contains(source1, "") shouldBe Set.empty
    Anagram.contains(source2, "") shouldBe Set.empty
  }
}
