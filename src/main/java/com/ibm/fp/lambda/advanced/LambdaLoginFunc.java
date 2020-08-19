package com.ibm.fp.lambda.advanced;

@FunctionalInterface
interface loginHandler {
    void login(Object success,Object failed);
}
@FunctionalInterface
interface successHandler{
    boolean loginSuccess();
}
@FunctionalInterface
interface failureHandler{
    boolean loginFailed();
}
class LoginLogic {
    public boolean doLogin(String username,String password){
        String response;
        if(username.equals("admin") && password.equals("admin")){
             response = "login success";
             return true;
        } else {
            response = "login failed";
            return false;
        }
    }
}
public class LambdaLoginFunc {
    public static void main(String[] args) {

    }
}
