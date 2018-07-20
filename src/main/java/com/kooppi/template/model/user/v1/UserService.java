package com.kooppi.template.model.user.v1;

import com.kooppi.template.model.user.IUserService;

public class UserService implements IUserService {

	@Override
	public String getUserName() {
		return "SamuelV1";
	}

}
