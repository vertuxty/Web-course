package ru.itmo.wp.form;

import javax.persistence.Lob;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@SuppressWarnings("unused")
public class NoticeCredentials {
    @Lob
    @NotNull
    @NotEmpty(message = "Content should not be empty, or have only whitespaces!")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
