package study;

import java.util.HashMap;
import java.util.Map;

public class UserInformation {
    private final UserInputValidate userInputValidate;
    private final Map<String, String> userIdList;


    public UserInformation() {
        this.userIdList = new HashMap<>();
        this.userInputValidate = new UserInputValidate();
    }

    public void userInput() {
        System.out.println("아이디를 입력해 주세요.");
        String userId = userInputValidate.inputId(userIdList);

        System.out.println("비밀번호를 입력해 주세요.");
        String userPassword = userInputValidate.inputPassword();

        if (userId != null && userPassword != null) {
            userIdList.put(userId, userPassword);
        }

    }

    public Map<String, String> getUserIdList() {
        return userIdList;
    }


}
