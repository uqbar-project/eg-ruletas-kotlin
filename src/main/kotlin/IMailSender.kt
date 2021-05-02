interface IMailSender {
    fun sendMail(mail: Mail)
}

data class Mail(val to: String, val subject: String) {}