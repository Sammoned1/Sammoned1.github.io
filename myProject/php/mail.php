<?php 

require_once('phpmailer/PHPMailerAutoload.php');
$mail = new PHPMailer;
$mail->CharSet = 'utf-8';

$name = $_POST['user_name_1'];
$phone = $_POST['user_phone'];
//$email = $_POST['user_email'];
$message = $_POST['message_1'];

//$mail->SMTPDebug = 3;                               // Enable verbose debug output

$mail->isSMTP();                                      // Set mailer to use SMTP
$mail->Host = 'smtp.mail.ru';  																							// Specify main and backup SMTP servers
$mail->SMTPAuth = true;                               // Enable SMTP authentication
$mail->Username = 'artem.korovnikov@mail.ru'; // Ваш логин от почты с которой будут отправляться письма
$mail->Password = '$197$Ewqdsacxz$197$'; // Ваш пароль от почты с которой будут отправляться письма
$mail->SMTPSecure = 'ssl';                            // Enable TLS encryption, `ssl` also accepted
$mail->Port = 465; // TCP port to connect to / этот порт может отличаться у других провайдеров

$mail->setFrom('artem.korovnikov@mail.ru'); // от кого будет уходить письмо?
$mail->addAddress('sammoned1@gmail.com');     // Кому будет уходить письмо 
//$mail->addAddress('ellen@example.com');               // Name is optional
//$mail->addReplyTo('info@example.com', 'Information');
//$mail->addCC('cc@example.com');
//$mail->addBCC('bcc@example.com');
//$mail->addAttachment('/var/tmp/file.tar.gz');         // Add attachments
//$mail->addAttachment('/tmp/image.jpg', 'new.jpg');    // Optional name
$mail->isHTML(true);                                  // Set email format to HTML

$mail->Subject = 'Клиент оставил заявку!';
$mail->Body    = 'Заказчик по имени ' .$name . ' хочет сделать свой сайт<br>Телефон : ' .$phone .'<br>Сообщение : ' .$message;
$mail->AltBody = '';

if(!$mail->send()) {
    return false;
} else {
    return true;
}
?>