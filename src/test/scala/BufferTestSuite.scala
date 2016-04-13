package com.github.lettenj61.nodefacade
package test

import scala.scalajs.js
import js.Dynamic.literal

import utest._
import nodejs.raw.Buffer

object BufferTestSuite extends TestSuite {

  val companion = nodejs.Buffer
  def randomChars(n: Int = 8): String = util.Random.alphanumeric.take(n).mkString

  val tests = this {
    "constructors" - {
      val b1 = new Buffer(128).fill(0)
      val b2 = Buffer(js.Array(5, 5, 5, 5))
      val b3 = Buffer(b1)
      val b4 = Buffer("come join me testing")
      assert((b1 compare b2) == -1)
    }
    "Buffer.byteLength()" - {
      assert(companion.byteLength("abcde", "utf8") == 5)
      for (i <- List.range(0, 100)) {
        val next = util.Random.nextInt(64)
        val chars = randomChars(next)
        val (x, y) = (companion.byteLength(chars), chars.getBytes.length)
        // println(s"$x ?= $y")
        assert(x == y)
      }
    }
    "Buffer.isBuffer()" - {
      assert(companion.isBuffer(new js.Array[Int]) == false)
      assert(companion.isBuffer("XXXAAA") == false)
      assert(companion.isBuffer(new Buffer(10)) == true)
    }
  }
}