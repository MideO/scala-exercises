package com.github.mideo
package typeclasses

import org.specs2.mutable.Specification

class packageTest extends Specification {
  "Specification of Attacks perform by different Entities".br

  "A bee should sting when it attacks " >> {
    Bee().attack must be("sting")
  }


  "A dog should bite when it attacks" >> {
    Dog().attack must be("bite")
  }


}
