package com.github.DCameronMauch.ScalaAlgorithmsDataStructures.algorithms

object QuickSort {
  def sort(seq: Vector[Int]): Vector[Int] = {
    if (seq.length > 1) {
      val pivot = seq.head
      val (left, equal, right) = seq
        .foldLeft((Vector[Int](), Vector[Int](), Vector[Int]()))((acc, value) => acc match {
          case (left, equal, right) if value < pivot => (left :+ value, equal, right)
          case (left, equal, right) if value > pivot => (left, equal, right :+ value)
          case (left, equal, right) => (left, equal :+ value, right)
        })
      sort(left) ++ equal ++ sort(right)
    }
    else {
      seq
    }
  }
}