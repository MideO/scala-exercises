package com.github.mideo
package shapelessexamples

import org.specs2.mutable.Specification


class PolyMorphicFunctionsSpec extends Specification {
  "Specification for some polymorphic functions in shapeless".br

  "pairApply should return (Option[Int], Option[Char])" >> {
    pairApply(Seq(1, 2, 3), Seq('a', 'b', 'a')) must contain(Some(1), Some('a'))
  }

  "polySize must be polymorphic" >> {
    polySize(23) should beEqualTo(1)
    polySize("foo") should beEqualTo(3)
    polySize((23, "foo")) should beEqualTo(4)
    polySize(((23, "foo"), 13)) should beEqualTo(5)

  }
}
