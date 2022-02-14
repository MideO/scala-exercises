package com.github.mideo
package shapelessexamples

import org.specs2.mutable.Specification
import shapeless.syntax.std.tuple._

class TupleSpec extends Specification {

  "Specification for  shapeless tuple".br

  "it should allow scala manipulations" >> {

    (23, "foo", true).head should beEqualTo(23)
    (23, "foo", true).tail should beEqualTo(("foo", true))
    (23, "foo", true).drop(2) should beEqualTo(Tuple1(true))
    (23, "foo", true).take(2) should beEqualTo((23, "foo"))
    (23, "foo", true).split(1) should beEqualTo(Tuple1(23), ("foo", true))
    23 +: ("foo", true) should beEqualTo((23, "foo", true))
    (23, "foo") :+ true should beEqualTo((23, "foo", true))
    (23, "foo") ++ (true, 2.0) should beEqualTo((23, "foo", true,2.0))

    (23, "foo", true) map option should beEqualTo((Some(23), Some("foo"), Some(true)))

  }


}
