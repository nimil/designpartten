package xin.nimil.design.singlework;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:14:46
 */
public class MethodTes {

    private void updateUserInfo(String userName,String address){
        userName = "lilly";
        address = "beijing";
    }

    private void updateUserInfo(String userName,String ...prop){
        userName = "gelly";
    }


    private void updateUserName(String userName){

    }
    private void updateAddress(String address){

    }

    /**
     * 接口和方法要做到单一职责
     * @param userNma
     * @param address
     * @param flag
     */
    private void updateUserInfo(String userNma,String address,Boolean flag){
        if (flag){
            //todo
        }else{

        }
    }
}
