package com.github.mideo
package shapelessexamples

import shapeless._


object pairApply {
  def apply(s: Seq[_]*): Seq[Option[Any]] = s map choose toList
}

object polySize extends Poly1 {
  implicit def caseInt: Case.Aux[Int, Int] = at[Int](_ => 1)

  implicit def caseString: Case.Aux[String, Int] = at[String](_.length)

  implicit def caseTuple[T, U](implicit st: Case.Aux[T, Int], su: Case.Aux[U, Int]): Case.Aux[(T, U), Int] =
    at[(T, U)](t => polySize(t._1) + polySize(t._2))
}