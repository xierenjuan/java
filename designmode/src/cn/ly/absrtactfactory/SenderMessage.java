package cn.ly.absrtactfactory;

public class SenderMessage implements Sender {

	@Override
	public void send() {
		System.out.println("发送短信");
	}

}
