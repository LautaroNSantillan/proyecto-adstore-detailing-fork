package mindhub.adstoreDetailing.servicios.envioEmail.impl;

import mindhub.adstoreDetailing.servicios.ExportadorPDF;
import mindhub.adstoreDetailing.servicios.envioEmail.EmailSenderService;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.util.ByteArrayDataSource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Service
public class EmailSenderServiceImpl implements EmailSenderService {
    private final JavaMailSender mailSender;
    private final ExportadorPDF exportadorPDF;

    public EmailSenderServiceImpl(JavaMailSender mailSender, ExportadorPDF exportadorPDF) {
        this.mailSender = mailSender;
        this.exportadorPDF = exportadorPDF;
    }

    @Override
    public void enviarEmail(String asunto, String mensaje, String para) throws MessagingException, IOException {
       MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

        exportadorPDF.generarPdf();

        mimeMessageHelper.setFrom("adstoreDetailing23@gmail.com");
        mimeMessageHelper.setTo(para);
        mimeMessageHelper.setSubject(asunto);
        mimeMessageHelper.setText(mensaje);

        File file = new File("sample.pdf");
        byte[] bytes = Files.readAllBytes(file.toPath());
        ByteArrayDataSource pdfDataSource = new ByteArrayDataSource(bytes, "application/pdf");

        // add the attachment to the email
        mimeMessageHelper.addAttachment("sample.pdf", pdfDataSource);

        this.mailSender.send(mimeMessage);

    }

    public void a2(String asunto, String mensaje, String para) throws MessagingException, IOException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

        exportadorPDF.generarPdf();

        mimeMessageHelper.setFrom("adstoreDetailing23@gmail.com");
        mimeMessageHelper.setTo(para);
        mimeMessageHelper.setSubject(asunto);
        mimeMessageHelper.setText(mensaje);

        //FileSystemResource fileSystemResource = new FileSystemResource(new File());
        File file = new File("sample.pdf");
        byte[] bytes = Files.readAllBytes(file.toPath());
        ByteArrayDataSource pdfDataSource = new ByteArrayDataSource(bytes, "application/pdf");

// add the attachment to the email
        mimeMessageHelper.addAttachment("sample.pdf", pdfDataSource);
        //mimeMessageHelper.addAttachment("sample.pdf", bytes);

        this.mailSender.send(mimeMessage);
    }
}