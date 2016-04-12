package com.github.lettenj61.nodefacade
package nodejs
package raw
package net

import scala.scalajs.js
import js.annotation.{ JSExport, JSName, ScalaJSDefined }
import js.Dynamic.{ global, newInstance => jsnew, literal }

@js.native
trait Server extends js.Object {
  def address(): js.Dynamic = js.native
  def close(callback: js.Function = ???): Unit = js.native
  @deprecated("server.connections is deprecated in Node.js, use server.getConnections() instead.", "0.1.0")
  val connections: Int = js.native
  def getConnections(callback: js.Function2[js.Error, Int, _]): Int = js.native
  @JSName("listen")
  def listenHandle(handle: Any, backlog: Int = 511, callback: js.Function = ???): js.Dynamic = js.native
  @JSName("listen")
  def listenPort(port: Int, hostname: js.UndefOr[String] = js.undefined,
            backlog: Int = 511, callback: js.Function = ???): Server = js.native
}
