package com.github.lettenj61.nodefacade
package nodejs
package raw

import scala.scalajs.js
import js.annotation.{ JSExport, JSName, ScalaJSDefined }
import js.Dynamic.{ global, newInstance => jsnew, literal }

@js.native
trait Console extends js.Object {
  def assert(value: js.Any, message: js.Any*): Unit = js.native
  def dir(obj: js.Any, options: js.Object = ???): Unit = js.native
  def error(data: js.Any*): Unit = js.native
  def info(data: js.Any*): Unit = js.native
  def log(data: js.Any*): Unit = js.native
  def time(label: String): Unit = js.native
  def timeEnd(label: String): Unit = js.native
  def trace(message: String*): Unit = js.native
  def warn(data: js.Any*): Unit = js.native
}

@js.native
trait Http extends js.Object {
  import raw.http._

  val METHODS: js.Array[String] = js.native
  // TODO: impelement as Int-keyed dictionary-like object, or a helper class.
  val STATUS_CODES: js.Dynamic = js.native
  def createServer(
      // TODO: make second tparam to be a `ServerResponse`
      requestListener: js.Function2[IncomingMessage, js.Dynamic, js.Dynamic] = ???): Server = js.native
}

@js.native
trait Module extends js.Object {
  val children: js.Array[_] = js.native
  val exports: Object = js.native
  val filename: String = js.native
  val id: String = js.native
  val loaded: Boolean = js.native
  val parent: Module = js.native
  def require(id: String): Object = js.native
}

@js.native
trait Path extends js.Object {
  def basename(p: String, ext: String = ???): String = js.native
  val delimiter: String = js.native
  def dirname(p: String): String = js.native
  def extname(p: String): String = js.native
  def format(pathObject: js.Any): String = js.native
  def isAbsolute(path: String): Boolean = js.native
  def join(paths: String*): String = js.native
  def normalize(p: String): String = js.native
  def parse(pathString: String): js.Dynamic = js.native
  val posix: Path = js.native
  def relative(from: String, to: String): String = js.native
  def resolve(paths: String*): String = js.native
  val sep: String = js.native
  val win32: Path = js.native
}

@js.native
trait Process extends EventEmitter {
  def abort(): Unit = js.native
  val arch: String = js.native
  val argv: js.Array[String] = js.native
  def chdir(directory: String): Unit = js.native
  // TODO: impelement NodeConfig helper as returning type.
  val config: js.Dynamic = js.native
  val connected: Boolean = js.native
  def cwd(): String = js.native
  def disconnect(): Unit = js.native
  def env: js.Dynamic = js.native
  val execArgv: js.Array[String] = js.native
  val execPath: String = js.native
  def exit(code: Int = 0): Unit = js.native
  var exitCode: js.UndefOr[Int] = js.native
  def getegid(): String = js.native
  def geteuid(): String = js.native
  def getgid(): String = js.native
  def getgroups(): String = js.native
  def getuid(): String = js.native
  def hrtime(): js.Array[Int] = js.native
  def initgroups(user: js.Any, extraGroup: js.Any): Unit = js.native
  def kill(pid: Int, signal: String): Unit = js.native
  val mainModule: js.UndefOr[String] = js.native
  def memoryUsage(): js.Dynamic = js.native
  def nextTick(callback: js.Function, args: js.Any*): Unit = js.native
  val pid: Int = js.native
  val platform: String = js.native
  val release: js.Dynamic = js.native
  def send(message: js.Any,
      sendHandle: js.UndefOr[_] = js.undefined, callback: js.Function = ???): Boolean = js.native
  def setegid(id: Int): Unit = js.native
  def seteuid(id: Int): Unit = js.native
  def setgid(id: Int): Unit = js.native
  def setgroups(groups: js.Array[js.Any]): Unit = js.native
  def setuid(id: Int): Unit = js.native
  val stderr: js.Dynamic = js.native
  val stdin: js.Dynamic = js.native
  val stdout: js.Dynamic = js.native
  var title: String = js.native
  def unmask(mask: js.UndefOr[Int] = js.undefined): Int = js.native
  def uptime(): Long = js.native
  val version: String = js.native
  val versions: js.Dynamic = js.native
}

