import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._
import com.excilys.ebi.gatling.http.Headers.Names._
import akka.util.duration._
import bootstrap._

class HelloSimulation extends Simulation {

        val httpConf = httpConfig
                .baseURL("http://localhost:8084")
                .acceptCharsetHeader("ISO-8859-1,utf-8;q=0.7,*;q=0.7")
                .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                .acceptEncodingHeader("gzip, deflate")
                .acceptLanguageHeader("fr,fr-fr;q=0.8,en-us;q=0.5,en;q=0.3")
                .disableFollowRedirect

        val headers_1 = Map(
                "Keep-Alive" -> "115")

        val scn = scenario("Scenario name")
                .exec(
                        http("main page")
                                .get("/")
                                .headers(headers_1)
                                .check(status.is(200)))
                .pause(0 milliseconds, 100 milliseconds)
                .feed(csv("worker_id.csv").circular)
                .exec(
                           http("Worker page")
                                .get("/worker/${worker_id}")
                                .check(status.is(200)))

        setUp(scn.users(10).ramp(10).protocolConfig(httpConf))
}