package nodefacade
package raw
package stream

import scala.scalajs.js
import js.annotation.{ JSExport, JSName, ScalaJSDefined }
import js.Dynamic.{ global, newInstance => jsnew, literal }
import js.|

import nodefacade.raw.{ Buffer, EventEmitter }

@js.native
class Readable extends EventEmitter {
  def isPaused(): Boolean = js.native
  def pause(): Readable = js.native
  def pipe(destination: Writable, options: js.Dynamic = literal(end = true)): Writable = js.native
  def read(size: js.UndefOr[Int] = ???): String | Buffer = js.native
  def resume(): Readable = js.native
  def setEncoding(encoding: String): Readable = js.native
  def unpipe(destination: js.UndefOr[Writable] = js.undefined): Unit = js.native
  def unshift(chunk: Buffer | String): Unit = js.native
  // TODO: should implement typed version of an `old` stream?
  def wrap(stream: js.Dynamic): Readable = js.native
}

@js.native
trait Writable extends EventEmitter {
  def cork(): Unit = js.native
  def end(chunk: String | Buffer = ???, encoding: js.UndefOr[String] = js.undefined,
          callback: js.Function = ???): Unit = js.native
  def setDefaultEncoding(encoding: String): Unit = js.native
  def uncork(): Unit = js.native
  def write(chunk: String | Buffer, encoding: js.UndefOr[String] = js.undefined,
            callback: js.Function = ???): Boolean = js.native
}
