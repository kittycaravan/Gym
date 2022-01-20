package com.peisia.gym.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.peisia.gym.data.Member;

public class MenuMemberDel {
	
	public void proc(ArrayList<Member> members) {
		System.out.println("삭제할 회원 이름을 입력:");
		Scanner sc = new Scanner(System.in);
		String delName = sc.next();
		int delIndex = -1;
		
		//검색
		for(int i=0;i<members.size();i++) {
			if(members.get(i).getName().equals(delName)) {
				delIndex = i;
				break;
			}
		}				
		
		if(delIndex == -1) {
			System.out.println(delName + " 회원은 없습니다.");
		} else {
			members.remove(delIndex);	// 삭제
			System.out.println(delName + " 회원 정보가 삭제되었습니다.");
		}		
	}

}
