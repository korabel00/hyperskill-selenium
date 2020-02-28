package Hyperskill.strategy;

interface SendingMethod {

    void send(String from, String to, String msg);
}

class SmsSendingMethod implements SendingMethod {

    @Override
    public void send(String from, String to, String msg) {
        System.out.println(String.format("send SMS from '%s' to '%s'", from, to));
    }
}

class EmailSendingMethod implements SendingMethod {

    @Override
    public void send(String from, String to, String msg) {
        System.out.println(String.format("Email from '%s' to '%s'", from, to));
    }
}

class MessageSender {

    private SendingMethod method;

    // it may contain additional fields as well

    public void setMethod(SendingMethod method) {
        this.method = method;
    }

    public void send(String from, String to, String msg) {
        this.method.send(from, to, msg);
    }
}

class RunClass {
    public static void main(String[] args) {
        MessageSender messageSender = new MessageSender();
        messageSender.setMethod(new EmailSendingMethod());
        messageSender.send("John", "Mary", "I love you!");

        messageSender.setMethod(new SmsSendingMethod());
        messageSender.send("John", "Mary", "I hate you!");
    }
}