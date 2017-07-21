package com.osterhoutgroup.sharedlibraryplugin.http;

import com.osterhoutgroup.sharedlibraryplugin.enumerations.EmailType;
import org.springframework.util.StringUtils;

/**
 * Email service request contract class.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class EmailRequest {

    /**
     * A list of TO recipients.
     */
    private String[] to;
    /**
     * A list of CC recipients.
     */
    private String[] cc;
    /**
     * A list of BCC recipients.
     */
    private String[] bcc;
    /**
     * Email subject text.
     */
    private String subject;
    /**
     * Email body text.
     */
    private String message;
    /**
     * Email type, needs to be defined if email templates need to be used.
     * Default value is {@link EmailType#PLAIN}, which indicates that simple
     * text mail will be sent.
     */
    private EmailType type;

    /**
     * Default email request constructor, present only for serialization purposes.
     */
    @Deprecated
    public EmailRequest() {
    }

    /**
     * {@link EmailRequest} constructor with all possible arguments.
     *
     * @param type    Email type which is to be sent.
     * @param to      A list of TO email recipients.
     * @param cc      A list of CC email recipients.
     * @param bcc     A list of BCC email recipients.
     * @param subject Email message subject.
     * @param message Email message body.
     */
    public EmailRequest(EmailType type, String[] to, String[] cc, String[] bcc, String subject, String message) {
        this.type = type;
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
        this.subject = subject;
        this.message = message;

        /**
         * if {@link EmailRequest#type} is {@link EmailType#PLAIN} validate To address list, subject and message body,
         * if not those can be omitted since template subject and body will be used.
         */
        if (this.type != EmailType.PLAIN)
            return;

        if (to == null || to.length == 0) throw new RuntimeException("At least one email recipient must be defined.");
        if (!StringUtils.hasText(subject)) throw new RuntimeException("Message subject must be defined.");
        if (!StringUtils.hasText(message)) throw new RuntimeException("Message body must be defined.");
    }

    /**
     * {@link EmailRequest} constructor indented to be used for creation of email body from predefined templates.
     *
     * @param type    Email type which is to be sent.
     * @param to      A list of TO email recipients.
     * @param message Email message body variable which is to be used by templating engine.
     */
    public EmailRequest(EmailType type, String[] to, String message) {
        this(type, to, null, null, null, message);
    }

    public static EmailRequest newErrorReport(String errorMessage) {
        return new EmailRequest(EmailType.ERROR_REPORT, null, null, null, null, errorMessage);
    }

    //  region Getters and setters

    public String[] getTo() {
        return to;
    }

    public void setTo(String[] to) {
        this.to = to;
    }

    public String[] getCc() {
        return cc;
    }

    public void setCc(String[] cc) {
        this.cc = cc;
    }

    public String[] getBcc() {
        return bcc;
    }

    public void setBcc(String[] bcc) {
        this.bcc = bcc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public EmailType getType() {
        return type;
    }

    public void setType(EmailType type) {
        this.type = type;
    }

    /**
     * Gets a flag which indicates if email body content is html string. All email types
     * except {@link EmailType#PLAIN} will be based on html templates.
     *
     * @return A flag indicating if email body content is html string.
     */
    public boolean isHtml() {
        return this.getType() != EmailType.PLAIN;
    }

    /**
     * Gets a flag which indicates if content will be sent as multipart request. All email types
     * except {@link EmailType#PLAIN} will be based on html templates, which contain embedded images
     * which require this flag to be set to true.
     *
     * @return A flag indicating if content will be sent as multipart request.
     */
    public boolean isMultipart() {
        return this.getType() != EmailType.PLAIN;
    }

    //  endregion
}
