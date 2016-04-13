package com.github.lettenj61.nodefacade

import scala.scalajs.js
import js.Dynamic.{ global, newInstance => New, literal => Let }

package object nodejs {

  def Require(lib: String): js.Dynamic = global.require(lib)

  /* Global objects */
  val module: raw.Module = global.module.asInstanceOf[raw.Module]
  val console: raw.Console = global.console.asInstanceOf[raw.Console]
  lazy val process: raw.Process = global.process.asInstanceOf[raw.Process]
  val Buffer: raw.Buffer.type = raw.Buffer

  /* Objects accesible through `require` function. */
  lazy val http: raw.Http = Require("http").asInstanceOf[raw.Http]
  lazy val path: raw.Path = Require("path").asInstanceOf[raw.Path]
  lazy val util: raw.Util = Require("util").asInstanceOf[raw.Util]

}

