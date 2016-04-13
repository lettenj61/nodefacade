package com.github.lettenj61.nodefacade
package nodejs
package raw
package stream

import scala.scalajs.js
import js.annotation.{ JSExport, JSName, ScalaJSDefined }
import js.Dynamic.{ global, newInstance => jsnew, literal }
import js.|

import nodejs.raw.{ Buffer, EventEmitter }

@js.native
trait Readable extends EventEmitter {
  def isPaused(): Boolean = js.native
  def pause(): Readable = js.native
  def pipe(destination: Writable, options: js.Dynamic = literal(end = true)): Writable = js.native
  def read(size: js.UndefOr[Int] = ???): String | Buffer = js.native
}

@js.native
trait Writable extends EventEmitter
