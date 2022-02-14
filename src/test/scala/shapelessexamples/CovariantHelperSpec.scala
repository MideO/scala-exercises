package com.github.mideo
package shapelessexamples

import org.specs2.mutable.Specification
import shapeless._
import scala.reflect.runtime.universe._

class CovariantHelperSpec extends Specification {
  import CovariantHelper._
  import CovariantHelper.{p => pee}
  "Specification for covariant shapeless types".br

  "it should be covariant" >> {
    (implicitly[TypeTag[APAP]].tpe.typeConstructor <:< typeOf[FFFF]) should beEqualTo(true)
    apap.isInstanceOf[FFFF] should beEqualTo(true)
    apap.unify.isInstanceOf[FFFF] should beEqualTo(true)
    apap.unify should beEqualTo(Apple() :: Pear() :: Apple() :: Pear() :: HNil)
    apap.toList should beEqualTo(List(a,pee,a,pee))
    import syntax.typeable._

    val ffff: FFFF = apap.unify
    val precise: Option[APAP] = ffff.cast[APAP]

    precise should beEqualTo(Some(a :: pee :: a :: pee :: HNil))
  }


}
