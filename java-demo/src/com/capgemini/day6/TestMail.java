package com.capgemini.day6;

import java.util.Properties;

//import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.activation.*;

public class TestMail {
	
	private static final String SMTP_HOST_NAME = "smtpout.secureserver.net"; //smtp URL
	private static final int SMTP_HOST_PORT = 465; //port number
	private static String SMTP_AUTH_USER = "neha@fitnessfunfactory.in"; //email_id of sender
	private static String SMTP_AUTH_PWD = "nehapant@123"; //password of sender email_id


	public static void main(String[] args) {
		
		try {
			Class.forName("javax.mail.InternetAddress");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		System.out.println("tst");
		
		try {
		    Properties props = new Properties();
		    props.put("mail.transport.protocol", "smtp");
		    props.put("mail.smtps.host", SMTP_HOST_NAME);
		    props.put("mail.smtps.auth", "true");

		    Session mailSession = Session.getDefaultInstance(props);
		    mailSession.setDebug(true);
		    Transport transport = mailSession.getTransport();
		    MimeMessage message = new MimeMessage(mailSession);

		    message.setSubject("my subject");
		    message.setContent("Message that you want to send", "text/html");
		    InternetAddress[] from = InternetAddress.parse("neha@fitnessfunfactory.in");//Your domain email
		    message.addFrom(from);
		    message.addRecipient(Message.RecipientType.TO, new InternetAddress("puneetvashisht@gmail.com")); //Send email To (Type email ID that you want to send)

		    transport.connect(SMTP_HOST_NAME, SMTP_HOST_PORT, SMTP_AUTH_USER, SMTP_AUTH_PWD);
		    transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
		    transport.close();
		} catch (Exception e) {
		 e.printStackTrace();
		}
	}

}
