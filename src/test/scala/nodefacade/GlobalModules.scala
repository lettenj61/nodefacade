package nodefacade
package test

import scala.scalajs.js
import js.Dynamic.literal

import utest._
import nodefacade.nodejs._

object GlobalModules extends TestSuite {

  val tests = this {
    "process.cwd" - {
      println(process.cwd)
    }
    "process.env" - {
      for ((k, v) <- process.env) println(s"$k -> $v")
    }
    "fs.stats" - {
      val stat = fs.statSync(process.cwd)
      println(util.inspect(stat))
    }
  }
}

