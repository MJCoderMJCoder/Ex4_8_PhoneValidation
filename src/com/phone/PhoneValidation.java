package com.phone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneValidation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean contiGo = true;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		//\\d������0~9���κ�һ�����֣�[036-9]����ʾƥ��0��3��6��9������һ���ַ���\\d{8}��\\d����8��
		String regex = "(13\\d|15[036-9]|18[389])\\d{8}";
		String phoneNumber = "";
		while(contiGo) {
			System.out.println("�������ֻ����룺");
			phoneNumber = buf.readLine();
			boolean match = phoneNumber.matches(regex);
			if(match){
				System.out.println(phoneNumber + "�ǺϷ��ֻ�����");
				break;
			} else
				System.out.println(phoneNumber + "���ǺϷ��ֻ�����");
		}
				

	}

}
