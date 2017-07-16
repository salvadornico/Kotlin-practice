import kotlinx.html.button
import kotlinx.html.dom.create
import kotlinx.html.div
import kotlinx.html.h1
import kotlinx.html.js.onClickFunction
import kotlin.browser.document

/**
 * Created by Nico on 6 Jun 2017.
 */

fun main(args: Array<String>) {

    val root = document.getElementById("root")

    val xyz: dynamic = js("window.xyz")
    println("Variable xyz: $xyz")

    val user: dynamic = js("window.user")
    println(user.firstName)

    val myFunc: dynamic = js("window.myFunction")
    myFunc()

    val monkey: dynamic = js("monkey")
    println("Variable monkey: $monkey")

    val div = document.create.div{
        h1{
            +"Hello Kotlinx HTML"
        }
        button{
            +"Click Me"
            onClickFunction = { println("Clicked again") }
        }
    }

    root!!.appendChild(div)
}