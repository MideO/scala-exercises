package com.github.mideo

import shapeless.Id
import shapeless.PolyDefns.~>

package object shapelessexamples {
  object choose extends (Seq ~> Option) {
    def apply[T](s : Seq[T]): Option[T] = s.headOption
  }

  object option extends (Id ~> Option) {
    def apply[T](t: T) = Option(t)
  }
}
