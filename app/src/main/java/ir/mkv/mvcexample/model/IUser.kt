package ir.mkv.mvcexample.model

interface IUser {

    fun getEmail(): String?
    fun getPassword(): String?
    fun isValid(): Int
}