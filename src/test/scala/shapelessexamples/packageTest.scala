package com.github.mideo
package shapelessexamples

import org.specs2.mutable.Specification

class packageTest extends Specification {
  "Specification for some polymorphic functions in shapeless".br

  "choose should return Option[Int]" >> {
    choose.apply(Seq(1, 2, 3)) must beSome(1)
  }

  "choose should return Option[Char]" >> {
    choose(Seq('a', 'b', 'a')) must beSome('a')
  }


}
