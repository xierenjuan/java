package cn.ly.absrtactfactory;

public class SenderMessageFactory implements Factory {

	@Override
	public Sender produce() {
		return new SenderMessage();
	}

}
