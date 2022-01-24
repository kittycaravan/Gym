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
		} else {	////회원수정 처리
			Member m = members.get(searchIndex);	//정보 가져오기
			
			////수정할꺼 선택받기
			String name,tel,sex;
			boolean isNotEnd = true;
			Select:
			while(isNotEnd) {
				m.info();	//정보 보여주기
				System.out.print("어떤 항목을 수정할까요? (1:이름, 2:전화번호, 3:성별, x:취소)");
				String cmd = sc.next();
				switch(cmd) {
				case "1":
					System.out.print("이름을 새로 입력해주세요:");
					name = sc.next();	// 입력 - 이름
					m.setName(name);
					System.out.println("이름이 수정되었습니다.");
					break;
				case "2":
					System.out.print("전화번호를 새로 입력해주세요:");
					tel = sc.next();	// 입력 - 전번
					System.out.println("전화번호가 수정되었습니다.");
					m.setTel(tel);
					break;
				case "3":
					System.out.print("성별을 새로 입력해주세요:");
					sex = sc.next();	// 입력 - 성
					m.setSex(sex);
					System.out.println("성별이 수정되었습니다.");
					break;
				case "x":
					break Select;
				}
			}
			
		}				
	}

}
