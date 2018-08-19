package com.jm2008.learn.javamail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailThruTLS {

	public static void main(String[] args) {

		String from = "infoadvancejava@gmail.com";
		String to = "satish.gouda100@gmail.com";
		String cc = "patange.sai@gmail.com,saifmohammed888@gmail.com,tublu92@gmail.com,rishanth.96@gmail.com";
		String bcc = "atul.wnw@gmail.com";
		String subject = "Test - Learning Send Mail thru TLS";
		String message = "This is test mail. \n Delete it after receiving.";

		String userName = "infoadvancejava@gmail.com";
		String password = "infoadvancejava@123";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "25");
		props.put("mail.smtp.starttls.enable", "true");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, password);
			}
		});
		
	
		try {
			Message mail = new MimeMessage(session);
			mail.setFrom(new InternetAddress(from));
			mail.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			mail.setRecipients(Message.RecipientType.CC, InternetAddress.parse(cc));
			mail.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(bcc));
			mail.setSubject(subject);
			mail.setText(message);
			
			Transport.send(mail);
			System.out.println("Sent!!!");
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}

}
