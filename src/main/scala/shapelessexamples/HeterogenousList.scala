package com.github.mideo
package shapelessexamples

import shapeless._
import poly.identity
import syntax.zipper._

object hListMapper {
  def map() = {
    val se = Seq(1) :: Seq("foo") :: HNil
    se map choose
  }

  def id() = {
    val l = (23 :: "foo" :: HNil) :: HNil :: (true :: HNil) :: HNil

    l flatMap identity
  }
}

object addSize extends Poly2 {
  implicit def default[T](implicit st: polySize.Case.Aux[T, Int]) =
    at[Int, T] { (acc, t) => acc + polySize(t) }

}

object zipper {
  def apply(t:(String, Int)) = {
    val l = 1 :: "foo" :: 3.0 :: HNil
    l.toZipper.right.put(t).reify
  }

  def deleteRight = {
    val l = 1 :: "foo" :: 3.0 :: HNil

    l.toZipper.right.delete.reify
  }
}