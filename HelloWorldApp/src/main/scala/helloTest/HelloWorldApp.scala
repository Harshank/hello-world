package helloTest

import org.springframework.boot.SpringApplication

object HelloWorldApp {

	def main(args: Array[String]) {
	   SpringApplication.run(classOf[HelloConfig]);
	}
}
