package ir.mkv.mvcexample.controller

import ir.mkv.mvcexample.model.User
import ir.mkv.mvcexample.view.ILoginView

class LoginController(
    private val loginView: ILoginView
) : ILoginController {
    override fun onLogin(email: String?, password: String?) {
        val user = User(email, password)

        when (user.isValid()) {
            0 -> loginView.onLoginError("Please enter Email")
            1 -> loginView.onLoginError("Please enter a valid Email")
            2 -> loginView.onLoginError("Please enter Password")
            3 -> loginView.onLoginError("Please enter Password greater than 6 char")
            else -> loginView.onLoginSuccess("Login Successful")
        }
    }
}