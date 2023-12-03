package ir.mkv.mvcexample.view

interface ILoginView {
    fun onLoginError(message: String?)
    fun onLoginSuccess(message: String?)
}