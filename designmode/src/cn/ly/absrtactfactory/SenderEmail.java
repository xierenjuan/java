package cn.ly.absrtactfactory;

public class SenderEmail implements Sender {

	@Override
	public void send() {
		System.out.println("发送邮件");
	}

}
