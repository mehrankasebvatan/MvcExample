package ir.mkv.mvcexample

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ir.mkv.mvcexample.controller.ILoginController
import ir.mkv.mvcexample.controller.LoginController
import ir.mkv.mvcexample.view.ILoginView

class MainActivity : AppCompatActivity(), ILoginView {

    var email: EditText? = null
    var password: EditText? = null
    var loginButton: Button? = null
    var loginPresenter: ILoginController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email = findViewById(R.id.edtUserName)
        password = findViewById(R.id.edtPassword)
        loginButton = findViewById(R.id.mButtonLogin)
        loginPresenter = LoginController(this)

        loginButton?.setOnClickListener {
            (loginPresenter as LoginController).onLogin(
                email?.text.toString(),
                password?.text.toString()
            )
        }


    }

    override fun onLoginError(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onLoginSuccess(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}