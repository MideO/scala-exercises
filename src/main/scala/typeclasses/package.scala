package com.github.mideo

package object typeclasses {

  sealed trait Attack[T] {
    def perform(t: T): String
  }

  case class Bee()

  case class Dog()


  implicit def beeAttack: Attack[Bee] = new Attack[Bee] {
    override def perform(t: Bee): String = "sting"
  }

  implicit def dogAttack: Attack[Dog] = new Attack[Dog] {
    override def perform(t: Dog): String = "bite"
  }

  implicit class AttackOps[T](t: T) {
    def attack(implicit attack: Attack[T]): String = attack.perform(t)
  }
}
