package cn.ly.absrtactfactory;

public class SenderEmailFactory implements Factory{

	@Override
	public Sender produce() {
		return new SenderEmail();
	}

}
