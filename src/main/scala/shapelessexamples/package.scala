package com.github.mideo

import shapeless.PolyDefns.~>

package object shapelessexamples {
  object choose extends (Seq ~> Option) {
    def apply[T](s : Seq[T]): Option[T] = s.headOption
  }

}
