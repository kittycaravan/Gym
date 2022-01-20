package com.peisia.gym.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.peisia.gym.data.Member;

public class MenuMemberEdit {
	
	public void proc(ArrayList<Member> members) {
		System.out.println("수정할 회원 이름을 입력:");
		Scanner sc = new Scanner(System.in);
		String searchName = sc.next();
		int searchIndex = -1;
		
		//검색
		for(int i=0;i<members.size();i++) {
			if(members.get(i).getName().equals(searchName)) {
				searchIndex = i;
				break;
			}
		}				
		
		if(searchIndex == -1) {
			System.out.println(searchName + " 회원은 없습니다.");
		} else {
			//회원수정 처리
			//입력받기
			System.out.print("이름을 새로 입력해주세요:");
			String name = sc.next();
			System.out.print("전화번호를 새로 입력해주세요:");
			String tel = sc.next();
			System.out.print("성별을 새로 입력해주세요:");
			String sex = sc.next();
			//입력 처리
			Member m = members.get(searchIndex);
			m.setName(name);
			m.setTel(tel);
			m.setSex(sex);
			System.out.println(searchName + " 회원 정보가 수정되었습니다.");
		}				
	}

}
