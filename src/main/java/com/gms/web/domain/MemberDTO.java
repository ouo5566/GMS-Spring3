package com.gms.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component 
@Data
public class MemberDTO {
	private String memberId, teamId, name, ssn, roll, password, age, gender, subject;
}

/*
 line 7 : Bean으로 사용하겠다.
 line 8 : getter, setter를 하겠다.
 */