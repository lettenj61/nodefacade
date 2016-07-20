package nodefacade

import scala.scalajs.js
import js.Dynamic.{ global, newInstance => New, literal => Let }

package object nodejs {

  def requireModule(lib: String): js.Dynamic = global.require(lib)

  /* Global objects */
  val module: raw.Module = global.module.asInstanceOf[raw.Module]
  val console: raw.Console = global.console.asInstanceOf[raw.Console]
  lazy val process: raw.Process = global.process.asInstanceOf[raw.Process]
  val Buffer: raw.Buffer.type = raw.Buffer

  /* Objects accesible through `require` function. */
  lazy val http: raw.Http = requireModule("http").asInstanceOf[raw.Http]
  lazy val path: raw.Path = requireModule("path").asInstanceOf[raw.Path]
  lazy val util: raw.Util = requireModule("util").asInstanceOf[raw.Util]
  lazy val fs: raw.file.FS = requireModule("fs").asInstanceOf[raw.file.FS]

}

