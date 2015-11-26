package cn.updev.Users.Static.FuctionClass;

/**
 * Created by blf2 on 15-11-22.
 */

import cn.updev.Users.Static.EnumeRule.UserRule;
import cn.updev.Users.Static.UserOrGroupInterface.IUser;
import cn.updev.Users.User.UserFactory;

public class Register {
    private UserFactory userFactory = null;

    public Register(String userName, String nickName, String eMail, String passWord,String url){
        userFactory = new UserFactory(userName,nickName,eMail,passWord,url,UserRule.User);
    }

    public IUser saveUserInfo(){
        if(userFactory != null){
            return userFactory.getUser();
        }
        return null;
    }
}
