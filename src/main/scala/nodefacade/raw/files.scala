package nodefacade
package raw
package file

import scala.scalajs.js
import js.typedarray.ArrayBuffer
import js.annotation.{ JSBracketAccess, JSExport, JSName, ScalaJSDefined }
import js.Dynamic.{ global, newInstance => jsnew, literal }
import js.|

@js.native
trait FSWatcher extends raw.EventEmitter {
  def close(): Unit = js.native
}

@js.native
trait Stats extends js.Object {
  val dev: Long = js.native
  val ino: Long = js.native
  val mode: Int = js.native
  val nlink: Int = js.native
  val uid: Int = js.native
  val gid: Int = js.native
  val rdev: Int = js.native
  val size: Long = js.native
  val blksize: Int = js.native
  val blocks: Int = js.native
  val atime: js.Date = js.native 
  val mtime: js.Date = js.native
  val ctime: js.Date = js.native
  val birthtime: js.Date = js.native
}

@ScalaJSDefined
class ReadOptions(
  val flags: String = "r",
  val encoding: String = null,
  val fd: String = null,
  val mode: Int = ???,
  val autoClose: Boolean = true
) extends js.Object

@js.native
trait FS extends js.Object {
  def appendFileSync(file: String, data: js.Object | String,
                     options: js.Object | String): Unit = js.native
  def closeSync(fd: Int): Unit = js.native
  def linkSync(srcpath: String, dstpath: String): Unit = js.native
  def mkdirSync(path: String, mode: Int = ???): Unit = js.native
  def readdirSync(path: String): js.Array[String] = js.native
  @JSName("readFileSync")
  def readStringSync(path: String, options: String | ReadOptions = "utf8"): String = js.native
  def statSync(path: String): Stats = js.native
}
