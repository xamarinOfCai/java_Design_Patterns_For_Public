package Caijingjin.Chapter28;

public class Client {


    public static void main(String[] args) {
        //从工厂里面或得一个对象
        SignInfo signInfo = SignInfoFactory.getSignInfo();

        //do something


        for(int i= 0; i < 4; i++){
            String subject = "科目"+i;
            for(int j =0; j< 30; j++){
                String key = subject +"考试地点"+j;
                SignInfoFactory.getSignInfo(key);
            }
        }

        SignInfo signInfo1 = SignInfoFactory.getSignInfo("科目1考试地点1");
    }
}
