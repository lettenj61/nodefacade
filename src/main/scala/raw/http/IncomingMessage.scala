package com.github.lettenj61.nodefacade
package nodejs
package raw
package http

import scala.scalajs.js
import js.annotation.{ JSExport, JSName, ScalaJSDefined }
import js.Dynamic.{ global, newInstance => jsnew, literal }

import raw.EventEmitter

@js.native
trait IncomingMessage extends EventEmitter {

  val headers: js.Dynamic = js.native
  val httpVersion: String = js.native
  val method: String = js.native
  val rawHeaders: js.Array[String] = js.native
  val rawTrailers: js.Dynamic = js.native
  def setTimeout(msecs: Long, callback: js.Function): IncomingMessage = js.native
  val statusCode: Int = js.native
  val statusMessage: String = js.native
  // TODO: should implement a facade to replaces this Dynamic.
  val socket: js.Dynamic = js.native
  val trailers: js.Dynamic = js.native
  val url: String = js.native
}
