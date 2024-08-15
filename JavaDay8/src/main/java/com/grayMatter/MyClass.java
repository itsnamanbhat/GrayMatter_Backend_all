package com.grayMatter;

public class  MyClass <T>{
	T msg;
	public void  setMessage(T msg) {
		this.msg= msg;
	}
	
	public void sendMsg() {
		System.out.println("From class myClass to reciever "+msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass <String > strMsg= new MyClass<String>();
		strMsg.setMessage("You have been called");
		strMsg.sendMsg();
	}

}
