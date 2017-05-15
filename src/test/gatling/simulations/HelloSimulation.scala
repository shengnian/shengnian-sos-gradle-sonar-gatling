import io.gatling.core.Predef._
import io.gatling.http.Predef._

class HelloSimulation extends Simulation {

        val httpConf = http
                .baseURL("http://localhost:8084")
                .acceptCharsetHeader("ISO-8859-1,utf-8;q=0.7,*;q=0.7")
                .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                .acceptEncodingHeader("gzip, deflate")
                .acceptLanguageHeader("fr,fr-fr;q=0.8,en-us;q=0.5,en;q=0.3")
                .disableFollowRedirect

        val headers_1 = Map("Keep-Alive" -> "115")
        // run 100 second if you want use millisecond this: during(100 millisecond)
        val scn = scenario("Shengnian Test").during(100){
          exec(http("Home page").get("/").headers(headers_1))
//              .check(status.is(200)))
            //                .feed(csv("worker_id.csv").circular)
        }

        // set thread numbers
        //  setUp(scn.inject(rampUsers(500) over(10 seconds)).protocols(httpConf))
        setUp(scn.inject(atOnceUsers(10)).protocols(httpConf))
//        setUp(scn.users(10).ramp(10).protocolConfig(httpConf))
}