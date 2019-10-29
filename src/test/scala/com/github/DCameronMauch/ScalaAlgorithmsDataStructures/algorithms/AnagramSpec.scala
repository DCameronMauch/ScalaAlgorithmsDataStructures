package com.github.DCameronMauch.ScalaAlgorithmsDataStructures.algorithms

import org.scalatest._

class AnagramSpec extends FlatSpec with Matchers {
  val source1 = "abcabcabc"
  val source2 = "abcdefghi"

  "given a direct substring" should "return true" in {
    Anagram.contains(source1, "abc") shouldBe true
    Anagram.contains(source2, "def") shouldBe true
  }

  "given an out of order substring" should "return true" in {
    Anagram.contains(source1, "cab") shouldBe true
    Anagram.contains(source2, "efd") shouldBe true
  }

  "given a pattern that does not exist in the source regardless of order" should "return false" in {
    Anagram.contains(source1, "aba") shouldBe false
    Anagram.contains(source2, "deh") shouldBe false
  }

  "given an empty source" should "return false" in {
    Anagram.contains("", "abc") shouldBe false
  }

  "given an empty pattern" should "return false" in {
    Anagram.contains(source1, "") shouldBe false
    Anagram.contains(source2, "") shouldBe false
  }
}