@js.native
trait Util extends js.Object {
  @deprecated("uti.debug() is deprecated in Node.js, use console.error() instead.", "0.1.0")
  def debug(string: String): Unit = js.native
  def debuglog(section: String): js.Function = js.native
  def deprecate(function: js.Function, string: String): js.Function = js.native
  @deprecated("uti.error() is deprecated in Node.js, use console.error() instead.", "0.1.0")
  def error(string: String): Unit = js.native
  def format(format: js.Any*): String = js.native
  def inherits[A <: js.Any, B <: js.Any](
      constructor: js.ConstructorTag[A], superConstructor: js.ConstructorTag[B]): Unit = js.native
  def inspect(`object`: js.Any, options: js.UndefOr[Object] = js.undefined): String = js.native
  @deprecated("uti.isjs.Array() is deprecated in Node.js.", "0.1.0")
  def isArray(`object`: js.Any): Boolean = js.native
  @deprecated("uti.isBoolean() is deprecated in Node.js.", "0.1.0")
  def isBoolean(`object`: js.Any): Boolean = js.native
  @deprecated("uti.isBuffer() is deprecated in Node.js, use Buffer.isBuffer() instaed.", "0.1.0")
  def isBuffer(`object`: js.Any): Boolean = js.native
  @deprecated("uti.isDate() is deprecated in Node.js.", "0.1.0")
  def isDate(`object`: js.Any): Boolean = js.native
  @deprecated("uti.isError() is deprecated in Node.js.", "0.1.0")
  def isError(`object`: js.Any): Boolean = js.native
  @deprecated("uti.isFunction() is deprecated in Node.js.", "0.1.0")
  def isFunction(`object`: js.Any): Boolean = js.native
  @deprecated("uti.isNull() is deprecated in Node.js.", "0.1.0")
  def isNull(`object`: js.Any): Boolean = js.native
  @deprecated("uti.isNullOrUndefined() is deprecated in Node.js.", "0.1.0")
  def isNullOrUndefined(`object`: js.Any): Boolean = js.native
  @deprecated("uti.isNumber() is deprecated in Node.js.", "0.1.0")
  def isNumber(`object`: js.Any): Boolean = js.native
  @deprecated("uti.isObject() is deprecated in Node.js.", "0.1.0")
  def isObject(`object`: js.Any): Boolean = js.native
  @deprecated("uti.isPrimitive() is deprecated in Node.js.", "0.1.0")
  def isPrimitive(`object`: js.Any): Boolean = js.native
  @deprecated("uti.isRegExp() is deprecated in Node.js.", "0.1.0")
  def isRegExp(`object`: js.Any): Boolean = js.native
  @deprecated("uti.isString() is deprecated in Node.js.", "0.1.0")
  def isString(`object`: js.Any): Boolean = js.native
  @deprecated("uti.isSymbol() is deprecated in Node.js.", "0.1.0")
  def isSymbol(`object`: js.Any): Boolean = js.native
  @deprecated("uti.isUndefined() is deprecated in Node.js.", "0.1.0")
  def isUndefined(`object`: js.Any): Boolean = js.native
  def log(string: String): Unit = js.native
  @deprecated("uti.print() is deprecated in Node.js, use console.log() instead.", "0.1.0")
  def print(msg: js.Any*): Boolean = js.native
  // def pump(readableStream: ReadableStream,
  //          writableStream: WritableStream, callback: js.UndefOr[js.Function] = js.undefined)
  @deprecated("uti.puts() is deprecated in Node.js, use console.log() instead.", "0.1.0")
  def puts(msg: js.Any*): Boolean = js.native
}

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

