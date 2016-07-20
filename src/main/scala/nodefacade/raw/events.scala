package nodefacade
package raw

import scala.scalajs.js
import js.annotation.{ JSExport, JSName, ScalaJSDefined }
import js.Dynamic.{ global, newInstance => jsnew, literal }

@js.native
trait EventEmitter extends js.Object {
  def addListener(eventName: String, listener: js.Function): EventEmitter = js.native
  def emit(eventName: String, args: js.Any*): Boolean = js.native
  def getMaxListeners(): Int = js.native
  def listenerCount(eventName: String): Int = js.native
  def listeners(eventName: String): js.Array[js.Function] = js.native
  def on(eventName: String, listener: js.Function): EventEmitter = js.native
  def once(eventName: String, listener: js.Function): EventEmitter = js.native
  def removeListener(eventName: String, listener: js.Function): EventEmitter = js.native
  def setMaxListeners(n: Int): EventEmitter = js.native
}