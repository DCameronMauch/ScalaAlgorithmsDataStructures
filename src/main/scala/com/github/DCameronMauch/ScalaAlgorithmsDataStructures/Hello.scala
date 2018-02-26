package com.github.DCameronMauch.ScalaAlgorithmsDataStructures

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
