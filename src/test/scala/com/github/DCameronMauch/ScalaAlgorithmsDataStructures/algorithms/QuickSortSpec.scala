package com.github.DCameronMauch.ScalaAlgorithmsDataStructures.algorithms

import org.scalatest._

class QuickSortSpec extends FlatSpec with Matchers {
  "given empty set" should "return empty seq" in {
    val input = Vector[Int]()
    QuickSort.sort(input) shouldEqual input
  }

  "given sorted set" should "return empty seq" in {
    val input = Vector(1, 2, 3, 4, 5)
    QuickSort.sort(input) shouldEqual input
  }

  "given unsorted set" should "return sorted set" in {
    val input = Vector(1, 5, 2, 4, 3)
    val expected = Vector(1, 2, 3, 4, 5)
    QuickSort.sort(input) shouldEqual expected
  }

  "given large unsorted set" should "not blow up" in {
    val input = util.Random.shuffle((1 to 999999).toVector)
    val expected = input.sorted
    QuickSort.sort(input) shouldEqual expected
  }
}
