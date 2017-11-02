/**
 * HR API 1.0.1
 * post and pull employees from the DB
 *
 * OpenAPI spec version: 0.0.1
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wordnik.client.api

import com.wordnik.client.model.Employee
import com.wordnik.client.model.EmployeeInfo
import com.wordnik.client.model.Inline_response_200
import com.wordnik.client.model.Inline_response_200_1

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class DefaultApi (implicit val swagger: Swagger) extends ScalatraServlet
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "DefaultApi"
  override protected val applicationName: Option[String] = Some("/SmartBear_Software/HRAPI10/1.0.0/Default")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val usersToDBGetOperation = (apiOperation[Inline_response_200]("usersToDBGet")
      summary ""
      parameters()
  )

  get("/usersToDB",operation(usersToDBGetOperation)) {
  }

  

  val usersToDBPostOperation = (apiOperation[Inline_response_200_1]("usersToDBPost")
      summary ""
      parameters(bodyParam[Employee]("employee").description("").optional)
  )

  post("/usersToDB",operation(usersToDBPostOperation)) {
    
    
          val employee = parsedBody.extract[Employee]

    println("employee: " + employee)
  }

}
