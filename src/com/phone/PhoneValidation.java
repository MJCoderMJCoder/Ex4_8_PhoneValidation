package com.phone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneValidation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean contiGo = true;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		//\\d：代表0~9的任何一个数字；[036-9]：表示匹配0、3、6到9的任意一个字符；\\d{8}：\\d出现8次
		String regex = "(13\\d|15[036-9]|18[389])\\d{8}";
		String phoneNumber = "";
		while(contiGo) {
			System.out.println("请输入手机号码：");
			phoneNumber = buf.readLine();
			boolean match = phoneNumber.matches(regex);
			if(match){
				System.out.println(phoneNumber + "是合法手机号码");
				break;
			} else
				System.out.println(phoneNumber + "不是合法手机号码");
		}
				

	}

}
