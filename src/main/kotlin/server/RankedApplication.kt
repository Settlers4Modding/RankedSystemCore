package server

import io.quarkus.runtime.Quarkus
import io.quarkus.runtime.QuarkusApplication
import io.quarkus.runtime.annotations.QuarkusMain
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition
import org.eclipse.microprofile.openapi.annotations.info.Info
import org.eclipse.microprofile.openapi.annotations.security.SecurityRequirement
import org.eclipse.microprofile.openapi.annotations.tags.Tag
import javax.ws.rs.core.Application

@OpenAPIDefinition(
    tags = [Tag(name = "matches", description = "The path over which the games are managed.")],
    info = Info(title = "Open API Swagger Demo", version = "1.0")
)
class RankedApplication : QuarkusApplication {

    override fun run(vararg args: String?): Int {
        Quarkus.waitForExit()
        return 0
    }
}

@QuarkusMain
class Main {

    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            println("ARGS: ${args.size}")
            Quarkus.run(RankedApplication::class.java, *args)
        }
    }

}