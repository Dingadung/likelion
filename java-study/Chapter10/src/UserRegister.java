import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserRegister {

    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println("회원등록");
        System.out.println("=====================================================");

        boolean register = false;

        Scanner sc = new Scanner(System.in);

        while(!register) {
            System.out.println("회원가입을 하시겠습니까?");
            System.out.println("y: 진행 n: 취소");
            System.out.print(">> ");
            String register_input = sc.nextLine();

            if(register_input.equalsIgnoreCase("y")) {
                register = true;
                System.out.println("=====================================================");
                System.out.println("회원가입이 진행됩니다.");
                System.out.println("=====================================================");
            } else if(register_input.equalsIgnoreCase("n")) {
                register = true;
                System.out.println("=====================================================");
                System.out.println("회원가입이 종료됩니다.");
                System.out.println("=====================================================");
            } else {
                System.out.println("입력값을 확인해주세요");
            }
        }

        ArrayList users = new ArrayList();

        while(true) {
            HashMap user = new HashMap();

            // id
            System.out.print("ID: ");
            String userName = sc.nextLine();

            // password
            String password = "";

            while(true) {
                System.out.print("psw: ");
                password = sc.nextLine();
                System.out.print("PW 확인: ");
                String passwordConfirm = sc.nextLine();

                if(password.equals(passwordConfirm)) {
                    break;
                } else {
                    System.out.println("=====================================================");
                    System.out.println("패스워드가 일치하지 않습니다.");
                    System.out.println("패스워드를 다시 입력해주세요.");
                    System.out.println("=====================================================");
                }
            }

            // 이름
            System.out.print("name: ");

            String name = sc.nextLine();

            // 생년월일
            String birth_date = "";
            while (true) {
                System.out.print("birth_date: ");
                birth_date = sc.nextLine();
                if(birth_date.length() == 6) {
                    break;
                } else {
                    System.out.println("=====================================================");
                    System.out.println("생년월일이 일치하지 않습니다.");
                    System.out.println("생년월일을 다시 입력해주세요.");
                    System.out.println("=====================================================");
                }
            }

            // 이메일
            System.out.print("이메일: ");
            String email = sc.nextLine();

            user.put("userName", userName);
            user.put("password", password);
            user.put("name", name);
            user.put("birth_date", birth_date);
            user.put("email", email);

            users.add(user);
            System.out.println("=====================================================");
            System.out.println(user.get("name"));
            System.out.println(user.get("userName"));
            System.out.println(user.get("email"));
            System.out.println(user.get("birth_date"));
            System.out.println(user.get("password"));
            System.out.println("=====================================================");


            System.out.println("회원가입을 종료 하시겠습니까?");
            System.out.println("y: 진행 n: 취소");
            System.out.print(">> ");
            String register_input = sc.nextLine();

            if(register_input.equalsIgnoreCase("y")) {
                break;
            } else if(register_input.equalsIgnoreCase("n")) {
                continue;
            } else {
                System.out.println("입력값을 확인해주세요");
            }
        }
    }
}
