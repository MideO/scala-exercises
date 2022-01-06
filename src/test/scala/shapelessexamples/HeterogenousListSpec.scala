package com.github.mideo
package shapelessexamples

import org.specs2.mutable.Specification
import shapeless.HNil

class HeterogenousListSpec extends Specification {
  "Specification for some polymorphic functions in shapeless".br

  "map should transform HList  with choose" >> {
    hListMapper.map() should beEqualTo(Some(1) :: Some("foo") :: HNil)
  }
  "id should flatmap HList  with choose" >> {
    hListMapper.id() should beEqualTo(23 :: "foo" :: true :: HNil)
  }

  "addSize should return size of HList" >> {
    val l = 23 :: "foo" :: (13, "wibble") :: HNil

    l.foldLeft(0)(addSize) should beEqualTo(11)
  }

  "zipper should return transform HList" >> {
    zipper(("wibble", 45)) should beEqualTo(1 :: ("wibble", 45) :: 3.0 :: HNil)
  }


  "zipper  deleteRight should return transform HList" >> {
    zipper.deleteRight should beEqualTo(1 ::  3.0 :: HNil)
  }
}
