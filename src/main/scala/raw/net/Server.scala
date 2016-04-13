package com.github.lettenj61.nodefacade
package nodejs
package raw
package net

import scala.scalajs.js
import js.annotation.{ JSExport, JSName, ScalaJSDefined }
import js.Dynamic.{ global, newInstance => jsnew, literal }

import nodejs.raw.EventEmitter

@js.native
trait Server extends EventEmitter {
  import Server._

  def address(): Address = js.native
  def close(callback: js.Function = ???): Server = js.native
  @deprecated("server.connections is deprecated in Node.js, use server.getConnections() instead.", "0.1.0")
  val connections: Int = js.native
  def getConnections(callback: js.Function2[js.Error, Int, _]): Int = js.native
  @JSName("listen")
  def listenHandle(handle: Any, backlog: Int = 511, callback: js.Function = ???): Server = js.native
  @JSName("listen")
  def listenOptions(options: js.Dynamic, callback: js.Function = ???): Server = js.native
  @JSName("listen")
  def listenPath(path: String, backlog: Int = 511, callback: js.Function = ???): Server = js.native
  @JSName("listen")
  def listenPort(port: Int, hostname: js.UndefOr[String] = js.undefined,
            backlog: Int = 511, callback: js.Function = ???): Server = js.native
  var maxConnections: Int = js.native
  def ref: Server = js.native
  def unref: Server = js.native
}

object Server { self =>

  @ScalaJSDefined
  trait Address extends js.Object {
    def port: Int
    def family: String
    def address: String
  }

  @ScalaJSDefined
  trait ListeningOptions extends js.Object {
    def port: Int
    def host: js.UndefOr[String]
    def backlog: Int
    def path: js.UndefOr[String]
    def exclusive: Boolean
  }
}
