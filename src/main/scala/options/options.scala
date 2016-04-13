package com.github.lettenj61.nodefacade
package nodejs
package options

import scala.scalajs.js
import js.annotation.{ JSExport, JSName, ScalaJSDefined }
import js.Dynamic.{ global, newInstance => jsnew, literal }
import js.|

@ScalaJSDefined
class WritableInit (
  val highWaterMark: Int = 16384,
  val decodeStrings: Boolean = true,
  val objectMode: Boolean = false,
  val write: js.Function = ???,
  val writev: js.Function = ???
) extends js.Object
