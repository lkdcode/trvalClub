package study;

import java.util.Map;
import java.util.Scanner;

public class UserInputValidate {
    private final int MAXIMUM_LENGTH = 20;
    private final int MINIMUM_LENGTH = 4;
    private Scanner scanner;

    public UserInputValidate() {
        this.scanner = new Scanner(System.in);
    }

    public String inputId(Map<String, String> userIdList) {
        return idValidate(scanner.nextLine(), userIdList);
    }


    public String inputPassword() {
        return passwordValidate(scanner.nextLine());
    }


    private String idValidate(String inputId, Map<String, String> userIdList) {
        // 중복 값 검사
        if (isDuplication(inputId, userIdList)) {
            return null;
        }
        // 길이 제한
        if (isLength(inputId)) {
            return null;
        }
        // 오직 영어
        if (isOnlyEnglish(inputId)) {

        }
        return inputId;
    }

    private boolean isOnlyEnglish(String inputId) {
        for (int i = 0; i < inputId.length(); i++) {

        }
        return false;
    }

    private boolean isDuplication(String inputId, Map<String, String> userIdList) {
        return userIdList.containsKey(inputId);
    }

    private boolean isLength(String input) {
        return input.length() < MINIMUM_LENGTH || input.length() > MAXIMUM_LENGTH;
    }


    private String passwordValidate(String inputPassword) {
        // 대, 소문자 포함
        if (isUpperLower(inputPassword)) {
            return null;
        }
        // 특수 문자 포함


        // 반복된 값 포함


        // 길이
        if (isLength(inputPassword)) {
            return null;
        }

        return inputPassword;
    }


    private boolean isUpperLower(String inputPassword) {
        if (inputPassword.toUpperCase().equals(inputPassword)) {
            return true;
        }

        if (inputPassword.toLowerCase().equals(inputPassword)) {
            return true;
        }

        return false;

    }


}